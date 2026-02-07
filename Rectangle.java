/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coremathlibrary;

/**
 *
 * @author Asus
 */
public class Rectangle extends MathematicalOperation {

    @Override
    public void compute() {
        // num1 is Length, num2 is Width
        if (getNum1() < 0 || getNum2() < 0) {
            System.out.println("Error: Dimensions cannot be negative.");
            setValid(false);
            return;
        }
        setResult(getNum1() * getNum2());
    }
}
