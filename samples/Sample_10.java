// arrays
// for-each loop

public class Sample_10 {
    public static void main(String[] args) {
        
        String[] names = {"Monica", "Chandler", "Phoebe", "Ross", "Rachel", "Joey"};
        
        // for-each loop
        for(String i : names) {
            System.out.println(i);
        }

        // index 0 is the first element
        // index 1 is the second element, etc.
        System.out.println("The length of the array is " + names.length); // 6
        System.out.println("Index 0 is " + names[0]); // Monica
        names[4] = "Carol"; // index 4 changed from Monica to Carol.
        
        for(String i : names) {
            System.out.println(i); // just to see that the fifth element is changed to Carol
        }
    }
}