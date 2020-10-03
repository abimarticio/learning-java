// Atbash

public class Exercise_10 {
    void encryptDecryptText(String userInput) {
        String result = "";
        for(int i = 0; i < userInput.length(); i++) {
            result += (char)(((int)userInput.charAt(i) * 25 + 25 - 65) % 26 + 65); 
        }
        System.out.println(result);
    }
}