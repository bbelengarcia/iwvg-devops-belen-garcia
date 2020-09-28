package es.upm.miw.iwvg_devops.code;

import org.apache.logging.log4j.LogManager;

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


}
