/*
 * author: Danny Lopez 
 * 1941453-2711
 */
package FastReactionsGame;

import java.util.Random;

public class GameManager {

	private int[] colors;
	private int[] board;
	private int round, state;

	private Random random;

	public GameManager() {
		colors = board = new int[8];
		for (int i = 1; i < 9; i++) {
			colors[i] = i;
		}

		round = 0;
		random = new Random();
	}

	/**
	 * Sets the board.
	 */
	public void setBoard() {
		if (round < 2) {
			// setting the board if didnt before
			for (int i = 0; i < 2; i++) {
				if (board[i] == 0) {
					board[i] = random.nextInt(7) + 1;
				}
			}

			board[random.nextInt(1)] = random.nextInt(7) + 1;
		} else if (round < 4) {
			for (int i = 0; i < 4; i++) {
				if (board[i] == 0) {
					board[i] = random.nextInt(7) + 1;
				}
			}
			board[random.nextInt(3)] = random.nextInt(7) + 1;
		} else if (round < 6) {
			for (int i = 0; i < 6; i++) {
				if (board[i] == 0) {
					board[i] = random.nextInt(7) + 1;
				}
			}
			board[random.nextInt(5)] = random.nextInt(7) + 1;
		} else {
			for (int i = 0; i < 8; i++) {
				if (board[i] == 0) {
					board[i] = random.nextInt(7) + 1;
				}
			}
			board[random.nextInt(7)] = random.nextInt(7) + 1;
		}
	}

	public void setGameState(boolean buttonPressed) {
		int localInt = 0;
		for (int i = 0; i < board.length; i++) {
			if (board[localInt] == board[i]) {
				if (buttonPressed) {
					state = 1;
					return;
				} else {
					state = 2;
					return;
				}
			}

			localInt++;
		}
		state = 3;
	}

	public void reset() {
		for (int i = 0; i < board.length; i++) {
			board[i] = 0;
		}

		round = 0;
	}

	public int getRound() {
		return round;
	}

	public void setRound() {
		this.round++;
	}

	public int[] getColors() {
		return colors;
	}

	public int[] getBoard() {
		return board;
	}

	public int getState() {
		return state;
	}
}
