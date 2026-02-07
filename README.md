This project is a Java-based command-line application designed to perform various mathematical calculations using Object-Oriented Programming (OOP) principles. It covers Arithmetic, Geometry, and Number Theory operations.

1. Class Responsibilities
 
   The application separates user interaction from mathematical logic.

   - CoreMathLibrary: The entry point containing the main method. It strictly launches the application logic.

   - MathOperations: Acts as the Controller/UI. It manages the console menu, handles user input via Scanner, and instantiates the specific operation classes based on user choice.

   - MathematicalOperation: The Abstract Base Class. It defines the required structure (inputs, result, validation status) for all calculations but contains no specific math logic itself.

   - Concrete Subclasses (Addition, Circle, Factorial, etc.): These contain the specific algorithms. For example, Circle calculates area and circumference, while PrimeNumber determines primality.

2. Inheritance Structure

   The project uses a hierarchical structure to enable Polymorphism.

   - Parent Class: MathematicalOperation is defined as abstract. It forces all children to implement the compute() method.
   - Child Classes: Classes like Addition, Division, and Rectangle extend MathematicalOperation. They inherit the storage fields (num1, num2) but provide their own implementation of compute().
   - Usage: The MathOperations class uses the parent type to process different operations uniformly. For instance, processOperation(MathematicalOperation op) can accept any child class.

3. Encapsulation

   Encapsulation is used to protect data integrity and control access to the internal state.

   - Private Fields: In MathematicalOperation, fields like num1, num2, and result are private. They cannot be accessed directly by other classes.
   - Accessors (Getters/Setters): Subclasses must use getNum1() or setResult() to perform calculations. For example, Addition calls setResult(getNum1() + getNum2()) rather than accessing variables directly.
   - Validation: Encapsulation allows logic to prevent invalid states.
      - Division checks if getNum2() is zero inside its compute method before setting a result.
      - Circle checks if the radius is negative and sets valid to false if necessary, preventing invalid outputs.

<img width="1210" height="749" alt="image" src="https://github.com/user-attachments/assets/534e44e8-3977-4514-a67a-1b00b27f3e45" />

<img width="1148" height="557" alt="image" src="https://github.com/user-attachments/assets/edd3b086-f984-4bac-b3d8-72768a4c7df3" />
