public final class Number{

    public static double real;
    public static double imaginary;

    public Number(double real, double imaginary) {
        Number.real = real;
        Number.imaginary = imaginary;

    }
    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }
    public void setReal(double real){
        Number.real = real;
    }
    public void setImaginary(double imaginary){
        Number.imaginary = imaginary;
    }

}