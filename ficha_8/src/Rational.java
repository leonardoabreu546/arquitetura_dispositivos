public class Rational implements Comparable<Rational> {
    private int numerator;
    private int denominator;

    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Rational rational = (Rational) obj;
        return numerator == rational.numerator
                && denominator == rational.denominator;
    }

    @Override
    public int compareTo(Rational rational) {
        double value = (double) numerator / denominator;
        double otherValue = (double) rational.numerator / rational.denominator;
        return Double.compare(value, otherValue);
    }

    @Override
    public int hashCode() {
        return 31 * numerator + denominator;
    }
}


