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

	public void setMistakes() {
		mistakes++;
	}

	public int getAccurate() {
		return accurate;
	}

	public void setAccurate() {
		accurate++;
	}

	public int getAttempts() {
		return attempts;
	}

	public void setAttempts() {
		attempts--;
	}

	public int getScore() {
		return score;
	}

	public void setScore() {
		score += 50;
	}

	public void reset() {
		attempts = 3;
		score = 0;
	}
}
