import java.util.Scanner;

public class Transaction {

	static private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter number of Transactions");

		int numberOfTransactions = sc.nextInt();

		int[] transactions = new int[numberOfTransactions];

		System.out.println("Enter the Transactions");

		for (int i = 0; i < transactions.length; i++) {

			transactions[i] = sc.nextInt();
		}

		System.out.println("Enter Number of Targets");

		int numberOfTargets = sc.nextInt();

		for (int i = 0; i < numberOfTargets; i++) {
			System.out.println("Enter the target");
			int target = sc.nextInt();

			int sum = 0;

			for (int j = 0; j < transactions.length; j++) {

				sum = sum + transactions[j];

				if (sum >= target) {
					System.out.println("Target achieved after " + (j + 1) + " transactions");
					break;
				}

				if (j == transactions.length - 1) {
					System.out.println("Target not achieved");
				}

			}

		}

	}

}
