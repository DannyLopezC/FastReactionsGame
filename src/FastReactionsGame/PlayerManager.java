package FastReactionsGame;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerManager.
 */
public class PlayerManager {

	/** The score. */
	private int attempts, score;

	/** The accurate. */
	private int mistakes, accurate;

	/**
	 * Instantiates a new player manager.
	 */
	public PlayerManager() {
		attempts = 3;
		score = 0;
		mistakes = 0;
		accurate = 0;
	}

	/**
	 * Gets the mistakes.
	 *
	 * @return the mistakes
	 */
	public int getMistakes() {
		return mistakes;
	}

	/**
	 * Gets the accurate.
	 *
	 * @return the accurate
	 */
	public int getAccurate() {
		return accurate;
	}

	/**
	 * Gets the attempts.
	 *
	 * @return the attempts
	 */
	public int getAttempts() {
		return attempts;
	}

	/**
	 * Gets the score.
	 *
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Reset.
	 */
	public void reset() {
		attempts = 3;
		score = 0;
		mistakes = 0;
		accurate = 0;
	}

	/**
	 * Sets the screen variables.
	 *
	 * @param state the new screen variables
	 */
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
