package FastReactionsGame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class HowToPlay3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void newHowToPlay2() {
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
	public HowToPlay3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1154, 646);
		this.setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JButton btnLeftArrow = new JButton("");
		btnLeftArrow.setIcon(new ImageIcon(HowToPlay4.class.getResource("/images/LeftArrow.png")));
		btnLeftArrow.setOpaque(false);
		btnLeftArrow.setFocusPainted(false);
		btnLeftArrow.setContentAreaFilled(false);
		btnLeftArrow.setBorderPainted(false);
		btnLeftArrow.setBounds(136, 197, 79, 82);
		contentPane.add(btnLeftArrow);

		JButton btnRightArrow = new JButton("");
		btnRightArrow.setIcon(new ImageIcon(HowToPlay1.class.getResource("/images/RightArrow.png")));
		btnRightArrow.setOpaque(false);
		btnRightArrow.setFocusPainted(false);
		btnRightArrow.setContentAreaFilled(false);
		btnRightArrow.setBorderPainted(false);
		btnRightArrow.setBounds(866, 197, 79, 82);
		contentPane.add(btnRightArrow);

		JLabel lblPage = new JLabel("3/4");
		lblPage.setForeground(Color.WHITE);
		lblPage.setFont(new Font("Bahnschrift", Font.PLAIN, 37));
		lblPage.setBounds(506, 26, 60, 45);
		contentPane.add(lblPage);

		JLabel lblImageExample = new JLabel("");
		lblImageExample.setIcon(new ImageIcon(HowToPlay1.class.getResource("/images/img.png")));
		lblImageExample.setHorizontalAlignment(SwingConstants.CENTER);
		lblImageExample.setForeground(Color.WHITE);
		lblImageExample.setFont(new Font("Bahnschrift", Font.PLAIN, 72));
		lblImageExample.setBounds(215, 70, 654, 331);
		contentPane.add(lblImageExample);

		JLabel lblText3 = new JLabel("-Press the return key on the keyboard.");
		lblText3.setForeground(Color.BLACK);
		lblText3.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblText3.setBounds(136, 535, 861, 59);
		contentPane.add(lblText3);

		JLabel lblText2 = new JLabel("-Press the white button directly in the screen.\r\n");
		lblText2.setForeground(Color.BLACK);
		lblText2.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblText2.setBounds(136, 485, 861, 59);
		contentPane.add(lblText2);

		JLabel lblText1 = new JLabel("There are two ways to press the button:\r\n");
		lblText1.setForeground(Color.BLACK);
		lblText1.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblText1.setBounds(136, 435, 861, 59);
		contentPane.add(lblText1);

		JLabel lblTextBox = new JLabel("");
		lblTextBox.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextBox.setIcon(new ImageIcon(HowToPlay1.class.getResource("/images/TextPanel.png")));
		lblTextBox.setForeground(Color.WHITE);
		lblTextBox.setFont(new Font("Bahnschrift", Font.PLAIN, 72));
		lblTextBox.setBounds(100, 402, 918, 244);
		contentPane.add(lblTextBox);

		JLabel lblTitle = new JLabel("");
		lblTitle.setIcon(new ImageIcon(HowToPlay1.class.getResource("/images/How to play.png")));
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("Bahnschrift", Font.PLAIN, 72));
		lblTitle.setBounds(879, 11, 265, 82);
		contentPane.add(lblTitle);

		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(HowToPlay1.class.getResource("/images/Back.png")));
		btnBack.setOpaque(false);
		btnBack.setFocusPainted(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setBounds(10, 11, 251, 59);
		contentPane.add(btnBack);

		JLabel lblBackground = new JLabel("");
		lblBackground.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblBackground.setIcon(new ImageIcon(MainMenu.class.getResource("/images/Recurso 1.png")));
		lblBackground.setBounds(0, 0, 1154, 646);
		contentPane.add(lblBackground);
	}
}