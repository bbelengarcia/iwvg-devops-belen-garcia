package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    private Fraction fraction;
    private Fraction fractionEmptyConstructor;

    @BeforeEach
    void before() {
        fraction = new Fraction(1, 2);
        fractionEmptyConstructor = new Fraction();
    }

    @Test
    void testFractionNumerator() {
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fractionEmptyConstructor.getNumerator());
    }

    @Test
    void testFractionSetNumerator() {
        fraction.setNumerator(5);
        assertEquals(5, fraction.getNumerator());
    }

    @Test
    void testFractionDenominator() {
        assertEquals(2, fraction.getDenominator());
        assertEquals(1, fractionEmptyConstructor.getDenominator());
    }

    @Test
    void testFractionSetDenominator() {
        fraction.setDenominator(8);
        assertEquals(8, fraction.getDenominator());
    }

    @Test
    void testFractionDecimal() {
        assertEquals(0.5, fraction.decimal(), 10e-5);
    }

    @Test
    void testFractionToString() {
        assertEquals("Fraction{" +
                "numerator=" + 1 +
                ", denominator=" + 2 +
                '}', fraction.toString());
    }
}
