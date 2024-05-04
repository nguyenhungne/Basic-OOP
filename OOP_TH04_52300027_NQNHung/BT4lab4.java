public class BT4lab4 {
    public class Fraction {
        private int numerator;
        private int denominator;
    
        public Fraction() {
            this.numerator = 0;
            this.denominator = 1;
        }
    
        public Fraction(int num, int den) {
            this.numerator = num;
            if (den != 0) {
                this.denominator = den;
            } else {
                throw new IllegalArgumentException("Mẫu số không thể bằng 0.");
            }
        }
    
        public Fraction(Fraction f) {
            this.numerator = f.numerator;
            this.denominator = f.denominator;
        }
    
        public Fraction add(Fraction f) {
            int newNumerator = this.numerator * f.denominator + f.numerator * this.denominator;
            int newDenominator = this.denominator * f.denominator;
            return new Fraction(newNumerator, newDenominator);
        }
    
        public Fraction sub(Fraction f) {
            int newNumerator = this.numerator * f.denominator - f.numerator * this.denominator;
            int newDenominator = this.denominator * f.denominator;
            return new Fraction(newNumerator, newDenominator);
        }
    
        public Fraction mul(Fraction f) {
            return new Fraction(this.numerator * f.numerator, this.denominator * f.denominator);
        }
    
        public Fraction div(Fraction f) {
            return new Fraction(this.numerator * f.denominator, this.denominator * f.numerator);
        }
    
        public void reduce() {
            int gcd = gcd(this.numerator, this.denominator);
            this.numerator /= gcd;
            this.denominator /= gcd;
        }
    
        private int gcd(int a, int b) {
            while (b != 0) {
                int t = b;
                b = a % b;
                a = t;
            }
            return a;
        }
    
        @Override
        public String toString() {
            return "Fraction[num=" + this.numerator + ", den=" + this.denominator + "]";
        }
    }
}
