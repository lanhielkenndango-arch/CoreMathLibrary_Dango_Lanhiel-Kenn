/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coremathlibrary;

/**
 *
 * @author Asus
 */
public class PrimeNumber extends MathematicalOperation {
    private boolean isPrime;

    @Override
    public void compute() {
        int num = (int) getNum1();
        if (num <= 1) isPrime = false;
        else {
            isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        // Result is 1.0 if prime, 0.0 if not (just for storage)
        setResult(isPrime ? 1.0 : 0.0);
    }
    public boolean isPrimeResult() { return isPrime; }
}
