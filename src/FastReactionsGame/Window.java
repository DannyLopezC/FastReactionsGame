package FastReactionsGame;

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

public class Window extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1154, 646);
		this.setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnExitMain = new JButton("");
		btnExitMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("hola");
				System.exit(0);
			}
		});

		btnExitMain.setIcon(new ImageIcon(Window.class.getResource("/images/ExitMain.png")));
		btnExitMain.setOpaque(false);
		btnExitMain.setContentAreaFilled(false);
		btnExitMain.setBorderPainted(false);
		btnExitMain.setFocusPainted(false);
		btnExitMain.setBounds(834, 547, 304, 82);
		contentPane.add(btnExitMain);

		JLabel lblTitle = new JLabel("");
		lblTitle.setIcon(new ImageIcon(Window.class.getResource("/images/Title.png")));
		lblTitle.setBounds(329, 89, 507, 82);
		contentPane.add(lblTitle);

		JButton btnHowToPlay = new JButton("");
		btnHowToPlay.setIcon(new ImageIcon(Window.class.getResource("/images/HowToPlay.png")));
		btnHowToPlay.setVerticalAlignment(SwingConstants.BOTTOM);
		btnHowToPlay.setOpaque(false);
		btnHowToPlay.setContentAreaFilled(false);
		btnHowToPlay.setBorderPainted(false);
		btnHowToPlay.setFocusPainted(false);
		btnHowToPlay.setHorizontalAlignment(SwingConstants.LEFT);
		btnHowToPlay.setBounds(429, 309, 365, 82);
		contentPane.add(btnHowToPlay);

		JButton btnPlay = new JButton("");
		btnPlay.setIcon(new ImageIcon(Window.class.getResource("/images/PlayButton.png")));
		btnPlay.setBounds(404, 232, 334, 82);
		btnPlay.setOpaque(false);
		btnPlay.setContentAreaFilled(false);
		btnPlay.setBorderPainted(false);
		btnPlay.setFocusPainted(false);
		contentPane.add(btnPlay);

		JLabel lblBackground = new JLabel("");
		lblBackground.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblBackground.setIcon(new ImageIcon(Window.class.getResource("/images/Recurso 1.png")));
		lblBackground.setBounds(0, 0, 1154, 646);
		contentPane.add(lblBackground);
	}
}
