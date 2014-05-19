import java.io.*;

public class FibClass {
	public static void main(String args[]) {
		int n = 0;

		System.out.println("Welcome to Fibonacci Number detector!" + "\n");
		System.out.print("Please enter a number to check: ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			n = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			System.out.println("IOException with your response.. what are you trying here?");
			System.exit(1);
		}

		System.out.println("\n" + "Now checking your number..." + "\n");

		if(isFib(n)) {
			System.out.println("Yay! " + n + " is a Fibonacci number!" + "\n");
		} else {
			System.out.println("Sorry... " + n + " is not a Fibonacci number." + "\n");
		}
	}

	public static boolean isFib(int number) {
		int fZero = 0;
		int fOne = 1;
		int sum = 0;
		// while number is less th
		while((fZero <= number) && (fZero < 1073741824)) {
			if(fZero == number) { return true; }
			// iterate logic
			sum = fZero + fOne;
			// move fZero and fOne one place back
			fZero = fOne;
			fOne = sum;
		}
		// if while loop escaped, return false
		return false;
	}

	public static void printFib(int limit) {
		int fZero = 0;
		int fOne = 1;
		int sum = 0;
		// while less than limit
		while(fZero < limit) {
			// print n
			System.out.println(fZero);
			// sum placeholds the newest Fib
			sum = fZero + fOne;
			// move fZero and fOne one place back
			fZero = fOne;
			fOne = sum;
		}
	}
}