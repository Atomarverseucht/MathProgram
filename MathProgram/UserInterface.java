
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
        boolean complex = false;
        MathProgram.Number number = new Number(0, 0);

        // Scans in the user written complex numbers and the term operator
        // to calculate them and print them out
        Calculator.operator.add("+");
        System.out.println("\nPress 'C' to use complex numbers, press anything else to use exclusively reel numbers");
        String c = (String)INPUT.next();
        if(c.toLowerCase().contains("c")){
            complex = true;
        }
        if(complex){
            System.out.println("""

                    Complex Numbers: a + ib\s
                        \
                    End Input with wrong input for operators"""); 
            System.out.println("Please enter in the real part of the first number: ");     
            while (INPUT.hasNext()) {
                number.real = UserInterface.inputDouble();
                System.out.println("Please put in the imaginary part: ");
                number.imaginary = UserInterface.inputDouble();
                System.out.println("Please put in a term operator: ");
                operator = INPUT.next();
                Calculator.real.add(number.real);
                Calculator.imaginary.add(number.imaginary);
                if (!UserInterface.checkOperator(operator)) {
                    break;
                }
                Calculator.operator.add(operator);
                ++count;
                System.out.println("Please enter in the real part of the " + count + ". number: ");
            }
        
            number = Calculator.calculateTerm();

            System.out.println(number.real + " + " + number.imaginary + "i");

            // System.out.println("The result is: " + numbers[0].real + term + numbers[0].imaginary + "i");
            count = 0;
            for (Double value : Calculator.real) {
                System.out.println(Calculator.operator.get(count) +
                    " (" + value + " + " + Calculator.imaginary.get(count) + "i)");
                ++count;
            }
        } else{
            System.out.println("End Input with wrong input for operators"); 
            System.out.println("Please enter in the first number: ");     
            while (INPUT.hasNext()) {
                number.real = UserInterface.inputDouble();
                System.out.println("Please put in a term operator: ");
                operator = INPUT.next();
                Calculator.real.add(number.real);
                Calculator.imaginary.add(0.0);
                if (!UserInterface.checkOperator(operator)) {
                    break;
                }
                Calculator.operator.add(operator);
                ++count;
                System.out.println("Please put in the " + count + ". number: ");
            }

        number = Calculator.calculateTerm();

        System.out.println("Solution: " + number.real + "\n Calculation:");

        count = 0;
        for (Double value : Calculator.real) {
            System.out.println(Calculator.operator.get(count) + value);
            ++count;
        }
    }     
}

    static Boolean checkOperator(String operator){
        switch (operator) {
            case "+","-","*","/":
                return true;
            default: 
                return false;
        }
    }
    static Double inputDouble(){
        String value = INPUT.next();
        try {
            Double _value = Double.parseDouble(value);
            return _value;
        
        } catch (NumberFormatException nfe) {
            System.out.println("Please give me a double value (example: 0.0 or 0)");
            return inputDouble();
        }
    }
}

