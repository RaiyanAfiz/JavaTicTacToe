
/**
 * This class is responsible for the board
 * 
 * @author: Raiyan Afiz
 * @date: Oct 17, 2020
 */
public class Board {
	int[][] myBoard = new int[3][3];
	int[] dont = new int[9];
	int i = 0; // create all global elements

	/**
	 * This constructor is used to initialize the arrays
	 */
	public Board() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) { // Initialize the board
				myBoard[i][j] = 0;
			}
		}
		for (int j = 0; j < 9; j++) {
			dont[j] = 0;
		}
	}

	/**
	 * Displays the board
	 */
	public void Display() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) { // Display the board
				if (myBoard[i][j] == 1) {
					System.out.printf("X ");
				} else if (myBoard[i][j] == 2) {
					System.out.printf("O ");
				} else {
					System.out.printf("%d ", myBoard[i][j]);
				}
			}
			System.out.printf("\n");
		}

	}

	/**
	 * Lets the user know who won
	 */
	public void EndGame() {
		if (myBoard[0][0] == 1 && myBoard[0][1] == 1 && myBoard[0][2] == 1) {
			System.out.printf("X Won");
			System.exit(0);
		}
		if (myBoard[1][0] == 1 && myBoard[1][1] == 1 && myBoard[1][2] == 1) {
			System.out.printf("X Won");
			System.exit(0);
		}
		if (myBoard[2][0] == 1 && myBoard[2][1] == 1 && myBoard[2][2] == 1) {
			System.out.printf("X Won");
			System.exit(0);
		}
		if (myBoard[0][0] == 1 && myBoard[1][1] == 1 && myBoard[2][2] == 1) {
			System.out.printf("X Won");
			System.exit(0);
		}
		if (myBoard[0][2] == 1 && myBoard[1][1] == 1 && myBoard[2][0] == 1) {
			System.out.printf("X Won");
			System.exit(0);
		}

		if (myBoard[0][0] == 2 && myBoard[0][1] == 2 && myBoard[0][2] == 2) {
			System.out.printf("O Won");
			System.exit(0);
		}
		if (myBoard[1][0] == 2 && myBoard[1][1] == 2 && myBoard[1][2] == 2) {
			System.out.printf("O Won");
			System.exit(0);
		}
		if (myBoard[2][0] == 2 && myBoard[2][1] == 2 && myBoard[2][2] == 2) {
			System.out.printf("O Won");
			System.exit(0);
		}
		if (myBoard[0][0] == 2 && myBoard[1][1] == 2 && myBoard[2][2] == 2) {
			System.out.printf("O Won");
			System.exit(0);
		}
		if (myBoard[0][2] == 2 && myBoard[1][1] == 2 && myBoard[2][0] == 2) {
			System.out.printf("O Won");
			System.exit(0);
		}
	}

	/**
	 * Updates the game board
	 * 
	 * @param loacte  given by game and is the location of the symbol
	 * @param sysmbol can be 'X' or 'O'
	 */
	public void Choose(int loacte, int sysmbol) {
		loacte = Illigal(loacte);
		switch (loacte) {
			case 1:
				myBoard[0][0] = sysmbol;
				dont[i] = 1;
				i++;
				break;
			case 2:
				myBoard[0][1] = sysmbol;
				dont[i] = 2;
				i++;
				break;
			case 3:
				myBoard[0][2] = sysmbol;
				dont[i] = 3;
				i++;
				break;
			case 4:
				myBoard[1][0] = sysmbol;
				dont[i] = 4;
				i++;
				break;
			case 5:
				myBoard[1][1] = sysmbol;
				dont[i] = 6;
				i++;
				break;
			case 6:
				myBoard[1][2] = sysmbol;
				dont[i] = 6;
				i++;
				break;
			case 7:
				myBoard[2][0] = sysmbol;
				dont[i] = 7;
				i++;
				break;
			case 8:
				myBoard[2][1] = sysmbol;
				dont[i] = 8;
				i++;
				break;
			case 9:
				myBoard[2][2] = sysmbol;
				dont[i] = 9;
				i++;
				break;
			default:
				System.out.println("End Reached");
		}
	}

	/**
	 * Check to see if location has been used
	 * 
	 * @param loacte location of the symbol
	 * @return if location is valid
	 */
	private int Illigal(int loacte) {
		for (int j = 0; j < 9; j++)
			if (loacte != dont[j]) {
				return loacte;
			}

		return loacte + 1;
	}

}
