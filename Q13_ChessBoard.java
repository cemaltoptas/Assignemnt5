
public class Q13_ChessBoard {

	public static void main(String[] args) {

		int row = 8;
		
		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= 8; j++) {

				if ((i + j) % 2 == 0) {
					System.out.print("B ");
				} else {

					System.out.print("W ");
				}
			}
			System.out.println();
		}

	}

}
