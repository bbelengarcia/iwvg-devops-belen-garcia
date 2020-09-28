package es.upm.miw.iwvg_devops.code;

public class Fraction {
    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public Boolean isProper() {
        return this.getNumerator() < this.getDenominator();
    }

    public Boolean isImproper() {
        return this.getNumerator() > this.getDenominator();
    }

    public Boolean isEquivalent(Fraction fraction) {
        return this.getNumerator() * fraction.getDenominator() == this.getDenominator() * fraction.getNumerator();
    }

    public Fraction add(Fraction fraction) {
        return new Fraction(fraction.getNumerator() * this.getDenominator() + this.getNumerator() * fraction.getDenominator(), fraction.getDenominator() * this.getDenominator());
    }

    public Fraction multiply(Fraction fraction) {
        return new Fraction(fraction.getNumerator() * this.getNumerator(), fraction.getDenominator() * this.getDenominator());
    }

    public Fraction divide(Fraction fraction) {
        return new Fraction(fraction.getDenominator() * this.getNumerator(), fraction.getNumerator() * this.getDenominator());
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
