import java.util.Scanner;

public class NoPlusSum {
	public static void main(String[] args) {
		// get input from user
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		int num1 = reader.nextInt();
		System.out.print("Enter the second integer: ");
		int num2 = reader.nextInt();
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + add(num1, num2));

	}

	public static int add(int a, int b) {
		return (a - (b * -1));
	}
}
