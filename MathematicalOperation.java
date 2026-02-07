/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coremathlibrary;

/**
 *
 * @author Asus
 */
public abstract class MathematicalOperation {

    private double num1;
    private double num2;
    private double result;
    private boolean valid;

    public MathematicalOperation() {
        this.valid = true;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double value) {
        this.num1 = value;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double value) {
        this.num2 = value;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double newResult) {
        this.result = newResult;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public boolean isValid() {
        return this.valid;
    }

    public abstract void compute();

}
