// Decision maker
// ask user a question
// ask user to give options
// generate answer from the given options

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Exercise_08 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your question: ");
            String question = sc.nextLine();
            if(question.isEmpty()) {
                continue;
            }
            else {
                break;
            } 
        }
        ArrayList<String> list = new ArrayList<String>();
        while(true) {
            System.out.println("Enter options: ");
            String options = sc.nextLine();
            if(options.isEmpty()) {
                break;
            }
            else {
                list.add(options);
            }
        }
        sc.close(); 
        Random rand = new Random();
        int randomNum = rand.nextInt(list.size());
        System.out.println(list.get(randomNum));
    }      
}