package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    @Test
    void testSearchesFindUserFamilyNameInitialBySomeProperFraction() {
        assertEquals(List.of("O.", "A.", "O.", "A."), new Searches().findUserFamilyNameInitialBySomeProperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testSearchesFindDecimalImproperFractionByUserName() {
        assertEquals(List.of(2.0, 1.3333333333333333), new Searches().findDecimalImproperFractionByUserName("Ana")
                .collect(Collectors.toList()));
    }

    @Test
    void testSearchesFindFractionMultiplicationByUserFamilyName() {
        assertEquals(12, new Searches().findFractionMultiplicationByUserFamilyName("López").getNumerator());
        assertEquals(-240, new Searches().findFractionMultiplicationByUserFamilyName("López").getDenominator());
    }

    @Test
    void testSearchesFindFirstProperFractionByUserId(){
        assertEquals(0, new Searches().findFirstProperFractionByUserId("1").getNumerator());
        assertEquals(1, new Searches().findFirstProperFractionByUserId("1").getDenominator());
    }


}
