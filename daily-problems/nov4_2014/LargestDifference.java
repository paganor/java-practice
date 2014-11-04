public class LargestDifference {
	// main
	public static void main(String[] args) {
	
	// declare int array
	int[] nums = {
		1, 87, 5,
		988, 79, 494,
		1795, 4, 9
	};

	System.out.println(findLargestDifference(nums));
	
	}

	// find largest difference function
	public static int findLargestDifference(int[] array) {
	
	int difference;
	int maxDifference = -1000000; // just something low to start	
	// loop through array
	for (int i = 0; i < array.length - 1; i++) {
		difference = array[i] - array[i + 1];
		// swap if difference is bigger
		if (difference > maxDifference) {
			maxDifference = difference;
		}
	}

	return maxDifference;
	}
}
