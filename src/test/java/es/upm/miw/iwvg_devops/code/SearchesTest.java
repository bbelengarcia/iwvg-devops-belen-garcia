package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    @Test
    public void testSearchesFindUserFamilyNameInitialBySomeProperFraction() {
        assertEquals(List.of("O.", "A.", "O.", "A."), new Searches().findUserFamilyNameInitialBySomeProperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    public void testSearchesFindDecimalImproperFractionByUserName() {
        assertEquals(List.of(), new Searches().findDecimalImproperFractionByUserName("Antonio")
                .collect(Collectors.toList()));
    }


}
