// Atbash
import java.util.Scanner;

public class Exercise_10 {
    static String encryptDecryptText(String userInput) {
        String result = "";
        for(int i = 0; i < userInput.length(); i++) {
            result += (char)(((int)userInput.charAt(i) * 25 + 25 - 65) % 26 + 65); 
        }
        return result;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text you want to encrypt or decrypt");
        String userInput = sc.nextLine().toUpperCase();
        String result = encryptDecryptText(userInput);
        System.out.println(result);
        sc.close();
    }
}