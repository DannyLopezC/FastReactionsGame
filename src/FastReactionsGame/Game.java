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

public class Game extends JFrame {
	public Game() {
	}

	private JPanel contentPane;
	private GameManager gameManager;
	private PlayerManager playerManager;

	private ButtonsListener buttonsListener;
	public ResetListener resetListener;

	private boolean isButton;
	private boolean stop;

	JButton btnExitMain;
	JButton btnButton;

	JLabel lblTile8Selected = new JLabel("");
	JLabel lblTile7Selected = new JLabel("");
	JLabel lblTile6Selected = new JLabel("");
	JLabel lblTile5Selected = new JLabel("");
	JLabel lblTile4Selected = new JLabel("");
	JLabel lblTile3Selected = new JLabel("");
	JLabel lblTile2Selected = new JLabel("");
	JLabel lblTile1Selected = new JLabel("");

	JLabel lblTile8Correct = new JLabel("");
	JLabel lblTile7Correct = new JLabel("");
	JLabel lblTile6Correct = new JLabel("");
	JLabel lblTile5Correct = new JLabel("");
	JLabel lblTile4Correct = new JLabel("");
	JLabel lblTile3Correct = new JLabel("");
	JLabel lblTile2Correct = new JLabel("");
	JLabel lblTile1Correct = new JLabel("");

	JLabel lblTile8 = new JLabel("");
	JLabel lblTile7 = new JLabel("");
	JLabel lblTile6 = new JLabel("");
	JLabel lblTile5 = new JLabel("");
	JLabel lblTile4 = new JLabel("");
	JLabel lblTile3 = new JLabel("");
	JLabel lblTile2 = new JLabel("");
	JLabel lblTile1 = new JLabel("");
	JLabel lblScore = new JLabel("");

	JLabel lblLives1;
	JLabel lblLives2;
	JLabel lblLives3;

	TimerListener timerListener;
	Timer timer;
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
		resetListener = new ResetListener();

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

		timer.start();
		time = 0;
		timeNextReset = 1000;
	}

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
			stop = true;
			setVisible(false);
			return;
		}

		gameManager.setInBoard(true);
		setBoardUI(true);
	}

	private void setBoardUI(boolean set) {
		lblTile8Selected.setVisible(false);
		lblTile7Selected.setVisible(false);
		lblTile6Selected.setVisible(false);
		lblTile5Selected.setVisible(false);
		lblTile4Selected.setVisible(false);
		lblTile3Selected.setVisible(false);
		lblTile2Selected.setVisible(false);
		lblTile1Selected.setVisible(false);

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

	public void setCorrectGUI() {
		lblTile8Selected.setVisible(false);
		lblTile7Selected.setVisible(false);
		lblTile6Selected.setVisible(false);
		lblTile5Selected.setVisible(false);
		lblTile4Selected.setVisible(false);
		lblTile3Selected.setVisible(false);
		lblTile2Selected.setVisible(false);
		lblTile1Selected.setVisible(false);

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

	private class ButtonsListener implements ActionListener, KeyListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			if (e.getSource() == btnExitMain) {
				MainMenu mainMenu = new MainMenu();
				mainMenu.newMain();
				gameManager.reset();
				playerManager.reset();
				setVisible(false);
			}

			if (e.getSource() == btnButton) {
				isButton = true;
			}
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if (e.getKeyCode() == 10) {
				isButton = true;
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}
	}

	public class ResetListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		}
	}

	public class TimerListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Update();
		}
	}

	int time;
	int timeNextReset;

	public void Update() {
		if (stop)
			return;

		time += deltaTime;
//		System.out.println("current time: " + time);
		if (time >= timeNextReset) {
//				game.resetListener.actionPerformed(null);

			gameManager.setGameState(isButton);
			evaluateGameState();
			isButton = false;

			timeNextReset = time + 1000;
		}
	}
}