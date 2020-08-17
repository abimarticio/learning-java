// if, else if, else

import java.util.Scanner;

public class Sample_6 {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        System.out.print("Rate from 1-10: ");
        int rate = input.nextInt();
        input.close();


        if ( rate == 10 ) {
            System.out.println("Thank you for giving us perfect rating!");
        }
        else if ( rate == 8 || rate == 9 ) {
            System.out.println("Thank you for the high rating.");
        }
        else if ( rate <= 7 ) {
            System.out.println("Thank you for your rating, we promise to improve our service.");
        }
        else {
            System.out.println("Rate is from 1 to 10 only.");
        }
    }
}