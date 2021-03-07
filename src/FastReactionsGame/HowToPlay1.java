package FastReactionsGame;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class HowToPlay1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void newHowToPlay1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HowToPlay1 frame = new HowToPlay1();
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
	public HowToPlay1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1154, 646);
		this.setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JButton btnExitMain = new JButton("");
		btnExitMain.setIcon(new ImageIcon(HowToPlay1.class.getResource("/images/Back.png")));
		btnExitMain.setOpaque(false);
		btnExitMain.setFocusPainted(false);
		btnExitMain.setContentAreaFilled(false);
		btnExitMain.setBorderPainted(false);
		btnExitMain.setBounds(10, 11, 304, 82);
		contentPane.add(btnExitMain);

		JLabel lblBackground = new JLabel("");
		lblBackground.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblBackground.setIcon(new ImageIcon(MainMenu.class.getResource("/images/Recurso 1.png")));
		lblBackground.setBounds(0, 0, 1154, 646);
		contentPane.add(lblBackground);
	}
}
