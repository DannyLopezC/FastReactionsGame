package FastReactionsGame;

import java.util.Scanner;

public class ConsoleView {
	private Scanner input;
	private GameManager gameManager;
	private PlayerManager playerManager;
	private boolean isLeaving;

	public ConsoleView() {
		gameManager = new GameManager();
		playerManager = new PlayerManager();
		input = new Scanner(System.in);

	}

	/**
	 * Start game.
	 */
	public void startGame() {
		if (gameManager.getState() == 1 || gameManager.getState() == 2 || gameManager.getState() == 0) {
			gameManager.setInBoard(true);
		} else {
			gameManager.setInBoard(false);
		}

		for (int i = 0; i < 8; i++) {
			System.out.print(gameManager.getBoard(i) + ",");
		}
		System.out.println("\n");

		System.out.println("press button? \n");

		if (input.nextLine().equals("y")) {
			gameManager.setGameState(true);

			switch (gameManager.getState()) {
			case 1:
				gameManager.setRound();
				System.out.println("correcto");
				break;
			case 2:
				gameManager.setRound();
				System.out.println("no");
				System.out.println(gameManager.getState() + "state");
				break;
			}
		} else {
			gameManager.setGameState(false);

			switch (gameManager.getState()) {
			case 2:
				gameManager.setRound();
				System.out.println("debiste press");
				break;

			case 3:
				gameManager.setRound();
				System.out.println("sigue");
			}
		}

		if (playerManager.getAttempts() <= 0)
			isLeaving = true;

		if (!isLeaving)
			startGame();
	}
}
