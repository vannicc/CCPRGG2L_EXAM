import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class LogInPage {

	private JFrame Facebook;
	private JTextField txtEmailOrPhone;
	private JTextField txtCreateNewAccount;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInPage window = new LogInPage();
					window.Facebook.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogInPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Facebook = new JFrame();
		Facebook.getContentPane().setBackground(new Color(0, 0, 0));
		Facebook.setBounds(100, 100, 1280, 720);
		Facebook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Facebook.getContentPane().setLayout(null);
		
		JPanel panelWhiteFacebook = new JPanel();
		panelWhiteFacebook.setBackground(new Color(255, 255, 255));
		panelWhiteFacebook.setBounds(10, 10, 1246, 663);
		Facebook.getContentPane().add(panelWhiteFacebook);
		panelWhiteFacebook.setLayout(null);
		
		JPanel panelBlueSignIn = new JPanel();
		panelBlueSignIn.setBounds(664, 0, 582, 663);
		panelBlueSignIn.setBackground(new Color(0, 128, 255));
		panelWhiteFacebook.add(panelBlueSignIn);
		panelBlueSignIn.setLayout(null);
		
		JPanel panelSignIn = new JPanel();
		panelSignIn.setBackground(new Color(255, 255, 255));
		panelSignIn.setBounds(110, 118, 371, 410);
		panelBlueSignIn.add(panelSignIn);
		panelSignIn.setLayout(null);
		
		txtEmailOrPhone = new JTextField();
		txtEmailOrPhone.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtEmailOrPhone.getText().equals("Email or phone number")) {
					txtEmailOrPhone.setText("");
				} else {
					txtEmailOrPhone.selectAll();
				}
			}
			
			public void focusLost(FocusEvent e) {
				if (txtEmailOrPhone.getText().equals("")) {
					txtEmailOrPhone.setText("Email or phone number");
				}
			}

		});
		txtEmailOrPhone.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtEmailOrPhone.setForeground(new Color(192, 192, 192));
		txtEmailOrPhone.setText("Email or phone number");
		txtEmailOrPhone.setBounds(37, 23, 303, 65);
		txtEmailOrPhone.setBorder(null);
		panelSignIn.add(txtEmailOrPhone);
		txtEmailOrPhone.setColumns(10);
		
		JLabel lblForgotPass = new JLabel("Forgot password?");
		lblForgotPass.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgotPass.setForeground(new Color(0, 128, 255));
		lblForgotPass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblForgotPass.setBounds(117, 279, 134, 32);
		panelSignIn.add(lblForgotPass);
		
		txtCreateNewAccount = new JTextField();
		txtCreateNewAccount.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtCreateNewAccount.setHorizontalAlignment(SwingConstants.CENTER);
		txtCreateNewAccount.setText("Create new account");
		txtCreateNewAccount.setBackground(new Color(0, 215, 54));
		txtCreateNewAccount.setForeground(new Color(255, 255, 255));
		txtCreateNewAccount.setBounds(23, 331, 325, 55);
		panelSignIn.add(txtCreateNewAccount);
		txtCreateNewAccount.setColumns(10);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if ((txtEmailOrPhone.getText().equals("Jerico") && passwordField.getText().equals("password1") || (txtEmailOrPhone.getText().equals("Miko") && passwordField.getText().equals("password2")))) {
					Facebook.dispose();
					EnrolmentForm enrollForm = new EnrolmentForm();
						enrollForm.main(null);
				} else {
					// if user inputs are incorrect/default text
					JOptionPane.showMessageDialog(null, "Incorrect input! Please try again");
				}
			}
		});
		btnLogIn.setBackground(new Color(0, 128, 255));
		btnLogIn.setForeground(new Color(255, 255, 255));
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnLogIn.setBounds(23, 212, 325, 66);
		panelSignIn.add(btnLogIn);
		
		JPanel panelUsername = new JPanel();
		panelUsername.setBorder(new LineBorder(new Color(0, 128, 255)));
		panelUsername.setBackground(new Color(255, 255, 255));
		panelUsername.setBounds(22, 22, 326, 67);
		panelSignIn.add(panelUsername);
		panelUsername.setLayout(null);
		
		JPanel panelPassword = new JPanel();
		panelPassword.setBorder(new LineBorder(new Color(0, 128, 255)));
		panelPassword.setBackground(Color.WHITE);
		panelPassword.setBounds(23, 98, 325, 67);
		panelSignIn.add(panelPassword);
		panelPassword.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(192, 192, 192));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 19));
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
		passwordField.setBounds(15, 1, 303, 64);
		passwordField.setEchoChar((char)0);
		passwordField.setText("Password");
		panelPassword.add(passwordField);
		passwordField.setBorder(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox(" Remember me");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(239, 171, 109, 21);
		panelSignIn.add(chckbxNewCheckBox);
		
		
		
		JLabel lblCreatePage = new JLabel("Create a page");
		lblCreatePage.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblCreatePage.setForeground(new Color(255, 255, 255));
		lblCreatePage.setBounds(120, 528, 361, 40);
		panelBlueSignIn.add(lblCreatePage);
		
		JLabel lblNewLabel_3_1 = new JLabel("for a celebrity, brand or business.");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Yu Gothic", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(229, 528, 371, 40);
		panelBlueSignIn.add(lblNewLabel_3_1);
		
		JLabel lblFacebookMeta = new JLabel("Meta © 2023");
		lblFacebookMeta.setForeground(new Color(255, 255, 255));
		lblFacebookMeta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFacebookMeta.setBounds(183, 640, 389, 13);
		panelBlueSignIn.add(lblFacebookMeta);
		
		JLabel lblAroundYouOn = new JLabel("around you on Facebook.");
		lblAroundYouOn.setBounds(54, 260, 711, 99);
		lblAroundYouOn.setFont(new Font("Yu Gothic", Font.BOLD, 25));
		panelWhiteFacebook.add(lblAroundYouOn);
		
		JLabel lblConnectWithFriends = new JLabel("Connect with friends and the world");
		lblConnectWithFriends.setBounds(54, 230, 711, 99);
		lblConnectWithFriends.setFont(new Font("Yu Gothic", Font.BOLD, 25));
		panelWhiteFacebook.add(lblConnectWithFriends);
		
		JLabel lblFacebook = new JLabel("facebook");
		lblFacebook.setBounds(54, 189, 427, 61);
		lblFacebook.setFont(new Font("Tahoma", Font.BOLD, 55));
		lblFacebook.setForeground(new Color(0, 128, 255));
		panelWhiteFacebook.add(lblFacebook);
		
		JLabel lblLanguages = new JLabel("English (US)   Filipino   Bisaya   Español   日本語   한국어   中文(简体)   العربية   Português (Brasil)   Français (France)   Deutsch");
		lblLanguages.setForeground(new Color(114, 114, 114));
		lblLanguages.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblLanguages.setBounds(10, 635, 598, 23);
		panelWhiteFacebook.add(lblLanguages);
		
		JLabel lblPlus = new JLabel("+");
		lblPlus.setOpaque(true);
		lblPlus.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlus.setForeground(new Color(78, 78, 78));
		lblPlus.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPlus.setBackground(new Color(238, 238, 238));
		lblPlus.setBounds(632, 640, 19, 13);
		panelWhiteFacebook.add(lblPlus);
	}	
}
