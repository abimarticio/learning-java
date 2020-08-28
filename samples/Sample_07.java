// Switch statements

import java.util.Scanner; 

public class Sample_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter command: ");
        String command = input.nextLine();
        input.close();


        switch (command) {
            
            case "on":
            System.out.println("Lights are now turned on.");
            break;

            case "off":
            System.out.println("Lights are now turned off.");
            break;

            case "dim":
            System.out.println("Lights dimmed.");
            break;

            default:
            System.out.println("Cannot recognize the command you entered.");
        }
    }
}
