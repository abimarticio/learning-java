// ask for a number
// loop through 0 to the entered number
// then get the sum of all even numbers
// and sum of all the odd numbers

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();

        int even = 0;
        int odd = 0;
        for(int i = 0; i <= num; i++) {
            if(i % 2 == 0) {
                even = even + i;
            }
            else {
                odd = odd+ i;
            }
        }
        System.out.println("The sum of all even numbers is " + even);
        System.out.println("The sum of all odd numbers is " + odd);
    }   
}