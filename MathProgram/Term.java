package MathProgram;

public final class Term{

   public static String term = UserInterface.operator;

    public MathProgram.Number Term(MathProgram.Number n1, MathProgram.Number n2){
        MathProgram.Number result = new Number(0, 0);
        switch(term) { 

            case "+":
                result.real = n1.real + n2.real;
                result.imaginary = n1.imaginary + n2.imaginary;
                break;
            case "-":
                result.real = n1.real - n2.imaginary;
                result.imaginary = n1.imaginary - n2.imaginary;
                break;
            case "*":
                result.real = n1.real * n2.real - n1.imaginary * n2.imaginary;
                result.imaginary = n1.real * n2.imaginary + n2.real * n1.imaginary;
                break;
            case "/":
                result.real = (n1.real / n2.real) - (n1.imaginary / n2.imaginary);
                result.imaginary = (n1.real / n2.imaginary) + (n1.imaginary / n2.real);
                break;
                /*   case "%":
                result = Number.real % Number.imaginary;
                break;*/
            default:
        }
        return result;
    }
}