// Ceasar cipher
import java.util.Scanner;

public class Exercise_09 {

    static String decryptText(String textToDecrypt, int key) {
        String result = "";
        for(int i = 0; i < textToDecrypt.length(); i++) {
            result +=  (char)(((int)textToDecrypt.charAt(i) - key - 65) % 26 + 65);
        }
        return result;
    }

    static String encryptText(String textToEncrypt, int key) {
        String result = "";
        for(int i = 0; i < textToEncrypt.length(); i++) {
            result += (char)(((int)textToEncrypt.charAt(i) + key - 65) % 26 + 65);
        }
        return result;
    }

    static String getText(String displayMessage, Scanner sc) {
        System.out.println(displayMessage);
        String textToEncrypt = sc.nextLine().toUpperCase();
        return textToEncrypt;
    }

    static int getKey(Scanner sc) {
        System.out.println("Key: ");
        int key = sc.nextInt();
        return key;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Do you want to encrypt or decrypt: ");
            String mode = sc.nextLine().toUpperCase();
            if (mode.equals("ENCRYPT")) {
                
                String encryptedText = encryptText(textToEncrypt, key);
                System.out.println(encryptedText);
                break;
            }
            else if (mode.equals("DECRYPT")) {
               
                String decryptedText = decryptText(textToDecrypt, key);
                System.out.println(decryptedText);
                break;
            }
            else {
                continue;
            }
            
        }
        sc.close();
    }
}