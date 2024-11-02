public final class Term{

    public Number Operation(Number n1, Number n2, String operator){
        Number result = new Number(0, 0);
        switch(operator) { 
            default:
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
                result.imaginary = (n1.real / n2.imaginary) + (n1.imaginary / n2.real);;
                break;
                /*   case "%":
                result = Number.real % Number.imaginary;
                break;*/ 
        }
        return result;
    }
}