// ask for a number twice
// then print the largest and smallest number

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter a number: ");
        int num2 = input.nextInt();
        input.close();

        if(num1 < num2) {
            System.out.println("Largest number is " + num2);
            System.out.println("Smallest number is " + num1);
        }
        else if(num1 > num2) {
            System.out.println("Largest number is " + num1);
            System.out.println("Smallest number is " + num2);
        }
        else {
            System.out.println(num1 + " and " + num2 + " is equal.");
        }
    }
}