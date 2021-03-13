package FastReactionsGame;

import java.awt.EventQueue;

public class PrincipalFastReactions {

	public static long deltaTime = 1000 / 30;
	private static MainMenu frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			/**
			 * Run.
			 */
			public void run() {
				try {
					frame = new MainMenu();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}
}
