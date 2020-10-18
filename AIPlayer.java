
/**
 * The AI player
 * @author: Raiyan Afiz
 * @date: Oct 17, 2020 
 */
import java.util.Random;

public class AIPlayer extends Player {
	int current;

	/**
	 * Initialize the player symbol
	 * 
	 * @param type X or O
	 */
	public AIPlayer(int type) {
		if (type == 1) {
			this.current = playerX;
		} else
			this.current = playerO;
	}

	/**
	 * Chooses a location that has not been played
	 * 
	 * @param one receives which location has been used
	 * @return random location
	 */
	public int BasicAi(int[] one) {
		int random = 0;
		Random rnd = new Random();

		for (int i = 0; i < 9; i++) {
			random = rnd.nextInt((9 - 1) + 1) + 1;
			if (i != 8 || one[i] != random) {
				return random;
			}
		}
		return random;
	}
}
