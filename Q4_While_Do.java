import java.util.Scanner;

public class Q4_While_Do {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number;
		int product = 0;

		while (product < 100) {
			System.out.println("Enter a number:");
			number = sc.nextInt();
			product = number * 10;	
		}
		System.out.println("product= " + product);
		System.out.println("Product value is bigger than 100");

	}

}
