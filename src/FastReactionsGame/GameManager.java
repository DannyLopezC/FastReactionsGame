/*
 * author: Danny Lopez 
 * 1941453-2711
 */
package FastReactionsGame;

import java.util.ArrayList;
import java.util.Random;

public class GameManager {

	private ArrayList<Integer> inBoard, outBoard;
	private int pieces;
	private int round, state;
	private int reactionTime;
	private boolean isDuplicate;

	public int getReactionTime() {
		return reactionTime;
	}

	private Random random;

	public GameManager() {
		inBoard = new ArrayList<Integer>();
		outBoard = new ArrayList<Integer>();
		setOutBoard();

		round = 0;
		pieces = 3;
		reactionTime = 2500;
		random = new Random();
	}

	public int getPieces() {
		return pieces;
	}

	public void setOutBoard() {
		outBoard.clear();
		for (int i = 0; i < 12; i++) {
			outBoard.add(i + 1);
		}
	}

	/**
	 * Sets the board.
	 */
	public void setInBoard(boolean set) {
		if (set) {
			inBoard.clear();
			setOutBoard();
			for (int i = 0; i < pieces; i++) {
				int id = random.nextInt(outBoard.size());
				inBoard.add(outBoard.get(id));
				outBoard.remove(id);
			}
		} else {
			isDuplicate = random.nextInt(2) == 1 ? true : false;

			int id = random.nextInt(pieces);
			if (isDuplicate) {
				int targetId = 0;

				do {
					targetId = random.nextInt(pieces);
				} while (id == targetId);

				inBoard.set(id, inBoard.get(targetId));

			} else {
				int inValue = inBoard.get(id);
				int outId = random.nextInt(outBoard.size());
				inBoard.set(id, outBoard.get(outId));
				outBoard.remove(outId);
				outBoard.add(inValue);
			}
		}
	}

	public void setGameState(boolean buttonPressed) {

		if (buttonPressed) {
			if (isDuplicate) {
				state = 1;
			} else {
				state = 2;
			}
		} else {
			if (isDuplicate) {
				state = 2;
			} else {
				state = 3;
			}
		}
	}

	public void reset() {
		setOutBoard();

		round = 0;
		pieces = 3;
		reactionTime = 2500;
	}

	public int getRound() {
		return round;
	}

	public void setRound() {
		switch (state) {
		case 1:
			round++;
			if (pieces < 8)
				pieces++;
			break;
		case 2:
			if (round > 0)
				round--;
			if (pieces > 3)
				pieces--;
			break;
		}
	}

	public int getBoard(int i) {

		if (inBoard.size() <= i) {
			return 0;
		} else {
			return inBoard.get(i);
		}
	}

	public int getState() {
		return state;
	}
}
