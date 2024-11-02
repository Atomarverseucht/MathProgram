package MathProgram;

public final class Term{

    public MathProgram.Number Operation(MathProgram.Number n1, MathProgram.Number n2, String operator){
        MathProgram.Number result = new Number(0, 0);
        switch(operator) { 
            case "+":
                result.real = n1.real + n2.real;
                result.imaginary = n1.imaginary + n2.imaginary;
                break;
            case "-":
                result.real = n1.real - n2.real;
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