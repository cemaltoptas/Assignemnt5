import java.util.Scanner;

public class Q8_Sum_Of_Numbers {

	public static void main(String[] args) {

		// It calculates the sum of the numbers from 1 till upper bound.

		Scanner sc = new Scanner(System.in);

		int upperBoundNumber;
		int i = 1;
		int sum = 0;

		System.out.println("Enter a number to find the sum of the numbers from 1 till upper bound");
		upperBoundNumber = sc.nextInt();

		while (i <= upperBoundNumber) {
			sum = sum + i;
			i++;
		}
		System.out.println("THE SUM of upperbound number is " + sum);
	}

}
