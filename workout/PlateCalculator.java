import java.util.Scanner;

public class PlateCalculator {
	// final ints
	private final double weight;
	private final int barWeight;

	// use ints
	private int fortyFives;
	private int thirtyFives;
	private int twentyFives;
	private int tens;
	private int fives;
	private int twoAndAHalfs;

	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter total weight: ");
		int weight = scan.nextInt();
		System.out.print("Enter bar weight: ");
		int barWeight = scan.nextInt();
		// get and print plates
		System.out.println(new PlateCalculator((double) weight, barWeight).toString());
	}

	public PlateCalculator(double weight, int barWeight) {
		this.weight = weight;
		this.barWeight = barWeight;
	}

	public String toString() {
		this.calculate();
		return "45: " + fortyFives +
			"\n35: " + thirtyFives +
			"\n25: " + twentyFives +
			"\n10: " + tens +
			"\n5: " + fives +
			"\n2.5: " + twoAndAHalfs;
	}

	private void calculate() {
		// initalize variables
		fortyFives = thirtyFives = twentyFives = tens = fives = twoAndAHalfs = 0;

		double remainder = (weight - barWeight) / 2;
	
		while (remainder > 0) {
			if (remainder >= 45) {
				++fortyFives;
				remainder -= 45;
			} else if (remainder >= 35) {
				++thirtyFives;
				remainder -= 35;
			} else if (remainder >= 25) {
				++twentyFives;
				remainder -= 25;
			} else if (remainder >= 10 ) {
				++tens;
				remainder -= 10;
			} else if (remainder >= 5) {
				++fives;
				remainder -= 5;
			} else {
				++twoAndAHalfs;
				remainder -= 2.5;
			}
		}	
	}
}
