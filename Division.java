/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coremathlibrary;

/**
 *
 * @author Asus
 */
public class Division extends MathematicalOperation {
    
   public void compute() {
        if (getNum2() == 0) {
            System.out.println("Error: Cannot divide by zero.");
            setValid(false);
        } else {
            setResult(getNum1() / getNum2());
        }
    }

}
