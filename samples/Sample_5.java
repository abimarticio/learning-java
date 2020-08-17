// Input/Output
// Java user input (Scanner)
// Import scanner class
import java.util.Scanner; 

public class Sample_5 {
    public static void main(String[] args) {
        
        //Create a scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine(); // Read user input
        input.close(); // Closing the scanner object

        System.out.println("Hi! My name is " + name);
    }
}