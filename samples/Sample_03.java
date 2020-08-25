// Arithmetic Operators
// Math methods

public class Sample_03 {
    public static void main(String[] args) {
        // int x, y, z;
        // x = 25;
        // y = 5;
        // z = x + y;
        int x = 25;
        int y = 5;

        // Addition
        int add = x + y;
        System.out.println(add);
        
        //Subtraction
        int subtract = x - y;
        System.out.println(subtract);

        //Multiplication
        int multiply = x * y;
        System.out.println(multiply);

        // Division
        int div = x / y;
        System.out.println(div);

        // Modulo
        int mod = x % y;
        System.out.println(mod);

        // Methods
        System.out.println(Math.max(x, y)); // print the highest value of x and y
        System.out.println(Math.min(x, y)); // print the lowest value of x and y
        System.out.println(Math.sqrt(x));   // print the square root of x
        System.out.println(Math.abs(-10));  // print the absolute value
        System.out.println(Math.random());  // prints random number between 0.0 (inclusive) and 1.0 (exclusive)
        System.out.println(Math.random() *10); // prints random number between 0 and 10
        System.out.println(Math.floor(10.5));  // round off the value, 10
    }
}