/**
 * The user inputed class
 * @author: Raiyan Afiz
 * @date: December 1, 2019
 * @SID: 105074478  
 */

import java.util.Scanner;

public class HumanPlayer extends Player{
	int current;
	
	/**
	 * Initialize the player symbol 
	 * @param type X or O
	 */
	public HumanPlayer(int type) {
		if (type == 1) {
			this.current = playerX;
		}
		else
			this.current = playerO;
	}
	
	/**
	 * The user inputed location of the symbol
	 * @return the location of the symbol
	 */
	public int Input() {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		System.out.print("Location of input: ");
		input = sc.nextInt();
		
		if (input < 1 || input > 9) {
			System.out.println("Try Again!");
			Input();
		}
		return input;
		
	}
}
