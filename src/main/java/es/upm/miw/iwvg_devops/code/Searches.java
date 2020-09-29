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


}
