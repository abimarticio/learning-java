package algorithms;

import java.util.Arrays;

abstract class Sort {
    public abstract int[] arrangeAscendingly(int[] array);
}

class BubbleSort extends Sort {
    /**
     * 
     Sorts an array in ascending order using bubble sort.
     @param array The array to sort.
     @return The sorted array in ascending order.
     */
    @Override
    public int[] arrangeAscendingly(int[] array) {
        int [] sortedArray = Arrays.copyOf(array, array.length);
        for(int elem = 1; elem <= sortedArray.length; elem++) {
            for(int index = 0; index < sortedArray.length - 1; index++) {
                if (sortedArray[index] > sortedArray[index + 1]) {
                    int temp = sortedArray[index];
                    sortedArray[index] = sortedArray[index + 1];
                    sortedArray[index + 1] = temp;
                }
            }
        }
        return sortedArray;
    }
}

class InsertionSort extends Sort {
	/**
	 * Sorts an array in ascending order using Insertion Sort.
	 * @param array The array to sort.
	 * @return the sorted array in ascending order.
	 */
	@Override
	public int[] arrangeAscendingly(int[] array) {
		int[] sortedArray = Arrays.copyOf(array,  array.length);
		for(int index = 0; index < sortedArray.length; index++) {
			int comparisonIndex = index;
			while ((comparisonIndex > 0) && (sortedArray[comparisonIndex - 1] > sortedArray[comparisonIndex])) {
				int temp = sortedArray[comparisonIndex];
				sortedArray[comparisonIndex] = sortedArray[comparisonIndex - 1];
				sortedArray[comparisonIndex - 1] = temp;
				comparisonIndex -= 1;
			}
		}
		return sortedArray;
	}
}