import java.util.Scanner;

public class Q9_OlddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int finalNumber;
		int i = 1;
		String comma = "";

		System.out.println("Enter end number");
		finalNumber = sc.nextInt();

	 while (i <= finalNumber) {

			if (i % 2 != 0) {

				System.out.print(comma + i);
				comma = ",";
			}
			i++;
		}    
		
		
	}
}
