package QueNo3;
public class TEST {
    public static void main(String[] args) {
        Fraction frac1= new Fraction(1, 4);
        Fraction frac2= new Fraction(3, 5);

        System.out.println("1st Fraction: "+frac1+" and "+"2nd Fraction: "+frac2);
        
        frac1.ADD(frac2);
        System.out.println("ADDITION: "+frac1);
        frac1.SUBTRACT(frac2);
        System.out.println("SUBTRACTION: " + frac1);
        frac1.MULTIPLY(frac2);
        System.out.println("MULTIPLICATION: " + frac1);
        frac1.DIVIDE(frac2);
        System.out.println("DIVISION: " + frac1);
    }
}