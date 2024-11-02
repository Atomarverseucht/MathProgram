
package MathProgram;

import java.util.Scanner;

/**
 * MathProgram should calculate mathematical terms (accepted complex numbers), today it's only showing the numbers in the cartesian form.
 * @author Atom
 * @author Guakocius
 * @version 02.11.2024/1
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
        int count = 1;
        MathProgram.Number number = new Number(0,0);

        // Scans in the user written complex numbers and the term operator
        // to calculate them and print them out
        System.out.println("\nComplex Numbers: a + ib");
        System.out.println("Please enter in the real part of the first number: ");
        while (INPUT.hasNext()) {
            number.real = INPUT.nextDouble();
    	    System.out.println("Please put in the imaginary part: ");
            number.imaginary = INPUT.nextDouble();
            System.out.println("Please put in a term operator: ");
            operator = INPUT.next();
            Calculator.number.add(number);
            Calculator.operator.add(operator);++count;
            System.out.println("Please enter in the real part of the " + count + ". number: ");
        }

        // System.out.println("The result is: " + numbers[0].real + term + numbers[0].imaginary + "i");
        count = 0;
        for (Number value: Calculator.number) {
            System.out.println(count + ". number: " + value.real +"+"+ value.imaginary + "i" + Calculator.operator.get(count));
            ++count;
        }
    }
}
