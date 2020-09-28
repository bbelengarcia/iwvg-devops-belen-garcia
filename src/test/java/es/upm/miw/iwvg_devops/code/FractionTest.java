package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionTest {

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
    void testFractionIsProper() {
        assertEquals(true, fraction.isProper());
        assertEquals(false, fractionEmptyConstructor.isProper());
    }

    @Test
    void testFractionIsImproper() {
        assertEquals(false, fraction.isImproper());
        assertEquals(false, fractionEmptyConstructor.isImproper());
    }

    @Test
    void testFractionIsEquivalent() {
        assertEquals(false, fraction.isEquivalent(fractionEmptyConstructor));
        assertEquals(true, fraction.isEquivalent(new Fraction(2, 4)));
    }

    @Test
    void testFractionAdd() {
        assertEquals(3, fraction.add(fractionEmptyConstructor).getNumerator());
        assertEquals(2, fraction.add(fractionEmptyConstructor).getDenominator());
    }

    @Test
    void testFractionMultiply() {
        assertEquals(1, fraction.multiply(fractionEmptyConstructor).getNumerator());
        assertEquals(2, fraction.multiply(fractionEmptyConstructor).getDenominator());
    }

    @Test
    void testFractionDivide() {
        assertEquals(1, fraction.divide(fractionEmptyConstructor).getNumerator());
        assertEquals(2, fraction.divide(fractionEmptyConstructor).getDenominator());
    }

    @Test
    void testFractionToString() {
        assertEquals("Fraction{" +
                "numerator=" + 1 +
                ", denominator=" + 2 +
                '}', fraction.toString());
    }
}
