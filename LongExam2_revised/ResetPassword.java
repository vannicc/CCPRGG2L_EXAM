import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JPasswordField;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResetPassword {

	private JFrame frame;
	private JTextField txtFbUser;
	private JPasswordField pfNewPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResetPassword window = new ResetPassword();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ResetPassword() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 10, 1246, 663);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_1.setBackground(new Color(238, 238, 238));
		panel_1.setBounds(0, 57, 1246, 464);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(325, 50, 590, 373);
		panel_1.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 0, 590, 58);
		panel_2.add(panel_3);
		
		JLabel lblReset = new JLabel("Reset your password");
		lblReset.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblReset.setBounds(20, 10, 467, 38);
		panel_3.add(lblReset);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setBounds(0, 289, 590, 84);
		panel_2.add(panel_3_1);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setOpaque(true);
		btnContinue.setForeground(Color.WHITE);
		btnContinue.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnContinue.setBorderPainted(false);
		btnContinue.setBackground(new Color(0, 128, 255));
		btnContinue.setBounds(460, 20, 109, 41);
		panel_3_1.add(btnContinue);
		
		JButton btnNotYou = new JButton("Not you?");
		btnNotYou.addMouseListener(new MouseAdapter() {
			@Override
      // When mouse is clicked, returns to the Log In Page
			public void mouseClicked(MouseEvent e) {
				LoginPage login = new LoginPage();
				frame.dispose();
				login.main(null);
			}
		});
		btnNotYou.setOpaque(true);
		btnNotYou.setForeground(new Color(78, 78, 78));
		btnNotYou.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnNotYou.setBorderPainted(false);
		btnNotYou.setBackground(SystemColor.controlHighlight);
		btnNotYou.setBounds(339, 20, 109, 41);
		panel_3_1.add(btnNotYou);
		
		JLabel lblQuestion1 = new JLabel("Create a new password that is at least 6 characters long.");
		lblQuestion1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblQuestion1.setBounds(21, 68, 466, 35);
		panel_2.add(lblQuestion1);
		
		JLabel lblQuestion2 = new JLabel("A strong password is combination of letters, numbers, and");
		lblQuestion2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblQuestion2.setBounds(21, 93, 466, 23);
		panel_2.add(lblQuestion2);
		
		JLabel lblGmail2 = new JLabel("mikoclark19@gmail.com");
		lblGmail2.setHorizontalAlignment(SwingConstants.CENTER);
		lblGmail2.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblGmail2.setBounds(355, 201, 212, 35);
		panel_2.add(lblGmail2);
		
		txtFbUser = new JTextField();
		txtFbUser.setText("Facebook User");
		txtFbUser.setHorizontalAlignment(SwingConstants.CENTER);
		txtFbUser.setForeground(Color.GRAY);
		txtFbUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFbUser.setColumns(10);
		txtFbUser.setBorder(null);
		txtFbUser.setBounds(409, 233, 107, 23);
		panel_2.add(txtFbUser);
		
		JLabel lblFbIcon = new JLabel(""); 
    // Created the Image and Image Icon class to add image to the JLabel
		Image img = new ImageIcon(this.getClass().getResource("profile.jpg")).getImage();
		lblFbIcon.setBounds(409, 94, 91, 99);
		panel_2.add(lblFbIcon);
		lblFbIcon.setIcon(new ImageIcon(img));
		
		JLabel lblPunctuationMarks = new JLabel("punctuation marks.");
		lblPunctuationMarks.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblPunctuationMarks.setBounds(21, 113, 466, 23);
		panel_2.add(lblPunctuationMarks);
		
		JPanel panelNewPass = new JPanel();
		panelNewPass.setLayout(null);
		panelNewPass.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		panelNewPass.setBackground(Color.WHITE);
		panelNewPass.setBounds(21, 174, 217, 42);
		panel_2.add(panelNewPass);
		
		pfNewPass = new JPasswordField();
		pfNewPass.setBounds(10, 5, 197, 32);
		pfNewPass.setEchoChar((char)0);
		panelNewPass.add(pfNewPass);
		pfNewPass.setText("New Password");
		pfNewPass.setForeground(new Color(192, 192, 192));
		pfNewPass.setBorder(null);
		pfNewPass.setFont(new Font("Tahoma", Font.PLAIN, 19));
		pfNewPass.addFocusListener(new FocusAdapter() {
			@Override
      // When focus is gained, sets password field to empty and then start to hide the inputted value
			public void focusGained(FocusEvent e) {
			if (pfNewPass.getText().equals("Password")) {
				pfNewPass.setEchoChar('●');
				pfNewPass.setText("");
			} else {
				pfNewPass.selectAll();
			}
			}
			@Override
      // DEFAULT: When focus is lost, reverts to the default password field text
			public void focusLost(FocusEvent e) {
				if (pfNewPass.getText().equals("")) {
					pfNewPass.setText("Password");
				}
			}
		});
		
		JButton btnNewButton = new JButton("Show");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
      // When button is pressed, shows the input password
			public void mousePressed(MouseEvent e) {
				pfNewPass.setEchoChar((char)0);
			}
			@Override
      // When mouse is released from the button, hides the input password again
			public void mouseReleased(MouseEvent e) {
				pfNewPass.setEchoChar('●');
			}
		});
		btnNewButton.setBackground(new Color(234, 234, 234));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(248, 174, 71, 42);
		panel_2.add(btnNewButton);
		
		
		
		JLabel lblFacebook = new JLabel("facebook");
		lblFacebook.setForeground(new Color(0, 128, 255));
		lblFacebook.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblFacebook.setBounds(10, 0, 427, 57);
		panel.add(lblFacebook);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.addMouseListener(new MouseAdapter() {
			@Override
      // When button is clicked, returns to the Log In Page
			public void mouseClicked(MouseEvent e) {
				LoginPage login = new LoginPage();
				frame.dispose();
				login.main(null);
			}
		});
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setFont(new Font("Segoe UI", Font.BOLD, 19));
		btnLogIn.setBackground(new Color(0, 128, 255));
		btnLogIn.setBounds(1124, 10, 101, 37);
		panel.add(btnLogIn);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(238, 238, 238)));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 575, 1246, 88);
		panel.add(panel_4);
		
		JLabel lblOther1 = new JLabel("Services   Voting Information Center   Privacy Policy   Privacy Center   Groups   About   Create Ad   Create Page   Developers   Careers   Cookies   Ad choices");
		lblOther1.setHorizontalAlignment(SwingConstants.CENTER);
		lblOther1.setForeground(new Color(114, 114, 114));
		lblOther1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOther1.setBounds(247, 33, 740, 23);
		panel_4.add(lblOther1);
		
		JLabel lblOthers2 = new JLabel("Terms   Help   Contact Uploading & Non-Users");
		lblOthers2.setHorizontalAlignment(SwingConstants.CENTER);
		lblOthers2.setForeground(new Color(114, 114, 114));
		lblOthers2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOthers2.setBounds(431, 55, 377, 23);
		panel_4.add(lblOthers2);
		
		JLabel lblOthers = new JLabel("Sign Up   Log In   Messenger   Facebook Lite   Watch   Places   Games   Marketplace   Meta Pay   Oculus   Portal   Instagram   Bulletin   Fundraisers");
		lblOthers.setHorizontalAlignment(SwingConstants.CENTER);
		lblOthers.setForeground(new Color(114, 114, 114));
		lblOthers.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOthers.setBounds(266, 10, 703, 23);
		panel_4.add(lblOthers);
		
		JLabel lblFacebookMeta = new JLabel("Meta © 2023");
		lblFacebookMeta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFacebookMeta.setForeground(new Color(114, 114, 114));
		lblFacebookMeta.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		lblFacebookMeta.setBounds(847, 65, 389, 13);
		panel_4.add(lblFacebookMeta);
		
		JLabel lblLanguages = new JLabel("English (US)   Filipino   Bisaya   Español   日本語   한국어   中文(简体)   العربية   Português (Brasil)   Français (France)   Deutsch");
		lblLanguages.setForeground(new Color(114, 114, 114));
		lblLanguages.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblLanguages.setBounds(318, 546, 598, 23);
		panel.add(lblLanguages);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(78, 78, 78));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBackground(new Color(238, 238, 238));
		lblNewLabel.setBounds(915, 547, 18, 18);
		panel.add(lblNewLabel);
	}
}
