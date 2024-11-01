public final class Number{

    public double real = 0.0;
    public double imaginary = 0.0;

    // Implements the real and imaginary numbers which will then be used in the
    // User Interface's scanner
    public Number(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }
    public void setReal(double real){
        this.real = real;
    }
    public void setImaginary(double imaginary){
        this.imaginary = imaginary;
    }

}