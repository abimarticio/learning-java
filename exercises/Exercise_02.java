// ask for value of x and y
// perform the following operations
// addition, subtraction, multiplication, division and modulo

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Addition");
        System.out.print("Value for x: " );
        int x = input.nextInt();
        System.out.print("Value for y: ");
        int y = input.nextInt();
        int z = x + y;
        System.out.println("x + y = " + z);

        System.out.println("Subtraction");
        System.out.print("Value for x: " );
        x = input.nextInt();
        System.out.print("Value for y: ");
        y = input.nextInt();
        z = x - y;
        System.out.println("x - y = " + z);

        System.out.println("Multiplication");
        System.out.print("Value for x: " );
        x = input.nextInt();
        System.out.print("Value for y: ");
        y = input.nextInt();
        z = x * y;
        System.out.println("x * y = " + z);

        System.out.println("Division");
        System.out.print("Value for x: " );
        x = input.nextInt();
        System.out.print("Value for y: ");
        y = input.nextInt();
        z = x / y;
        System.out.println("x / y = " + z);

        System.out.println("Modulo");
        System.out.print("Value for x: " );
        x = input.nextInt();
        System.out.print("Value for y: ");
        y = input.nextInt();
        z = x % y;
        System.out.println("x % y = " + z);
        input.close();
    }
}
