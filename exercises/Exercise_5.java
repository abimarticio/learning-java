// ask for a number
// continue asking for a number if the number entered is odd
// exit loop if even

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
      
        while(num % 2 != 0) {
            System.out.println("Enter a number again: ");
            num = input.nextInt();
        }
        input.close();
    }
}