import java.util.*;

/**
 * ComplexNum
 */
public class ComplexNum {
    private double real;
    private double imag;
    
    ComplexNum(double r, double i) {
        this.real = r;
        this.imag = i;
    }

    public double getReal() {
        return this.real;
    }

    public double getImag() {
        return this.imag;
    }

    public void add(ComplexNum cn) {
        this.real += cn.getReal();
        this.imag += cn.getImag();
        return ;
    }

    public void minus(ComplexNum cn) {
        this.real -= cn.getReal();
        this.imag -= cn.getImag();
        return ;
    }

    public void multiply(ComplexNum cn) {
        double real = this.real;
        double imag = this.imag;
        this.real = real*cn.getReal() - imag*cn.getImag();
        this.imag = real*cn.getImag() + imag*cn.getReal();
        return ;
    }

    public void divide(ComplexNum cn) {
        double down = cn.getReal()*cn.getReal() + cn.getReal()*cn.getImag();
        double real = this.real;
        double imag = this.imag;
        this.real = (real*cn.getReal() + imag*cn.getImag())/down;
        this.imag = (cn.getImag()*imag - real*cn.getImag())/down;
        return ;
    }

    public String toString() {
        return (this.real+"+"+this.imag+"i");
    }
}