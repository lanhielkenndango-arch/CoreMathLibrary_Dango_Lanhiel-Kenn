/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coremathlibrary;

/**
 *
 * @author Asus
 */
public class Circle extends MathematicalOperation {

    @Override
    public void compute() {
        // num1 represents Radius here
        if (getNum1() < 0) {
            System.out.println("Error: Radius cannot be negative.");
            setValid(false);
            return;
        }
        setResult(Math.PI * Math.pow(getNum1(), 2));
    }

    public double getCircumference() {
        return (getNum1() < 0) ? 0 : 2 * Math.PI * getNum1();
    }
}
