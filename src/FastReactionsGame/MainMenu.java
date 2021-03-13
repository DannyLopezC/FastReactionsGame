package FastReactionsGame;

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

public class MainMenu extends JFrame {

	private JPanel contentPane;

	private Game game;
	private HowToPlay1 howToPlay1;

	public static void newMain() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainMenu() {
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
				System.exit(0);
			}
		});

		btnExitMain.setIcon(new ImageIcon(MainMenu.class.getResource("/images/ExitMain.png")));
		btnExitMain.setOpaque(false);
		btnExitMain.setContentAreaFilled(false);
		btnExitMain.setBorderPainted(false);
		btnExitMain.setFocusPainted(false);
		btnExitMain.setBounds(834, 547, 304, 82);
		contentPane.add(btnExitMain);

		JLabel lblTitle = new JLabel("");
		lblTitle.setIcon(new ImageIcon(MainMenu.class.getResource("/images/Title.png")));
		lblTitle.setBounds(329, 89, 507, 82);
		contentPane.add(lblTitle);

		JButton btnHowToPlay = new JButton("");
		btnHowToPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				howToPlay1 = new HowToPlay1();
				howToPlay1.newHowToPlay1();
				setVisible(false);
			}
		});
		btnHowToPlay.setIcon(new ImageIcon(MainMenu.class.getResource("/images/HowToPlay.png")));
		btnHowToPlay.setOpaque(false);
		btnHowToPlay.setContentAreaFilled(false);
		btnHowToPlay.setBorderPainted(false);
		btnHowToPlay.setFocusPainted(false);
		btnHowToPlay.setBounds(434, 329, 273, 62);
		contentPane.add(btnHowToPlay);

		JButton btnPlay = new JButton("");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game = new Game();
				game.newScreen();
				setVisible(false);
			}
		});

		btnPlay.setIcon(new ImageIcon(MainMenu.class.getResource("/images/PlayButton.png")));
		btnPlay.setBounds(400, 246, 334, 82);
		btnPlay.setOpaque(false);
		btnPlay.setContentAreaFilled(false);
		btnPlay.setBorderPainted(false);
		btnPlay.setFocusPainted(false);
		contentPane.add(btnPlay);

		JLabel lblBackground = new JLabel("");
		lblBackground.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblBackground.setIcon(new ImageIcon(MainMenu.class.getResource("/images/Recurso 1.png")));
		lblBackground.setBounds(0, 0, 1154, 646);
		contentPane.add(lblBackground);
	}
}
