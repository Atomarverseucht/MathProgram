
package MathProgram;

import java.util.Scanner;

/**
 * Histogramm liest ganze Zahlen zwischen 1 und 6 ein und
 * gibt deren H&auml;ufigkeitsverteilung als Histogramm aus.
 * @author Atom
 * @author Guakocius
 * @version 01.11.2024
 */
public final class UserInterface {
    private UserInterface() { }

    static String operator = "";

    private static final Scanner INPUT = new Scanner(System.in);
    /**
     * main is the beginning of the program.
     * @param args isn't used.
     */
    public static void main(String[] args) {

        MathProgram.Number number = new Number(0,0);
        // Scans in the user written complex numbers and the term operator
        // to calculate them and print them out
        System.out.println("\nComplex Numbers: a + ib");
        System.out.println("Please enter in the real part of the first number: ");
        number.real = INPUT.nextDouble();
    	System.out.println("Please put in the imaginary part: ");
        number.imaginary = INPUT.nextDouble();
        System.out.println("Please put in a term operator: ");
        operator = INPUT.next();
        Calculator.number.add(number);
        Calculator.operator.add(operator);

        // TODO: Find an elegant way to display imaginary numbers because of i being a char
        // TODO and imaginary being a double, use i or a library which puts i into a complex
        // TODO: number or implement it ourselves.
        // System.out.println("The result is: " + numbers[0].real + term + numbers[0].imaginary + "i");

    }
}
