package FastReactionsGame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Game extends JFrame {

	private JPanel contentPane;
	private GameManager gameManager;
	private PlayerManager playerManager;
	private Listener listener;
	private boolean isButton;
	private long timer;

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

	JLabel lblTile8 = new JLabel("");
	JLabel lblTile7 = new JLabel("");
	JLabel lblTile6 = new JLabel("");
	JLabel lblTile5 = new JLabel("");
	JLabel lblTile4 = new JLabel("");
	JLabel lblTile3 = new JLabel("");
	JLabel lblTile2 = new JLabel("");
	JLabel lblTile1 = new JLabel("");
	JLabel lblScore = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Game() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1154, 646);
//		this.setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		lblTile8Selected = new JLabel("");
		lblTile8Selected.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile8Selected.setBounds(280, 442, 187, 193);
		contentPane.add(lblTile8Selected);

		lblTile8 = new JLabel("");
		lblTile8.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile8.setBounds(280, 442, 187, 193);
		contentPane.add(lblTile8);

		lblTile7Selected = new JLabel("");
		lblTile7Selected.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile7Selected.setBounds(280, 442, 187, 193);
		contentPane.add(lblTile7Selected);

		lblTile7 = new JLabel("");
		lblTile7.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile7.setBounds(280, -13, 187, 193);
		contentPane.add(lblTile7);

		lblTile6Selected = new JLabel("");
		lblTile6Selected.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile6Selected.setBounds(280, 442, 187, 193);
		contentPane.add(lblTile6Selected);

		lblTile6 = new JLabel("");
		lblTile6.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile6.setBounds(733, -13, 187, 193);
		contentPane.add(lblTile6);

		lblTile5Selected = new JLabel("");
		lblTile5Selected.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile5Selected.setBounds(280, 442, 187, 193);
		contentPane.add(lblTile5Selected);

		lblTile5 = new JLabel("");
		lblTile5.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile5.setBounds(747, 442, 187, 193);
		contentPane.add(lblTile5);

		lblTile4Selected = new JLabel("");
		lblTile4Selected.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile4Selected.setBounds(280, 442, 187, 193);
		contentPane.add(lblTile4Selected);

		lblTile4 = new JLabel("");
		lblTile4.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile4.setBounds(376, 351, 187, 178);
		contentPane.add(lblTile4);

		lblTile3Selected = new JLabel("");
		lblTile3Selected.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile3Selected.setBounds(280, 442, 187, 193);
		contentPane.add(lblTile3Selected);

		lblTile3 = new JLabel("");
		lblTile3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile3.setBounds(391, 90, 180, 184);
		contentPane.add(lblTile3);

		lblTile2Selected = new JLabel("");
		lblTile2Selected.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile2Selected.setBounds(280, 442, 187, 193);
		contentPane.add(lblTile2Selected);

		lblTile2 = new JLabel("");
		lblTile2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile2.setBounds(632, 90, 187, 193);
		contentPane.add(lblTile2);

		lblTile1Selected = new JLabel("");
		lblTile1Selected.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile1Selected.setBounds(280, 442, 187, 193);
		contentPane.add(lblTile1Selected);

		lblTile1 = new JLabel("");
		lblTile1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile1.setBounds(632, 339, 201, 193);
		contentPane.add(lblTile1);

		gameManager = new GameManager();
		playerManager = new PlayerManager();
		listener = new Listener();

		gameManager.setInBoard(true);
		setBoardUI();

		btnExitMain = new JButton("");
		btnExitMain.addActionListener(listener);
		btnExitMain.setIcon(new ImageIcon(Game.class.getResource("/images/ExitMain.png")));
		btnExitMain.setOpaque(false);
		btnExitMain.setFocusPainted(false);
		btnExitMain.setContentAreaFilled(false);
		btnExitMain.setBorderPainted(false);
		btnExitMain.setBounds(825, 277, 304, 82);

		btnButton = new JButton("");
		btnButton.addActionListener(listener);
		btnButton.setIcon(new ImageIcon(Game.class.getResource("/images/button@2x.png")));
		btnButton.setOpaque(false);
		btnButton.setFocusPainted(false);
		btnButton.setContentAreaFilled(false);
		btnButton.setBorderPainted(false);
		btnButton.setBounds(547, 250, 110, 114);
		contentPane.add(btnButton);

		JLabel lblLives3 = new JLabel("");
		lblLives3.setIcon(new ImageIcon(Game.class.getResource("/images/hp_full@2x.png")));
		lblLives3.setBounds(213, 292, 79, 82);
		contentPane.add(lblLives3);

		JLabel lblLives2 = new JLabel("");
		lblLives2.setIcon(new ImageIcon(Game.class.getResource("/images/hp_full@2x.png")));
		lblLives2.setBounds(124, 292, 79, 82);
		contentPane.add(lblLives2);

		JLabel lblLives1 = new JLabel("");
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
	}

	private void evaluateGameState() {
		switch (gameManager.getState()) {
		case 1:
			gameManager.setRound();
			break;
		case 2:
			gameManager.setRound();
//			System.out.println("pierde");
			break;
		case 3:
			gameManager.setRound();
			gameManager.setInBoard(false);
			setBoardUI();
			return;
		}
		playerManager.setScreenVariables(gameManager.getState());

		if (playerManager.getAttempts() <= 0) {
			GameOver gameOver = new GameOver(playerManager.getScore(), playerManager.getAccurate(),
					playerManager.getMistakes());
			gameOver.newGameOver(playerManager.getScore(), playerManager.getAccurate(), playerManager.getMistakes());
			gameManager.reset();
			playerManager.reset();
			setVisible(false);
			return;
		}

		gameManager.setInBoard(true);
		setBoardUI();
	}

	private void setBoardUI() {
		System.out.println("gui");
		lblTile8.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(7) + ".png"));
//		lblTile8Selected.setIcon(null);

		lblTile7.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(6) + ".png"));
//		lblTile7Selected.setIcon(null);

		lblTile6.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(5) + ".png"));
//		lblTile6Selected.setIcon(null);

		lblTile5.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(4) + ".png"));
//		lblTile5Selected.setIcon(null);

		lblTile4.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(3) + ".png"));
//		lblTile4Selected.setIcon(null);

		lblTile3.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(2) + ".png"));
//		lblTile3Selected.setIcon(null);

		lblTile2.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(1) + ".png"));
//		lblTile2Selected.setIcon(null);

		lblTile1.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(0) + ".png"));
//		lblTile1Selected.setIcon(null);

		lblScore.setText("00" + playerManager.getScore());

//		try {
//			switch (gameManager.getChangedId()) {
//			case 0:
//				lblTile1Selected.setIcon(new ImageIcon("src/Images/selected.png"));
//				break;
//			case 1:
//				lblTile2Selected.setIcon(new ImageIcon("src/Images/selected.png"));
//				break;
//			case 2:
//				lblTile3Selected.setIcon(new ImageIcon("src/Images/selected.png"));
//				break;
//			case 3:
//				lblTile4Selected.setIcon(new ImageIcon("src/Images/selected.png"));
//				break;
//			case 4:
//				lblTile5Selected.setIcon(new ImageIcon("src/Images/selected.png"));
//				break;
//			case 5:
//				lblTile6Selected.setIcon(new ImageIcon("src/Images/selected.png"));
//				break;
//			case 6:
//				lblTile7Selected.setIcon(new ImageIcon("src/Images/selected.png"));
//				break;
//			case 7:
//				lblTile8Selected.setIcon(new ImageIcon("src/Images/selected.png"));
//				break;
//			}
//		} catch (NullPointerException e) {
//			return;
//		}

		contentPane.repaint();
	}

	private class Listener implements ActionListener {

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
	}

	public void Update() {
		if (timer >= 60) {
			gameManager.setGameState(isButton);
			evaluateGameState();
			isButton = false;
			timer = 0;
			return;
		}

		timer++;
	}
}