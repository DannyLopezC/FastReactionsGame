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

public class GameOver extends JFrame {

	private JPanel contentPane;
	private int score, accurate, mistakes;

	/**
	 * Launch the application.
	 */
	public void newGameOver(int localScore, int localAccurate, int localMistakes) {
		EventQueue.invokeLater(new Runnable() {

			/**
			 * Run.
			 */
			public void run() {
				try {
					GameOver frame = new GameOver(localScore, localAccurate, localMistakes);
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
	public GameOver(int localScore, int localAccurate, int localMistakes) {
		score = localScore;
		accurate = localAccurate;
		mistakes = localMistakes;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1154, 646);
		this.setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JButton btnPlayAgain = new JButton("");
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MainMenu mainMenu = new MainMenu();
				mainMenu.newMain();

			}
		});

		btnPlayAgain.setIcon(new ImageIcon(GameOver.class.getResource("/images/Play Again.png")));
		btnPlayAgain.setOpaque(false);
		btnPlayAgain.setFocusPainted(false);
		btnPlayAgain.setContentAreaFilled(false);
		btnPlayAgain.setBorderPainted(false);
		btnPlayAgain.setBounds(279, 521, 254, 62);
		contentPane.add(btnPlayAgain);

		JButton btnExit = new JButton("");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});

		btnExit.setIcon(new ImageIcon(GameOver.class.getResource("/images/Recurso 3.png")));
		btnExit.setOpaque(false);
		btnExit.setFocusPainted(false);
		btnExit.setContentAreaFilled(false);
		btnExit.setBorderPainted(false);
		btnExit.setBounds(590, 521, 261, 62);
		contentPane.add(btnExit);

		JLabel lblScore = new JLabel(score + "");
		lblScore.setForeground(Color.WHITE);
		lblScore.setFont(new Font("Bahnschrift", Font.PLAIN, 37));
		lblScore.setBounds(498, 322, 110, 54);
		contentPane.add(lblScore);

		JLabel lblMistakes = new JLabel(mistakes + "");
		lblMistakes.setVerticalAlignment(SwingConstants.BOTTOM);
		lblMistakes.setForeground(Color.RED);
		lblMistakes.setFont(new Font("Bahnschrift", Font.PLAIN, 37));
		lblMistakes.setBounds(547, 287, 61, 45);
		contentPane.add(lblMistakes);

		JLabel lblAciertos = new JLabel(accurate + "");
		lblAciertos.setVerticalAlignment(SwingConstants.BOTTOM);
		lblAciertos.setForeground(Color.GREEN);
		lblAciertos.setFont(new Font("Bahnschrift", Font.PLAIN, 37));
		lblAciertos.setBounds(547, 250, 61, 45);
		contentPane.add(lblAciertos);

		JLabel lblScoreString = new JLabel("Score");
		lblScoreString.setForeground(Color.WHITE);
		lblScoreString.setFont(new Font("Bahnschrift", Font.PLAIN, 37));
		lblScoreString.setBounds(391, 327, 108, 45);
		contentPane.add(lblScoreString);

		JLabel lblMistakesString = new JLabel("Mistakes");
		lblMistakesString.setForeground(Color.WHITE);
		lblMistakesString.setFont(new Font("Bahnschrift", Font.PLAIN, 37));
		lblMistakesString.setBounds(391, 287, 155, 45);
		contentPane.add(lblMistakesString);

		JLabel lblAciertosString = new JLabel("Accurate");
		lblAciertosString.setForeground(Color.WHITE);
		lblAciertosString.setFont(new Font("Bahnschrift", Font.PLAIN, 37));
		lblAciertosString.setBounds(391, 250, 155, 45);
		contentPane.add(lblAciertosString);

		JLabel lblGameOver = new JLabel("Game Over");
		lblGameOver.setFont(new Font("Bahnschrift", Font.PLAIN, 72));
		lblGameOver.setForeground(Color.WHITE);
		lblGameOver.setBounds(341, 87, 364, 82);
		contentPane.add(lblGameOver);

		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(GameOver.class.getResource("/images/GameOverBackground.png")));
		lblBackground.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblBackground.setBounds(0, 0, 1154, 646);
		contentPane.add(lblBackground);
	}
}
