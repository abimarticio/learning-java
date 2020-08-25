// String Methods
// Boolean Expression

public class Sample_04 {
    public static void main(String[] args) {

        String text = "Hi my name is";
        String name = "Faye";
        boolean x = true;
        int a = 15;
        int b = 5;

        // String concatenation
        System.out.println(text + " " + name); // Ouputs "Hi my name is Faye"

        // String methods
        System.out.println(text.concat(name));    // Ouputs "Hi my name is Faye"
        System.out.println(text.length());        // The length of the text string is 13
        System.out.println(name.length());        // The length of the name string is 4
        System.out.println(name.toUpperCase());   // Outputs "FAYE"
        System.out.println(name.toLowerCase());   // Outputs "faye"
        System.out.println(text.indexOf("name")); // Outputs 6, counts positions from 0
    
        // Boolean Expression
        System.out.println(x);       // Outputs true
        System.out.println(a > b);   // Outputs true
        System.out.println(a < b);   // Outputs false
        System.out.println(a == b);  // Outputs false
        System.out.println(b == 15); // Outputs false
    }
}