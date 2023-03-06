import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class ForgotPassword {

	private JFrame frame;
	private JTextField txtEmail;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textFindEmailOrPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPassword window = new ForgotPassword();
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
	public ForgotPassword() {
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
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 10, 1246, 663);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(238, 238, 238));
		panel_1.setBounds(0, 57, 1246, 435);
		panel_1.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(372, 70, 497, 286);
		panel_2.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 497, 58);
		panel_2.add(panel_3);
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_3.setLayout(null);
		
		JLabel lblFindAcc = new JLabel("Find your account");
		lblFindAcc.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblFindAcc.setBounds(20, 10, 467, 38);
		panel_3.add(lblFindAcc);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(0, 202, 497, 84);
		panel_3_1.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_3_1.setBackground(Color.WHITE);
		panel_2.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setForeground(new Color(255, 255, 255));
		btnSearch.setOpaque(true);
		btnSearch.setBorderPainted(false);
		btnSearch.setBackground(new Color(0, 128, 255));
		btnSearch.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnSearch.setBounds(380, 20, 95, 41);
		panel_3_1.add(btnSearch);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setForeground(new Color(78, 78, 78));
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(227, 227, 227));
		btnNewButton.setBounds(271, 20, 95, 41);
		panel_3_1.add(btnNewButton);
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 18));
		
		
		JLabel lblPlsEnter1 = new JLabel("Please enter your email or mobile number to search for");
		lblPlsEnter1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblPlsEnter1.setBounds(21, 68, 466, 35);
		panel_2.add(lblPlsEnter1);
		
		JLabel lblPlsEnter2 = new JLabel("your account.");
		lblPlsEnter2.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblPlsEnter2.setBounds(21, 93, 466, 35);
		panel_2.add(lblPlsEnter2);
		
		JPanel panelFindEmailOrPhone = new JPanel();
		panelFindEmailOrPhone.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 128, 128)));
		panelFindEmailOrPhone.setBackground(new Color(255, 255, 255));
		panelFindEmailOrPhone.setBounds(21, 135, 454, 44);
		panel_2.add(panelFindEmailOrPhone);
		panelFindEmailOrPhone.setLayout(null);
		
		textFindEmailOrPhone = new JTextField();
		textFindEmailOrPhone.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textFindEmailOrPhone.getText().equals("Email or mobile number")) {
					textFindEmailOrPhone.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (textFindEmailOrPhone.getText().equals("")) {
					textFindEmailOrPhone.setText("Email or mobile number");
				}
			}
		});
		textFindEmailOrPhone.setBounds(10, 11, 434, 23);
		panelFindEmailOrPhone.add(textFindEmailOrPhone);
		textFindEmailOrPhone.setText("Email or mobile number");
		textFindEmailOrPhone.setForeground(Color.LIGHT_GRAY);
		textFindEmailOrPhone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFindEmailOrPhone.setColumns(10);
		textFindEmailOrPhone.setBorder(null);
		
		JLabel lblFacebook = new JLabel("facebook");
		lblFacebook.setForeground(new Color(0, 128, 255));
		lblFacebook.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblFacebook.setBounds(10, 0, 427, 57);
		panel.add(lblFacebook);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.setBounds(1124, 10, 101, 37);
		panel.add(btnLogIn);
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setFont(new Font("Segoe UI", Font.BOLD, 19));
		btnLogIn.setBackground(new Color(0, 128, 255));
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(238, 238, 238)));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 575, 1246, 88);
		panel.add(panel_4);
		
		JLabel lblOther1 = new JLabel("Services   Voting Information Center   Privacy Policy   Privacy Center   Groups   About   Create Ad   Create Page   Developers   Careers   Cookies   Ad choices");
		lblOther1.setForeground(new Color(114, 114, 114));
		lblOther1.setHorizontalAlignment(SwingConstants.CENTER);
		lblOther1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOther1.setBounds(247, 33, 740, 23);
		panel_4.add(lblOther1);
		
		JLabel lblOthers2 = new JLabel("Terms   Help   Contact Uploading & Non-Users");
		lblOthers2.setForeground(new Color(114, 114, 114));
		lblOthers2.setHorizontalAlignment(SwingConstants.CENTER);
		lblOthers2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOthers2.setBounds(431, 55, 377, 23);
		panel_4.add(lblOthers2);
		
		JLabel lblOthers = new JLabel("Sign Up   Log In   Messenger   Facebook Lite   Watch   Places   Games   Marketplace   Meta Pay   Oculus   Portal   Instagram   Bulletin   Fundraisers");
		lblOthers.setForeground(new Color(114, 114, 114));
		lblOthers.setBounds(266, 10, 703, 23);
		panel_4.add(lblOthers);
		lblOthers.setHorizontalAlignment(SwingConstants.CENTER);
		lblOthers.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JLabel lblFacebookMeta = new JLabel("Meta © 2023");
		lblFacebookMeta.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		lblFacebookMeta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFacebookMeta.setForeground(new Color(114, 114, 114));
		lblFacebookMeta.setBounds(847, 65, 389, 13);
		panel_4.add(lblFacebookMeta);
		
		JLabel lblLanguages = new JLabel("English (US)   Filipino   Bisaya   Español   日本語   한국어   中文(简体)   العربية   Português (Brasil)   Français (France)   Deutsch");
		lblLanguages.setForeground(new Color(114, 114, 114));
		lblLanguages.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblLanguages.setBounds(318, 546, 598, 23);
		panel.add(lblLanguages);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setForeground(new Color(78, 78, 78));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(238, 238, 238));
		lblNewLabel.setBounds(915, 547, 18, 18);
		panel.add(lblNewLabel);
		
		JPanel panelEmail = new JPanel();
		panelEmail.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		panelEmail.setBackground(new Color(255, 255, 255));
		panelEmail.setBounds(667, 11, 217, 35);
		panel.add(panelEmail);
		panelEmail.setLayout(null);
		
		txtEmail = new JTextField();
		txtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtEmail.getText().equals("Email or phone")) {
					txtEmail.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtEmail.getText().equals("")) {
					txtEmail.setText("Email or phone");
				}
			}
		});
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEmail.setForeground(new Color(192, 192, 192));
		txtEmail.setBorder(null);
		txtEmail.setBounds(10, 6, 197, 23);
		panelEmail.add(txtEmail);
		txtEmail.setText("Email or phone");
		txtEmail.setColumns(10);
		
		JPanel panelPassword = new JPanel();
		panelPassword.setForeground(new Color(128, 128, 128));
		panelPassword.setLayout(null);
		panelPassword.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		panelPassword.setBackground(Color.WHITE);
		panelPassword.setBounds(894, 11, 217, 35);
		panel.add(panelPassword);
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (passwordField.getText().equals("Password")) {
					passwordField.setEchoChar('●');
					passwordField.setText("");
				} else {
					passwordField.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (passwordField.getText().equals("")) {
					passwordField.setText("Password");
				}
			}
		});
		passwordField.setForeground(new Color(192, 192, 192));
		passwordField.setBorder(null);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setText("Password");
		passwordField.setEchoChar((char)0);
		passwordField.setBounds(10, 6, 197, 23);
		panelPassword.add(passwordField);
	}
}
