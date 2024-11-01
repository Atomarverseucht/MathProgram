//package MathProgramme;

import java.util.Scanner;
/**
 * Histogramm liest ganze Zahlen zwischen 1 und 6 ein und
 * gibt deren H&auml;ufigkeitsverteilung als Histogramm aus.
 * @author Atom
 * @author Guakocius
 * @version 01.11.2024
 */
public final class UserInface {
    private UserInface() { }

    static double real = Number.real;
    static double imaginary = Number.imaginary;
    static String term = Term.term;

    private static final Scanner INPUT = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        System.out.println(Calculator.test);

        // Scans in the user written real and imaginary numbers and the term operator
        // to calculate them and print them out
        System.out.println("Please enter in a real number: ");
        real = INPUT.nextDouble();

        System.out.println("Please put in a term operator: ");
        term = INPUT.next();

        System.out.println("Please put in an imaginary number: ");
        imaginary = INPUT.nextDouble();

        // TODO: Find an elegant way to display imaginary numbers because of i being a char
        // TODO and imaginary being a double, use i or a library which puts i into a complex
        // TODO: number or implement it ourselves.
        System.out.println("The result is: " + real + term + imaginary + "i");



    }
}
