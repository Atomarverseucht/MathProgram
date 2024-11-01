import java.util.Scanner;

public final class Term{

   public static String term;
    Scanner INPUT = new Scanner(System.in);
    double result;

    public Term(){

        switch(term) {
            case "+":
                result = Number.real + Number.imaginary;
                break;
            case "-":
                result = Number.real - Number.imaginary;
                break;
            case "*":
                result = Number.real * Number.imaginary;
                break;
            case "/":
                result = Number.real / Number.imaginary;
                break;
            case "%":
                result = Number.real % Number.imaginary;
                break;
        }


    }

}