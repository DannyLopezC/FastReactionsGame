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
	private int changedId, correctId;
	private int reactionTime;
	private boolean isDuplicate;

	public int getReactionTime() {
		return reactionTime;
	}

	/** The random. */
	private Random random;

	public GameManager() {
		inBoard = new ArrayList<Integer>();
		outBoard = new ArrayList<Integer>();
		setOutBoard();

		round = 0;
		pieces = 3;
		reactionTime = 2100;
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
			isDuplicate = false;
			inBoard.clear();
			setOutBoard();
			for (int i = 0; i < pieces; i++) {
				int id = random.nextInt(outBoard.size());
				inBoard.add(outBoard.get(id));
				outBoard.remove(id);
			}
		} else {
			isDuplicate = random.nextBoolean();

			int id = random.nextInt(pieces);
			if (isDuplicate) {
				int targetId = 0;

				do {
					targetId = random.nextInt(pieces);
				} while (id == targetId);

				inBoard.set(id, inBoard.get(targetId));
				correctId = targetId;

			} else {
				int inValue = inBoard.get(id);
				int outId = random.nextInt(outBoard.size());
				inBoard.set(id, outBoard.get(outId));
				outBoard.remove(outId);
				outBoard.add(inValue);
			}
			changedId = id;
		}
	}

	public void setGameState(boolean buttonPressed) {
		System.out.println("buttonPressed: " + buttonPressed + "\n" + "duplicate: " + isDuplicate);
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
		System.out.println("state: " + state + "\n");
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

	public int getChangedId() {
		return changedId;
	}

	public int getCorrectId() {
		return correctId;
	}

	public void setRound() {
		switch (state) {
		case 1:
			if (reactionTime > 700)
				reactionTime -= 200;

			round++;
			if (pieces < 8)
				pieces++;
			break;
		case 2:
			if (reactionTime < 2100)
				reactionTime += 200;
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
