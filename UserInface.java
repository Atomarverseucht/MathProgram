//package MathProgram;

import java.util.Scanner;
/**
 * Dieses Projekt soll komplexe Zahlen einlesen können und diese miteinander verrechnen
 * @author Atom
 * @author Guakocius
 * @version 01.11.2024/2
 */
public final class UserInface {
    private UserInface() { }

    private static final Scanner INPUT = new Scanner(System.in);
    static String operator = "+";
    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        Number number = new Number(0,0);
        int count = 1;
        // Scans in the user written complex numbers and the term operator
        // to calculate them and print them out            
        System.out.println("\nKomplexe Zahlen, werden wie folgt angegeben: a + ib");            
        System.out.println("Please enter in the real part of the first number: ");
        while (INPUT.hasNext()) {
            number.real = INPUT.nextDouble();
    	    System.out.println("Please put the imaginary part: ");
            number.imaginary = INPUT.nextDouble();
            System.out.println("Please put in a term operator: ");
            operator = INPUT.next();
            Calculator.number.add(number);
            Calculator.operator.add(operator);
            ++count;
            System.out.println("Please enter in the real part of the " + count + ". number: ");
        }

        // TODO: Find an elegant way to display imaginary numbers because of i being a char
        // TODO and imaginary being a double, use i or a library which puts i into a complex
        // TODO: number or implement it ourselves.
        count = 0;
        for (Number value: Calculator.number) {
            System.out.println(count + ". number: " + value.real + value.imaginary + "i" + Calculator.operator.get(count));
            ++count;
        }
    }
}
