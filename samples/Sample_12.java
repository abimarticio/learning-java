// multidimentional arrays

public class Sample_12 {
    public static void main(String[] args) {
        int[][] num = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        System.out.println(num[1][2]); // outputs 6
        System.out.println(num[2][0]); // outputs 7
        System.out.println(num[0][0]); // outputs 1

        for(int i = 0; i < num.length; i++) { // loops through the array
            for(int j = 0; j < num[i].length; j++) { //loops through the element inside the array
                System.out.println(num[i][j]); 
            }
        } 
    }
}