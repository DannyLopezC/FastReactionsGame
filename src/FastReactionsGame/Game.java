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

	JLabel lblTile8 = new JLabel("");
	JLabel lblTile7 = new JLabel("");
	JLabel lblTile6 = new JLabel("");
	JLabel lblTile5 = new JLabel("");
	JLabel lblTile4 = new JLabel("");
	JLabel lblTile3 = new JLabel("");
	JLabel lblTile2 = new JLabel("");
	JLabel lblTile1 = new JLabel("");

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
		this.setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		lblTile8 = new JLabel("");
		lblTile7 = new JLabel("");
		lblTile6 = new JLabel("");
		lblTile5 = new JLabel("");
		lblTile4 = new JLabel("");
		lblTile3 = new JLabel("");
		lblTile2 = new JLabel("");
		lblTile1 = new JLabel("");

		gameManager = new GameManager();
		playerManager = new PlayerManager();

		gameManager.setBoard();
		setBoard();

		JButton btnExitMain = new JButton("");
		btnExitMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mainMenu = new MainMenu();
				mainMenu.newMain();
				setVisible(false);
			}
		});

		JButton btnButton = new JButton("");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameManager.setGameState(true);
				evaluateGameState();
			}
		});

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

		JLabel lblScore = new JLabel("00000");
		lblScore.setForeground(Color.WHITE);
		lblScore.setFont(new Font("Bahnschrift", Font.PLAIN, 37));
		lblScore.setBounds(155, 227, 110, 54);
		contentPane.add(lblScore);

		JLabel lblScoreString = new JLabel("Score");
		lblScoreString.setForeground(Color.WHITE);
		lblScoreString.setFont(new Font("Bahnschrift", Font.PLAIN, 37));
		lblScoreString.setBounds(35, 227, 110, 54);
		contentPane.add(lblScoreString);
		btnExitMain.setIcon(new ImageIcon(Game.class.getResource("/images/ExitMain.png")));
		btnExitMain.setOpaque(false);
		btnExitMain.setFocusPainted(false);
		btnExitMain.setContentAreaFilled(false);
		btnExitMain.setBorderPainted(false);
		btnExitMain.setBounds(825, 277, 304, 82);
		contentPane.add(btnExitMain);

		JLabel lblBackground = new JLabel("");
		lblBackground.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblBackground.setIcon(new ImageIcon(MainMenu.class.getResource("/images/backGroundInGame.png")));
		lblBackground.setBounds(0, 0, 1154, 646);
		contentPane.add(lblBackground);
	}

//	Timer timer = new Timer(gameManager.getReactionTime(), new ActionListener() {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//
//		}
//	});

	private void evaluateGameState() {
		switch (gameManager.getState()) {
		case 1:
			gameManager.setRound();
			gameManager.setBoard();
			setBoard();
			playerManager.setAccurate();
			System.out.println("gana");
			break;
		case 2:
			playerManager.setAttempts();
			playerManager.setMistakes();
			System.out.println(playerManager.getAttempts());
			gameManager.setRound();
			gameManager.setBoard();
			setBoard();
			System.out.println("pierde");
			break;
		case 3:
			gameManager.setBoard();
			setBoard();
			System.out.println("no hace nada");
		}

		if (playerManager.getAttempts() <= 0) {
			System.out.println("game over");
			GameOver gameOver = new GameOver();
			gameOver.newGameOver();
			setVisible(false);
		}
	}

	private void setBoard() {

		lblTile8.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(7) + ".png"));
		lblTile8.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile8.setBounds(280, 442, 187, 193);
		contentPane.add(lblTile8);

		lblTile7.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(6) + ".png"));
		lblTile7.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile7.setBounds(280, -13, 187, 193);
		contentPane.add(lblTile7);

		lblTile6.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(5) + ".png"));
		lblTile6.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile6.setBounds(733, -13, 187, 193);
		contentPane.add(lblTile6);

		lblTile5.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(4) + ".png"));
		lblTile5.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile5.setBounds(753, 442, 187, 193);
		contentPane.add(lblTile5);

		lblTile4.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(3) + ".png"));
		lblTile4.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile4.setBounds(376, 351, 187, 178);
		contentPane.add(lblTile4);

		lblTile3.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(2) + ".png"));
		lblTile3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile3.setBounds(391, 90, 180, 184);
		contentPane.add(lblTile3);

		lblTile2.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(1) + ".png"));
		lblTile2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile2.setBounds(632, 90, 187, 193);
		contentPane.add(lblTile2);

		lblTile1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTile1.setIcon(new ImageIcon("src/Images/" + gameManager.getBoard(0) + ".png"));
		lblTile1.setBounds(632, 339, 201, 193);
		contentPane.add(lblTile1);
	}
}
