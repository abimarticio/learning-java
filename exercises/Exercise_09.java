// Ceasar cipher

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
      
    }
}