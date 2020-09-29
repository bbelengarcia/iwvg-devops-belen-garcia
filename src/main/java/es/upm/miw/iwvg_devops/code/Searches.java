package es.upm.miw.iwvg_devops.code;

import java.util.Collection;
import java.util.stream.Stream;

class Searches {

    Stream<String> findUserFamilyNameInitialBySomeProperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(Fraction::isProper))
                .map(User::initials);
    }

    Stream<Double> findDecimalImproperFractionByUserName(String name) {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFamilyName().equals(name))
                .flatMap(user -> user.getFractions().stream()
                        .filter(Fraction::isImproper))
                .map(Fraction::decimal);
    }

    Fraction findFractionMultiplicationByUserFamilyName(String familyName) {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFamilyName().equals(familyName))
                .map(User::getFractions)
                .flatMap(Collection::stream)
                .reduce(new Fraction(), Fraction::multiply);
    }

    Fraction findFirstProperFractionByUserId(String id) {
        return new UsersDatabase().findAll()
                .filter(user -> user.getId().equals(id))
                .map(User::getFractions)
                .filter(fractions -> fractions.stream().anyMatch(Fraction::isProper))
                .flatMap(Collection::stream)
                .findFirst()
                .orElse(new Fraction(0, 0));
    }

}
