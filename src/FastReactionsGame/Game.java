package FastReactionsGame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

// TODO: Auto-generated Javadoc
/**
 * The Class Game.
 */
public class Game extends JFrame {

	/**
	 * Instantiates a new game.
	 */
	public Game() {
	}

	/** The content pane. */
	private JPanel contentPane;

	/** The game manager. */
	private GameManager gameManager;

	/** The player manager. */
	private PlayerManager playerManager;

	/** The buttons listener. */
	private ButtonsListener buttonsListener;

	/** The resume listener. */
	private ResumeListener resumeListener;

	/** The btn exit main. */
	JButton btnExitMain;

	/** The btn button. */
	JButton btnButton;

	/** The lbl tile 8 selected. */
	JLabel lblTile8Selected = new JLabel("");

	/** The lbl tile 7 selected. */
	JLabel lblTile7Selected = new JLabel("");

	/** The lbl tile 6 selected. */
	JLabel lblTile6Selected = new JLabel("");

	/** The lbl tile 5 selected. */
	JLabel lblTile5Selected = new JLabel("");

	/** The lbl tile 4 selected. */
	JLabel lblTile4Selected = new JLabel("");

	/** The lbl tile 3 selected. */
	JLabel lblTile3Selected = new JLabel("");

	/** The lbl tile 2 selected. */
	JLabel lblTile2Selected = new JLabel("");

	/** The lbl tile 1 selected. */
	JLabel lblTile1Selected = new JLabel("");

	/** The lbl tile 8 correct. */
	JLabel lblTile8Correct = new JLabel("");

	/** The lbl tile 7 correct. */
	JLabel lblTile7Correct = new JLabel("");

	/** The lbl tile 6 correct. */
	JLabel lblTile6Correct = new JLabel("");

	/** The lbl tile 5 correct. */
	JLabel lblTile5Correct = new JLabel("");

	/** The lbl tile 4 correct. */
	JLabel lblTile4Correct = new JLabel("");

	/** The lbl tile 3 correct. */
	JLabel lblTile3Correct = new JLabel("");

	/** The lbl tile 2 correct. */
	JLabel lblTile2Correct = new JLabel("");

	/** The lbl tile 1 correct. */
	JLabel lblTile1Correct = new JLabel("");

	/** The lbl tile 8. */
	JLabel lblTile8 = new JLabel("");

	/** The lbl tile 7. */
	JLabel lblTile7 = new JLabel("");

	/** The lbl tile 6. */
	JLabel lblTile6 = new JLabel("");

	/** The lbl tile 5. */
	JLabel lblTile5 = new JLabel("");

	/** The lbl tile 4. */
	JLabel lblTile4 = new JLabel("");

	/** The lbl tile 3. */
	JLabel lblTile3 = new JLabel("");

	/** The lbl tile 2. */
	JLabel lblTile2 = new JLabel("");

	/** The lbl tile 1. */
	JLabel lblTile1 = new JLabel("");

	/** The lbl score. */
	JLabel lblScore = new JLabel("");

	/** The lbl lives 1. */
	JLabel lblLives1;

	/** The lbl lives 2. */
	JLabel lblLives2;

	/** The lbl lives 3. */
	JLabel lblLives3;

	/** The timer listener. */
	TimerListener timerListener;

	/** The timer. */
	Timer timer;

	/** The resume timer. */
	Timer resumeTimer;

	/** The delta time. */
	int deltaTime = 1000 / 30;

	/**
	 * Launch the application.
	 */
	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetGame();
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void SetGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1154, 646);
		this.setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		lblTile8Correct = new JLabel("");
		lblTile8Correct.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile8Correct.setBounds(280, 442, 187, 193);
		lblTile8Correct.setIcon(new ImageIcon("src/Images/border_correct.png"));
		lblTile8Correct.setVisible(false);
		contentPane.add(lblTile8Correct);

		lblTile8Selected = new JLabel("");
		lblTile8Selected.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile8Selected.setBounds(280, 442, 187, 193);
		lblTile8Selected.setIcon(new ImageIcon("src/Images/selected.png"));
		contentPane.add(lblTile8Selected);

		lblTile8 = new JLabel("");
		lblTile8.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile8.setBounds(280, 442, 187, 193);
		contentPane.add(lblTile8);

		lblTile7Correct = new JLabel("");
		lblTile7Correct.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile7Correct.setBounds(280, -13, 187, 193);
		lblTile7Correct.setIcon(new ImageIcon("src/Images/border_correct.png"));
		lblTile7Correct.setVisible(false);
		contentPane.add(lblTile7Correct);

		lblTile7Selected = new JLabel("");
		lblTile7Selected.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile7Selected.setBounds(280, -13, 187, 193);
		lblTile7Selected.setIcon(new ImageIcon("src/Images/selected.png"));
		contentPane.add(lblTile7Selected);

		lblTile7 = new JLabel("");
		lblTile7.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile7.setBounds(280, -13, 187, 193);
		contentPane.add(lblTile7);

		lblTile6Correct = new JLabel("");
		lblTile6Correct.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile6Correct.setBounds(733, -13, 187, 193);
		lblTile6Correct.setIcon(new ImageIcon("src/Images/border_correct.png"));
		lblTile6Correct.setVisible(false);
		contentPane.add(lblTile6Correct);

		lblTile6Selected = new JLabel("");
		lblTile6Selected.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile6Selected.setBounds(733, -13, 187, 193);
		lblTile6Selected.setIcon(new ImageIcon("src/Images/selected.png"));
		contentPane.add(lblTile6Selected);

		lblTile6 = new JLabel("");
		lblTile6.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile6.setBounds(733, -13, 187, 193);
		contentPane.add(lblTile6);

		lblTile5Correct = new JLabel("");
		lblTile5Correct.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile5Correct.setBounds(747, 442, 187, 193);
		lblTile5Correct.setIcon(new ImageIcon("src/Images/border_correct.png"));
		lblTile5Correct.setVisible(false);
		contentPane.add(lblTile5Correct);

		lblTile5Selected = new JLabel("");
		lblTile5Selected.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile5Selected.setBounds(747, 442, 187, 193);
		lblTile5Selected.setIcon(new ImageIcon("src/Images/selected.png"));
		contentPane.add(lblTile5Selected);

		lblTile5 = new JLabel("");
		lblTile5.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile5.setBounds(747, 442, 187, 193);
		contentPane.add(lblTile5);

		lblTile4Correct = new JLabel("");
		lblTile4Correct.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile4Correct.setBounds(376, 351, 187, 178);
		lblTile4Correct.setIcon(new ImageIcon("src/Images/border_correct.png"));
		lblTile4Correct.setVisible(false);
		contentPane.add(lblTile4Correct);

		lblTile4Selected = new JLabel("");
		lblTile4Selected.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile4Selected.setBounds(376, 351, 187, 178);
		lblTile4Selected.setIcon(new ImageIcon("src/Images/selected.png"));
		contentPane.add(lblTile4Selected);

		lblTile4 = new JLabel("");
		lblTile4.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile4.setBounds(376, 351, 187, 178);
		contentPane.add(lblTile4);

		lblTile3Correct = new JLabel("");
		lblTile3Correct.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile3Correct.setBounds(391, 90, 180, 184);
		lblTile3Correct.setIcon(new ImageIcon("src/Images/border_correct.png"));
		lblTile3Correct.setVisible(false);
		contentPane.add(lblTile3Correct);

		lblTile3Selected = new JLabel("");
		lblTile3Selected.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile3Selected.setBounds(391, 90, 180, 184);
		lblTile3Selected.setIcon(new ImageIcon("src/Images/selected.png"));
		contentPane.add(lblTile3Selected);

		lblTile3 = new JLabel("");
		lblTile3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile3.setBounds(391, 90, 180, 184);
		contentPane.add(lblTile3);

		lblTile2Correct = new JLabel("");
		lblTile2Correct.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile2Correct.setBounds(632, 90, 187, 193);
		lblTile2Correct.setIcon(new ImageIcon("src/Images/border_correct.png"));
		lblTile2Correct.setVisible(false);
		contentPane.add(lblTile2Correct);

		lblTile2Selected = new JLabel("");
		lblTile2Selected.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile2Selected.setBounds(632, 90, 187, 193);
		lblTile2Selected.setIcon(new ImageIcon("src/Images/selected.png"));
		contentPane.add(lblTile2Selected);

		lblTile2 = new JLabel("");
		lblTile2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile2.setBounds(632, 90, 187, 193);
		contentPane.add(lblTile2);

		lblTile1Correct = new JLabel("");
		lblTile1Correct.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile1Correct.setBounds(632, 339, 201, 193);
		lblTile1Correct.setIcon(new ImageIcon("src/Images/border_correct.png"));
		lblTile1Correct.setVisible(false);
		contentPane.add(lblTile1Correct);

		lblTile1Selected = new JLabel("");
		lblTile1Selected.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile1Selected.setBounds(632, 339, 201, 193);
		lblTile1Selected.setIcon(new ImageIcon("src/Images/selected.png"));
		contentPane.add(lblTile1Selected);

		lblTile1 = new JLabel("");
		lblTile1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile1.setBounds(632, 339, 201, 193);
		contentPane.add(lblTile1);

		gameManager = new GameManager();
		playerManager = new PlayerManager();
		buttonsListener = new ButtonsListener();
		resumeListener = new ResumeListener();

		gameManager.setInBoard(true);
		setBoardUI(true);

		btnExitMain = new JButton("");
		btnExitMain.addActionListener(buttonsListener);
		btnExitMain.setIcon(new ImageIcon(Game.class.getResource("/images/ExitMain.png")));
		btnExitMain.setOpaque(false);
		btnExitMain.setFocusPainted(false);
		btnExitMain.setContentAreaFilled(false);
		btnExitMain.setBorderPainted(false);
		btnExitMain.setBounds(825, 277, 304, 82);

		btnButton = new JButton("");
		btnButton.addActionListener(buttonsListener);
		btnButton.addKeyListener(buttonsListener);
		btnButton.setIcon(new ImageIcon(Game.class.getResource("/images/button@2x.png")));
		btnButton.setOpaque(false);
		btnButton.setFocusPainted(false);
		btnButton.setContentAreaFilled(false);
		btnButton.setBorderPainted(false);
		btnButton.setBounds(547, 250, 110, 114);
		contentPane.add(btnButton);

		lblLives3 = new JLabel("");
		lblLives3.setIcon(new ImageIcon(Game.class.getResource("/images/hp_full@2x.png")));
		lblLives3.setBounds(213, 292, 79, 82);
		contentPane.add(lblLives3);

		lblLives2 = new JLabel("");
		lblLives2.setIcon(new ImageIcon(Game.class.getResource("/images/hp_full@2x.png")));
		lblLives2.setBounds(124, 292, 79, 82);
		contentPane.add(lblLives2);

		lblLives1 = new JLabel("");
		lblLives1.setIcon(new ImageIcon(Game.class.getResource("/images/hp_full@2x.png")));
		lblLives1.setBounds(35, 292, 79, 82);
		contentPane.add(lblLives1);

		lblScore.setText("00" + playerManager.getScore());
		lblScore.setForeground(Color.WHITE);
		lblScore.setFont(new Font("Bahnschrift", Font.PLAIN, 37));
		lblScore.setBounds(155, 227, 110, 54);
		contentPane.add(lblScore);

		JLabel lblScoreString = new JLabel("Score");
		lblScoreString.setForeground(Color.WHITE);
		lblScoreString.setFont(new Font("Bahnschrift", Font.PLAIN, 37));
		lblScoreString.setBounds(35, 227, 110, 54);
		contentPane.add(lblScoreString);
		contentPane.add(btnExitMain);

		JLabel lblBackground = new JLabel("");
		lblBackground.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblBackground.setIcon(new ImageIcon(MainMenu.class.getResource("/images/backGroundInGame.png")));
		lblBackground.setBounds(0, 0, 1154, 646);
		contentPane.add(lblBackground);

		timerListener = new TimerListener();
		timer = new Timer(deltaTime, timerListener);
		resumeTimer = new Timer(1000, resumeListener);

		timer.start();
		time = 0;
		timeNextReset = gameManager.getReactionTime();
	}

	/**
	 * Evaluate game state.
	 */
	private void evaluateGameState() {
		switch (gameManager.getState()) {
		case 1:
			gameManager.setRound();
			setCorrectGUI();
			break;
		case 2:
			int lives = 3 - playerManager.getAttempts();
			gameManager.setRound();
			setLivesGUI(lives);
			break;
		case 3:
			gameManager.setRound();
			gameManager.setInBoard(false);
			setBoardUI(false);
			return;
		}
		playerManager.setScreenVariables(gameManager.getState());

		if (playerManager.getAttempts() <= 0) {
			GameOver gameOver = new GameOver(playerManager.getScore(), playerManager.getAccurate(),
					playerManager.getMistakes());
			gameOver.newGameOver(playerManager.getScore(), playerManager.getAccurate(), playerManager.getMistakes());
			gameManager.reset();
			playerManager.reset();
			timer.stop();
			resumeTimer.stop();
			setVisible(false);
			return;
		}

		timer.stop();
		resumeTimer.start();
	}

	/**
	 * Sets the board UI.
	 *
	 * @param set the new board UI
	 */
	private void setBoardUI(boolean set) {
		lblTile1Correct.setVisible(false);
		lblTile2Correct.setVisible(false);
		lblTile3Correct.setVisible(false);
		lblTile4Correct.setVisible(false);
		lblTile5Correct.setVisible(false);
		lblTile6Correct.setVisible(false);
		lblTile7Correct.setVisible(false);
		lblTile8Correct.setVisible(false);

		lblTile8.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(7) + ".png"));
		lblTile8Selected.setVisible(false);

		lblTile7.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(6) + ".png"));
		lblTile7Selected.setVisible(false);

		lblTile6.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(5) + ".png"));
		lblTile6Selected.setVisible(false);

		lblTile5.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(4) + ".png"));
		lblTile5Selected.setVisible(false);

		lblTile4.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(3) + ".png"));
		lblTile4Selected.setVisible(false);

		lblTile3.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(2) + ".png"));
		lblTile3Selected.setVisible(false);

		lblTile2.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(1) + ".png"));
		lblTile2Selected.setVisible(false);

		lblTile1.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(0) + ".png"));
		lblTile1Selected.setVisible(false);

		lblScore.setText("00" + playerManager.getScore());

		if (set)
			return;

		switch (gameManager.getChangedId()) {
		case 0:
			lblTile1Selected.setVisible(true);
			break;
		case 1:
			lblTile2Selected.setVisible(true);
			break;
		case 2:
			lblTile3Selected.setVisible(true);
			break;
		case 3:
			lblTile4Selected.setVisible(true);
			break;
		case 4:
			lblTile5Selected.setVisible(true);
			break;
		case 5:
			lblTile6Selected.setVisible(true);
			break;
		case 6:
			lblTile7Selected.setVisible(true);
			break;
		case 7:
			lblTile8Selected.setVisible(true);
			break;
		}
	}

	/**
	 * Sets the lives GUI.
	 *
	 * @param lives the new lives GUI
	 */
	public void setLivesGUI(int lives) {
		switch (lives) {
		case 2:
			lblLives3.setIcon(new ImageIcon(Game.class.getResource("/images/hp_empty@2x.png")));
			break;
		case 1:
			lblLives2.setIcon(new ImageIcon(Game.class.getResource("/images/hp_empty@2x.png")));
			break;
		case 0:
			lblLives1.setIcon(new ImageIcon(Game.class.getResource("/images/hp_empty@2x.png")));
			break;
		}

	}

	/**
	 * Sets the correct GUI.
	 */
	public void setCorrectGUI() {
		lblTile8Selected.setVisible(false);
		lblTile7Selected.setVisible(false);
		lblTile6Selected.setVisible(false);
		lblTile5Selected.setVisible(false);
		lblTile4Selected.setVisible(false);
		lblTile3Selected.setVisible(false);
		lblTile2Selected.setVisible(false);
		lblTile1Selected.setVisible(false);

		lblTile1Correct.setVisible(false);
		lblTile2Correct.setVisible(false);
		lblTile3Correct.setVisible(false);
		lblTile4Correct.setVisible(false);
		lblTile5Correct.setVisible(false);
		lblTile6Correct.setVisible(false);
		lblTile7Correct.setVisible(false);
		lblTile8Correct.setVisible(false);

		switch (gameManager.getChangedId()) {
		case 0:
			lblTile1Correct.setVisible(true);
			break;
		case 1:
			lblTile2Correct.setVisible(true);
			break;
		case 2:
			lblTile3Correct.setVisible(true);
			break;
		case 3:
			lblTile4Correct.setVisible(true);
			break;
		case 4:
			lblTile5Correct.setVisible(true);
			break;
		case 5:
			lblTile6Correct.setVisible(true);
			break;
		case 6:
			lblTile7Correct.setVisible(true);
			break;
		case 7:
			lblTile8Correct.setVisible(true);
			break;
		}

		switch (gameManager.getCorrectId()) {
		case 0:
			lblTile1Correct.setVisible(true);
			break;
		case 1:
			lblTile2Correct.setVisible(true);
			break;
		case 2:
			lblTile3Correct.setVisible(true);
			break;
		case 3:
			lblTile4Correct.setVisible(true);
			break;
		case 4:
			lblTile5Correct.setVisible(true);
			break;
		case 5:
			lblTile6Correct.setVisible(true);
			break;
		case 6:
			lblTile7Correct.setVisible(true);
			break;
		case 7:
			lblTile8Correct.setVisible(true);
			break;
		}
	}

	/**
	 * The listener interface for receiving buttons events. The class that is
	 * interested in processing a buttons event implements this interface, and the
	 * object created with that class is registered with a component using the
	 * component's <code>addButtonsListener<code> method. When the buttons event
	 * occurs, that object's appropriate method is invoked.
	 *
	 * @see ButtonsEvent
	 */
	private class ButtonsListener implements ActionListener, KeyListener {

		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			if (e.getSource() == btnExitMain) {
				MainMenu mainMenu = new MainMenu();
				mainMenu.newMain();
				gameManager.reset();
				playerManager.reset();
				setVisible(false);
				timer.stop();
				resumeTimer.stop();
			}

			if (e.getSource() == btnButton) {
				gameManager.setGameState(true);
				evaluateGameState();
			}
		}

		/**
		 * Key pressed.
		 *
		 * @param e the e
		 */
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if (e.getKeyCode() == 10) {
				gameManager.setGameState(true);
				evaluateGameState();
			}
		}

		/**
		 * Key released.
		 *
		 * @param e the e
		 */
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		/**
		 * Key typed.
		 *
		 * @param e the e
		 */
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}
	}

	/**
	 * The listener interface for receiving timer events. The class that is
	 * interested in processing a timer event implements this interface, and the
	 * object created with that class is registered with a component using the
	 * component's <code>addTimerListener<code> method. When the timer event occurs,
	 * that object's appropriate method is invoked.
	 *
	 * @see TimerEvent
	 */
	public class TimerListener implements ActionListener {

		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Update();
		}
	}

	/** The time. */
	int time;

	/** The time next reset. */
	int timeNextReset;

	/**
	 * Update.
	 */
	public void Update() {
		time += deltaTime;
//		System.out.println("current time: " + time);
		if (time >= timeNextReset) {
//				game.resetListener.actionPerformed(null);

			gameManager.setGameState(false);
			evaluateGameState();

			timeNextReset = time + gameManager.getReactionTime();
		}
	}

	/**
	 * The listener interface for receiving resume events. The class that is
	 * interested in processing a resume event implements this interface, and the
	 * object created with that class is registered with a component using the
	 * component's <code>addResumeListener<code> method. When the resume event
	 * occurs, that object's appropriate method is invoked.
	 *
	 * @see ResumeEvent
	 */
	public class ResumeListener implements ActionListener {

		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			gameManager.setInBoard(true);
			setBoardUI(true);
			timer.start();
			resumeTimer.stop();
		}
	}
}