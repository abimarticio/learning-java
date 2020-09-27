// matrixA = {{5, 8}, {10, 12}}
// matrixB = {{1, 2}, {9, 7}}
// matrixA * matrixB

public class Exercise_06 {
    public static void main(String[] args) {
        int[][] matrixA = {{5, 8}, {10, 12}};
        int[][] matrixB = {{1, 2}, {9, 7}};
        
        int matrixC[][] = new int[2][2];

        for(int i = 0; i < matrixA.length; i++) {
            for(int j = 0; j < matrixB[i].length; j++) {
                matrixC[i][j] = 0;
                for(int k = 0; k < matrixB.length; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
    }
}