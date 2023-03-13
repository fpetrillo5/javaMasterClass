public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(double real, double imaginary){
        this.real = this.getReal() + real;
        this.imaginary = this.getImaginary() + imaginary;
    }

    public void add(ComplexNumber c){
        this.real = this.getReal() + c.getReal();
        this.imaginary = this.getImaginary() + c.getImaginary();
    }

    public void subtract(double real, double imaginary){
        this.real = this.getReal() - real;
        this.imaginary = this.getImaginary() - imaginary;
    }

    public void subtract(ComplexNumber c){
        this.real = this.getReal() - c.getReal();
        this.imaginary = this.getImaginary() - c.getImaginary();
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
