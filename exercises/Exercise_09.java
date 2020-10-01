// Ceasar cipher
import java.util.Scanner;

public class Exercise_09 {

    void decryptText(String textToDecrypt, int key) {
        String result = "";
        for(int i = 0; i < textToDecrypt.length(); i++) {
            result +=  (char)(((int)textToDecrypt.charAt(i) - key - 65) % 26 + 65);
        }
        System.out.println(result);
    }

    void encryptText(String textToEncrypt, int key) {
        String result = "";
        for(int i = 0; i < textToEncrypt.length(); i++) {
            result += (char)(((int)textToEncrypt.charAt(i) + key - 65) % 26 + 65);
        }
        System.out.println(result);
    }

    public static void main(String args[]) {
        Exercise_09 obj = new Exercise_09();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Do you want to encrypt or decrypt: ");
            String mode = sc.nextLine().toUpperCase();
            if (mode.equals("ENCRYPT")) {
                System.out.println("Enter text you want to encrypt: ");
                String textToEncrypt = sc.nextLine().toUpperCase();
                System.out.println("Key: ");
                int key = sc.nextInt();
                obj.encryptText(textToEncrypt, key);
                break;
            }
            else if (mode.equals("DECRYPT")) {
                System.out.println("Enter text you want to decrypt: ");
                String textToDecrypt = sc.nextLine().toUpperCase();
                System.out.println("Key: ");
                int key = sc.nextInt();
                obj.decryptText(textToDecrypt, key);
                break;
            }
            else {
                continue;
            }
            
        }
        sc.close();
    }
}