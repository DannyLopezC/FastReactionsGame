package FastReactionsGame;

public class PlayerManager {
	private int attempts, score;
	private int mistakes, accurate;

	public PlayerManager() {
		attempts = 3;
		score = 0;
		mistakes = 0;
		accurate = 0;
	}

	public int getMistakes() {
		return mistakes;
	}

	public int getAccurate() {
		return accurate;
	}

	public int getAttempts() {
		return attempts;
	}

	public int getScore() {
		return score;
	}

	public void reset() {
		attempts = 3;
		score = 0;
		mistakes = 0;
		accurate = 0;
	}

	public void setScreenVariables(int state) {
		switch (state) {
		case 1:
			score += 5;
			accurate++;
			break;
		case 2:
			attempts--;
			mistakes++;
			break;
		}
	}
}
