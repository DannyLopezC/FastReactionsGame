package FastReactionsGame;

import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

public class PrincipalFastReactions {

	public static long deltaTime = 1000 / 30;
	private static MainMenu frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
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

//		Timer timer = new Timer();
//
//		timer.schedule(new TimerTask() {
//			public void run() {
//				// do your work
//				if (frame != null)
//					frame.Update();
//			}
//		}, deltaTime, deltaTime);

//		ConsoleView consoleview = new ConsoleView();
//		consoleview.startGame();
	}
}
