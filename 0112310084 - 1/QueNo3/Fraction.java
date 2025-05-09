package QueNo3;

class Fraction{
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if(denominator!=0){
            this.denominator = denominator;
        }
        calculate();   
    }
    
    private int GCD(int x, int y) {
        while (y != 0) {
            int check = y;
            y = x % y;
            x = check;
        }
        return x;
    }
    private void calculate(){
        int GCD = GCD(Math.abs(numerator), Math.abs(denominator));
        numerator /= GCD;
        denominator /= GCD;
        if(denominator<0){
            numerator = -numerator;
            denominator = -denominator;
        }
    }
    public String toString(){
        return getNumerator() + "/" +getDenominator();
    }

    public void ADD(Fraction fraction){
        numerator = numerator * fraction.denominator + fraction.numerator * denominator;
        denominator = denominator * fraction.denominator;
        calculate();
    }
    public void SUBTRACT(Fraction fraction) {
        numerator = numerator * fraction.denominator - fraction.numerator * denominator;
        denominator = denominator * fraction.denominator;
        calculate();
    }
    public void MULTIPLY(Fraction fraction){
        numerator *=fraction.numerator;
        denominator *=fraction.denominator;
        calculate();
    }
    public void DIVIDE(Fraction fraction){
        if(fraction.numerator!=0){
            numerator *=fraction.denominator;
            denominator *=fraction.numerator;
            calculate();
        }
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
    
}