import java.io.*;

public class FibCalculator {
	public static void main(String args[]) throws IOException {
		System.out.print("\n" + "Welcome to the Fibonacci Calcualtor!" + "\n" + "\n" +
						 "Please enter the position in the sequence you wish to calculate: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int position = Integer.parseInt(br.readLine());

		System.out.println("The " + position + "position in the Fibonacci sequence is: " + positionValue(position));
	}

	public static int positionValue(int n) {
		// code to calculate here
		int fZero = 0;
		int fOne = 1;
		int sum = 0;

		for(int i = 1; i < n; i++) {
			// increment sequence
			sum = fZero + fOne;
			fZero = fOne;
			fOne = sum;
		}
		return fZero;
	}
}