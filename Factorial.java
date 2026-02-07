/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coremathlibrary;

/**
 *
 * @author Asus
 */
public class Factorial extends MathematicalOperation {

    @Override
    public void compute() {
        int n = (int) getNum1();
        if (n < 0) {
            System.out.println("Error: Undefined for negative numbers.");
            setValid(false);
            return;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        setResult(fact);
    }
}
