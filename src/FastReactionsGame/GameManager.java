/*
 * author: Danny Lopez 
 * 1941453-2711
 */
package FastReactionsGame;

import java.util.Random;

public class GameManager {

	private int[] board;
	private int round, state;
	private int reactionTime;

	public int getReactionTime() {
		return reactionTime;
	}

	private Random random;

	public GameManager() {
		board = new int[8];

		round = 0;
		reactionTime = 1500;
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

			reactionTime -= 100;
			board[random.nextInt(1)] = random.nextInt(7) + 1;
		} else if (round < 4) {
			for (int i = 0; i < 4; i++) {
				if (board[i] == 0) {
					board[i] = random.nextInt(7) + 1;
				}
			}

			reactionTime -= 100;
			board[random.nextInt(3)] = random.nextInt(7) + 1;
		} else if (round < 6) {
			for (int i = 0; i < 6; i++) {
				if (board[i] == 0) {
					board[i] = random.nextInt(7) + 1;
				}
			}

			reactionTime -= 100;
			board[random.nextInt(5)] = random.nextInt(7) + 1;
		} else {
			for (int i = 0; i < 8; i++) {
				if (board[i] == 0) {
					board[i] = random.nextInt(7) + 1;
				}
			}

			reactionTime = 700;
			board[random.nextInt(7)] = random.nextInt(7) + 1;
		}
	}

	public void setGameState(boolean buttonPressed) {

		for (int i = 0; i < board.length; i++) {
			if (board[i] == 0)
				return;
			for (int j = i + 1; j < board.length; j++) {

				if (buttonPressed) {
					if (board[j] == board[i]) {
						state = 1;
					} else {
						state = 2;
					}
				} else {
					if (board[j] == board[i] && board[i] != 0) {
						state = 2;
					} else {
						state = 3;
					}
				}
			}
		}
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
		if (state == 2) {
			round--;
		} else {
			round++;
		}
	}

	public int getBoard(int i) {
		return board[i];
	}

	public int getState() {
		return state;
	}
}
