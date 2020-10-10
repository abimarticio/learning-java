package algorithms;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {11, 1, 5, 4, 10, 9};
        int[] bubbleSortArray = new BubbleSort().arrangeAscendingly(array);
        int[] insertionSortArray = new InsertionSort().arrangeAscendingly(array);
        System.out.printf("Original array: %s\n", Arrays.toString(array));
        System.out.printf("Sorted using Bubble Sort: %s\n", Arrays.toString(bubbleSortArray));
        System.out.printf("Sorted using Insertion Sort: %s\n", Arrays.toString(insertionSortArray));
        
    }
}