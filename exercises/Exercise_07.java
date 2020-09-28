
// Random Name Picker
// enter names one by one
// generate a winner

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Exercise_07{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        while(true) {
            System.out.println("Enter name: ");
            String userInput = sc.nextLine();
            if(userInput.isEmpty()) {
                break;
            }
            else {
                list.add(userInput);
            } 
        }
        sc.close(); 
        Random rand = new Random();
        int randomNum = rand.nextInt(list.size());
        System.out.println("The winner is " + list.get(randomNum));
    }      
}