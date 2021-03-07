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
import javax.swing.border.EmptyBorder;

public class Game extends JFrame {

	private JPanel contentPane;

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

		JButton btnExitMain = new JButton("");
		btnExitMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mainMenu = new MainMenu();
				mainMenu.newMain();
				setVisible(false);
			}
		});

		JButton btnExitMain_1 = new JButton("");
		btnExitMain_1.setIcon(new ImageIcon(Game.class.getResource("/images/button@2x.png")));
		btnExitMain_1.setOpaque(false);
		btnExitMain_1.setFocusPainted(false);
		btnExitMain_1.setContentAreaFilled(false);
		btnExitMain_1.setBorderPainted(false);
		btnExitMain_1.setBounds(547, 250, 110, 114);
		contentPane.add(btnExitMain_1);

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

		JLabel lblNewLabel = new JLabel("Score");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 37));
		lblNewLabel.setBounds(35, 227, 110, 54);
		contentPane.add(lblNewLabel);
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
}
