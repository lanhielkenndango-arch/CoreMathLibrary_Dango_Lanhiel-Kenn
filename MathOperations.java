/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coremathlibrary;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MathOperations {
    private Scanner input;

    public MathOperations() {
        this.input = new Scanner(System.in);
       
    }
    
    public void run() {
        boolean looping = true;
        while (looping) {
            printMainMenu();
            int choice = getIntInput();

            switch (choice) {
                case 1:
                    arithmeticOp();
                    break;
                case 2:
                    geometryOp();
                    break;
                case 3:
                    numberTheory();
                    break;
                case 4:
                    looping = false;
                    System.out.println("\nThank you for using the app!");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
        input.close();
    }

    private void printMainMenu() {
        System.out.println("\nActivity Title: Design and Implementation of a Core Math Library Using OOP Principles   ");
        System.out.println();
        System.out.println("1. Arithmetic Operations");
        System.out.println("2. Geometry Calculations");
        System.out.println("3. Number Analysis");
        System.out.println("4. Exit");
        System.out.print("Choose what to solve: ");
    }

    private void arithmeticOp() {
        System.out.println();
        System.out.println("=== Arithmetic Operations ===");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.print("Choose operation: ");
        int number = getIntInput();

        MathematicalOperation operation = null;

        switch (number) {
            case 1:
                operation = new Addition();
                break;
            case 2:
                operation = new Subtraction();
                break;
            case 3:
                operation = new Multiplication();
                break;
            case 4:
                operation = new Division();
                break;
            default:
                System.out.println("Invalid Number");
                return;
        }

        System.out.print("Enter first number: ");
        operation.setNum1(input.nextDouble());
        System.out.print("Enter second number: ");
        operation.setNum2(input.nextDouble());

        processOperation(operation);
    }

    private void geometryOp() {
        System.out.println();
        System.out.println("=== Geometry Module ===");
        System.out.println("1. Circle (Area & Circumference)");
        System.out.println("2. Rectangle (Area & Perimeter)");
        System.out.print("Choose shape: ");
        int shape = getIntInput();

        if (shape == 1) {
            Circle c = new Circle();
            System.out.print("Enter Radius: ");
            // Radius is stored in num1
            c.setNum1(input.nextDouble());
            c.compute();
            
            if (c.isValid()) {
                System.out.printf("Circle Area: %.2f%n", c.getResult());
                System.out.printf("Circumference: %.2f%n", c.getCircumference());
            }
        } else if (shape == 2) {
            Rectangle r = new Rectangle();
            System.out.print("Enter Length: ");
            r.setNum1(input.nextDouble());
            System.out.print("Enter Width: ");
            r.setNum2(input.nextDouble());
            r.compute();

            if (r.isValid()) {
                System.out.printf("Rectangle Area: %.2f%n", r.getResult());

                // ADD THIS FORMULA:
                double perimeter = 2 * (r.getNum1() + r.getNum2());
                System.out.printf("Perimeter: %.2f%n", perimeter);
            }
        } else {
            System.out.println("Invalid shape selection.");
        }
    }

    private void numberTheory() {
        System.out.println();
        System.out.println("=== Number Theory Module ===");
        System.out.println("1. Prime Number Checking");
        System.out.println("2. Factorial");
        System.out.print("Choose number: ");
        int numb = getIntInput();

        if (numb == 1) {
            PrimeNumber pn = new PrimeNumber();
            System.out.print("Enter integer number: ");
            pn.setNum1(input.nextDouble());
            pn.compute();
            if (pn.isValid()) {
                System.out.println(" Result: " + (pn.isPrimeResult() ? "Prime Number" : "NOT a Prime Number"));
            }
        } else if (numb == 2) {
            Factorial f = new Factorial();
            System.out.print("Enter integer (0-20): ");
            f.setNum1(input.nextDouble());
            processOperation(f);
        } else {
            System.out.println("Invalid number.");
        }
    }
    
    private void processOperation(MathematicalOperation op) {
        op.compute(); // Polymorphic call
        if (op.isValid()) {
            System.out.println("Result: " + op.getResult());
        }
    }
    
    private int getIntInput() {
        while (!input.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            input.next(); 
        }
        return input.nextInt();
    }
    
    
    
}
    