// Ask for the following info 
// and display the name, age and gender

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = sc.next(); 
        System.out.print("What is your age? ");
        int age = sc.nextInt();
        System.out.print("What is your gender? ");
        String gender = sc.next();
        sc.close();

        System.out.println("My name is " + name);
        System.out.println("I'm " + age + " years old");
        System.out.println("Gender: " + gender);
    }
}