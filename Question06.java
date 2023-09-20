//Write a program to perform addition of two complex numbers using constructor overloading. 
// The first constructor which takes no argument is used to create objects which are not initialized, 
// second which takes one argument is used to initialize real and imag parts to equal values and third 
// which takes two argument is used to initialized real and imag to two different values.

class Complex {
    private int real, imag;

    Complex() {

    }

    Complex(int val) {
        this.real = val;
        this.imag = val;
    }

    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public void getdata(Complex c) {
        System.out.println("Complex Number : " + c.real + " +i" + c.imag);
    }

    static void addComplex(Complex a, Complex b) {
        System.out.println("Sum : " + (a.real + b.real) + " +i" + (a.imag + b.imag));
    }
}

public class Question06 {
    public static void main(String[] args) {
        Complex a = new Complex();
        a.getdata(a);
        Complex b = new Complex(20);
        b.getdata(b);
        Complex c = new Complex(20, 10);
        c.getdata(c);
        Complex.addComplex(b, c);

    }

}

/*
 * 
 * 
 * Complex Number : 0 +i0
 * Complex Number : 20 +i20
 * Complex Number : 20 +i10
 * Sum : 40 +i30
 */