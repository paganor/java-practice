import java.util.Arrays;

public class ArrayMerge {
	/*
	 * The purpose of this class is to merge two previously
	 * sorted arrays (ints) into one sorted array.
	 */

	public static void main(String[] args) {
	// declare array 1
	int[] array1 = {
		2, 6, 9,
		15, 685, 686,
		1000, 1929, 10000
	};
	
	// delcare array 2
	int[] array2 = {
		6, 7, 12,
		868, 999, 1010,
		5686, 9898, 10001
	};
	
	int arraySize = array1.length + array2.length;

	System.out.println("Array 1: " + Arrays.toString(array1));
	System.out.println("Array 2: " + Arrays.toString(array2));
	
	// declare empty results array
	int[] mergedArray = new int[arraySize];
	
	System.out.println("Sorted Array: " + merge(array1, array2, mergedArray));
	}
	
	public static String merge(int[] A, int[] B, int[] C) {
		int i, j, k, m, n;
		i = 0;
		j = 0;
		k = 0;
		m = A.length;
		n = B.length;

		while (i < m && j < n) {
			if (A[i] <= B[j]) {
				C[k] = A[i];
				i++;
			} else {
				C[k] = B[j];
				j++;
			}
			k++;
		}
		if (i < m) {
			for (int p = i; p < m; p++) {
				C[k] = A[p];
				k++;
			}
		} else {
			for (int p = j; p < n; p++) {
				C[k] = B[p];
				k++;
			}
		}

		return Arrays.toString(C);
	}
}
