/**
 * This the class the uses every other class
 * to run the game
 * @author: Raiyan Afiz
 * @date: December 1, 2019
 * @SID: 105074478  
 */

import java.util.*;
public class Game {
		Board newBoard = new Board();
		AIPlayer aiPlaysO = new AIPlayer(2);
		HumanPlayer userX = new HumanPlayer(1);
		HumanPlayer userO = new HumanPlayer(2); //initialize all the classes 
	/**
	 * Starts the game
	 */
	public void Start() {
		System.out.println("Welcome to the game of Tic-Tack-Toe");
		System.out.println("Select your game!");
		System.out.println("Enter '1' for human vs human");
		System.out.println("Enter '2' for human vs AI");
		ValidStartGame();
	}
	
	/**
	 * Validates the start choice
	 */
	private void ValidStartGame() {
		Scanner sc = new Scanner(System.in);
		int choice;
		for(;;) {
			choice = sc.nextInt();
			if (choice == 1) {
				//sc.close();
				UserVsUser();
				return;
			}
			else if (choice == 2) {
				//sc.close();
				UserVsAi();
				return;
			}
			else {
				System.out.println("Try Again!");
			}
		}
	}

	/**
	 * User vs the AI Option
	 */
	private void UserVsAi() {
		int sysmbol, location;
		for (;;) {
			newBoard.EndGame();
			newBoard.Display();
			location = userX.Input();
			sysmbol = userX.current;
			newBoard.Choose(location, sysmbol);
			
			newBoard.EndGame();
			newBoard.Display();
			location = aiPlaysO.BasicAi(newBoard.dont);
			sysmbol = aiPlaysO.current;
			newBoard.Choose(location, sysmbol);
		}
	}

	/**
	 * User vs the User Option 
	 */
	private void UserVsUser() {
		int sysmbol, location;
		for (;;) {
			newBoard.EndGame();
			newBoard.Display();
			location = userX.Input();
			sysmbol = userX.current;
			newBoard.Choose(location, sysmbol);
			
			newBoard.EndGame();
			newBoard.Display();
			location = userO.Input();
			sysmbol = userO.current;
			newBoard.Choose(location, sysmbol);
		}

		
	}
	
	
}
