public class ThreeSum {
	public static void main(String args[]) {
		// declare set of integers	
		int[] numbers = {1, 2, 3,
				988, 23, 3,
				2, 38, 384,
				645, 45, 343};

		System.out.println(findLargeSum(numbers));
	}

	public static int findLargeSum (int[] nums){
		int largestSum = 0;
		int sum = 0;

		if (nums.length < 3) {
			return largestSum;	
		} else {
			for (int i = 0; i < nums.length - 2; i++) {
				// calculate sum
				sum = nums[i] + nums [i+1] + nums [i+2];
				// if sum is greater than previous, replace it
				if (sum > largestSum) { largestSum = sum; }
			}
			return largestSum;
		}
	}
}
