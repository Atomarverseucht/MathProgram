
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
        Calculator.operator.add("+");
        System.out.println("\nComplex Numbers: a + ib \n End Input with wrong input for operators");
        System.out.println("Please enter in the real part of the first number: ");
<<<<<<< HEAD

        while (INPUT.hasNext()) {
=======
        while (INPUT.hasNextInt()) {
>>>>>>> 5dce9fc5a3a30ca486045260ffbead5543222401
            number.real = INPUT.nextDouble();
    	    System.out.println("Please put in the imaginary part: ");
            number.imaginary = INPUT.nextDouble();
            System.out.println("Please put in a term operator: ");
            operator = INPUT.next();
<<<<<<< HEAD
            Calculator.number.add(number);
            Calculator.operator.add(operator);
            ++count;
=======
            Calculator.real.add(number.real);
            Calculator.imaginary.add(number.imaginary);
            if(!UserInterface.checkOperator(operator)){
                break;
            }
            
            Calculator.operator.add(operator); ++count;
>>>>>>> 5dce9fc5a3a30ca486045260ffbead5543222401
            System.out.println("Please enter in the real part of the " + count + ". number: ");
        }
        number = Calculator.calculateTerm();

        System.out.println(number.real + " + " + number.imaginary + "i");

        // System.out.println("The result is: " + numbers[0].real + term + numbers[0].imaginary + "i");
        count = 0;
<<<<<<< HEAD
        for (Number value: Calculator.number) {
            System.out.println(count + ". number: " + value.real
                    +"+"+ value.imaginary + "i" + Calculator.operator.get(count));
=======
        for (Double value: Calculator.real) {
            System.out.println(Calculator.operator.get(count) + " (" + value +" + "+ Calculator.imaginary.get(count) + "i)");
>>>>>>> 5dce9fc5a3a30ca486045260ffbead5543222401
            ++count;
        }
    }

    static Boolean checkOperator(String operator){
        String[] allowedOperators = new String[]{"+","-","*","/"};
        Boolean allowed = false;
        for (int i = 0; i < allowedOperators.length; i++) {
            if(allowedOperators[i].equals(operator)){
                allowed = true;
            }
        }
        return allowed;
    }
}
