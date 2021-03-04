package FastReactionsGame;

public class PlayerManager {
	private int attempts, score;

	public PlayerManager() {
		attempts = 3;
		score = 0;
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
