import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPasswordField;
import java.awt.SystemColor;

public class SignUp {

	private JFrame frame;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtEmail;
	private static String[] months = {"Month", "Jan","Feb", "Mar", "Apr", "May", "Jun","Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; 
	private static String[] days = {"Day", "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29", "30", "31"};
	private static String[] years = {"Year", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012"};
	private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
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
	public SignUp() {
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
		panel.setBackground(new Color(247, 247, 247));
		panel.setBounds(10, 10, 1246, 663);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(348, -23, 540, 686);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFacebook = new JLabel("facebook");
		lblFacebook.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacebook.setBounds(141, 21, 253, 79);
		lblFacebook.setForeground(new Color(0, 128, 255));
		lblFacebook.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_1.add(lblFacebook);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(42, 99, 451, 558);
		panel_2.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 451, 71);
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_3.setBackground(Color.WHITE);
		panel_2.add(panel_3);
		
		JLabel lblCreateNewAccounnt = new JLabel("Create new account");
		lblCreateNewAccounnt.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateNewAccounnt.setFont(new Font("Segoe UI", Font.BOLD, 23));
		lblCreateNewAccounnt.setBounds(10, 0, 431, 44);
		panel_3.add(lblCreateNewAccounnt);
		
		JLabel lblNewLabel = new JLabel("It's quick and easy.");
		lblNewLabel.setForeground(new Color(91, 91, 91));
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(152, 38, 147, 23);
		panel_3.add(lblNewLabel);
		
		txtFirstName = new JTextField();
		txtFirstName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtFirstName.getText().equals("  First Name")) {
					txtFirstName.setText("  ");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtFirstName.getText().equals("  ")) {
					txtFirstName.setText("  First Name");
				}
			}
		});
		txtFirstName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFirstName.setText("  First Name");
		txtFirstName.setBounds(20, 95, 196, 31);
		txtFirstName.setColumns(10);
		panel_2.add(txtFirstName);
		
		txtLastName = new JTextField();
		txtLastName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtLastName.getText().equals("  Last Name")) {
					txtLastName.setText("  ");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtLastName.getText().equals("  ")) {
					txtLastName.setText("  Last Name");
				}
			}
		});
		txtLastName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtLastName.setText("  Last Name");
		txtLastName.setBounds(232, 95, 196, 31);
		txtLastName.setColumns(10);
		panel_2.add(txtLastName);
		
		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setBounds(20, 218, 147, 20);
		lblBirthday.setHorizontalAlignment(SwingConstants.LEFT);
		lblBirthday.setForeground(new Color(91, 91, 91));
		lblBirthday.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel_2.add(lblBirthday);
		
		txtEmail = new JTextField();
		txtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtEmail.getText().equals("  Email")) {
					txtEmail.setText("  ");
				}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if (txtEmail.getText().equals("  ")) {
					txtEmail.setText("  Email");
				}
			}
		});
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtEmail.setText("  Email");
		txtEmail.setBounds(20, 136, 408, 31);
		panel_2.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				boolean SignUpSuccess = false;
				String pass = passwordField.getText().toString();
				String email = txtEmail.getText().toString();
				
				User inputChecker = new User("", ""); 
					boolean isValidPassword = inputChecker.checkPassword(pass);
					boolean isValidEmail = inputChecker.checkValidUsername(email);
				
				if (txtEmail.getText().equals("") && passwordField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter an email and/or password!");
				} else if (passwordField.getText().toString().equals(pass)) {
					if (isValidPassword && isValidEmail) {
						JOptionPane.showMessageDialog(null, "Sign up success!\nClick 'OK' to return to Log In.");
						frame.dispose();
						EnrolmentForm enroll = new EnrolmentForm();
							enroll.main(null);
					} else {
						JOptionPane.showMessageDialog(null, "Please enter a valid email and/or password!\n\nPassword must be:\na. 8 characters\nb. With upper and lower case letters\nc. Contains at least one special character");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Invalid input! Please try again.");
				}
			}
		});
		btnSignUp.setBounds(152, 467, 147, 43);
		panel_2.add(btnSignUp);
		btnSignUp.setOpaque(true);
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnSignUp.setBorderPainted(false);
		btnSignUp.setBackground(new Color(0, 164, 41));
		
		JButton btnAlreadyHaveAn = new JButton("Already have an account?");
		btnAlreadyHaveAn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlreadyHaveAn.setBounds(106, 512, 241, 36);
		btnAlreadyHaveAn.setOpaque(true);
		btnAlreadyHaveAn.setForeground(new Color(0, 128, 255));
		btnAlreadyHaveAn.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnAlreadyHaveAn.setBorderPainted(false);
		btnAlreadyHaveAn.setBackground(new Color(255, 255, 255));
		panel_2.add(btnAlreadyHaveAn);
		
		JComboBox comboBoxDay = new JComboBox(days);
		comboBoxDay.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBoxDay.setBackground(new Color(255, 255, 255));
		comboBoxDay.setBounds(164, 246, 123, 31);
		panel_2.add(comboBoxDay);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(20, 287, 147, 22);
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setForeground(new Color(91, 91, 91));
		lblGender.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panel_2.add(lblGender);
		
		JComboBox comboboxMonth = new JComboBox(months);
		comboboxMonth.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboboxMonth.setBackground(new Color(255, 255, 255));
		comboboxMonth.setBounds(20, 246, 123, 31);
		panel_2.add(comboboxMonth);
		
		JComboBox comboBoxYear = new JComboBox(years);
		comboBoxYear.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBoxYear.setBackground(new Color(255, 255, 255));
		comboBoxYear.setBounds(305, 246, 123, 31);
		panel_2.add(comboBoxYear);
		
		JPanel panelFemale = new JPanel();
		panelFemale.setBackground(new Color(255, 255, 255));
		panelFemale.setBorder(new LineBorder(new Color(192, 192, 192)));
		panelFemale.setBounds(20, 315, 123, 31);
		panel_2.add(panelFemale);
		panelFemale.setLayout(null);
		
		JRadioButton rdbtnFemale = new JRadioButton("   Female");
		rdbtnFemale.setBounds(6, 6, 111, 19);
		panelFemale.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		rdbtnFemale.setBackground(new Color(255, 255, 255));
		
		JPanel panelMale = new JPanel();
		panelMale.setLayout(null);
		panelMale.setBorder(new LineBorder(new Color(192, 192, 192)));
		panelMale.setBackground(Color.WHITE);
		panelMale.setBounds(164, 315, 123, 31);
		panel_2.add(panelMale);
		
		JRadioButton rdbtnMale = new JRadioButton("   Male");
		rdbtnMale.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		rdbtnMale.setBackground(Color.WHITE);
		rdbtnMale.setBounds(6, 6, 111, 19);
		panelMale.add(rdbtnMale);
		
		JPanel panelOthers = new JPanel();
		panelOthers.setLayout(null);
		panelOthers.setBorder(new LineBorder(new Color(192, 192, 192)));
		panelOthers.setBackground(Color.WHITE);
		panelOthers.setBounds(305, 315, 123, 31);
		panel_2.add(panelOthers);
		
		JRadioButton rdbtnOthers = new JRadioButton("   Others");
		rdbtnOthers.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		rdbtnOthers.setBackground(Color.WHITE);
		rdbtnOthers.setBounds(6, 6, 111, 19);
		panelOthers.add(rdbtnOthers);
		
		JLabel lblOthers = new JLabel("People who use our service may have uploaded your contact information to");
		lblOthers.setHorizontalAlignment(SwingConstants.LEFT);
		lblOthers.setForeground(new Color(91, 91, 91));
		lblOthers.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblOthers.setBounds(20, 356, 408, 23);
		panel_2.add(lblOthers);
		
		JLabel lblOthers1 = new JLabel("Facebook.");
		lblOthers1.setHorizontalAlignment(SwingConstants.LEFT);
		lblOthers1.setForeground(new Color(91, 91, 91));
		lblOthers1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblOthers1.setBounds(20, 374, 63, 23);
		panel_2.add(lblOthers1);
		
		JLabel lblLearnMore = new JLabel("Learn more.");
		lblLearnMore.setHorizontalAlignment(SwingConstants.LEFT);
		lblLearnMore.setForeground(new Color(0, 95, 189));
		lblLearnMore.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblLearnMore.setBounds(81, 374, 63, 23);
		panel_2.add(lblLearnMore);
		
		JLabel lblOthers2 = new JLabel("By clicking Sign Up, you agree to our Terms, Privacy Policy and Cookies Policy.");
		lblOthers2.setHorizontalAlignment(SwingConstants.LEFT);
		lblOthers2.setForeground(new Color(91, 91, 91));
		lblOthers2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblOthers2.setBounds(20, 401, 408, 23);
		panel_2.add(lblOthers2);
		
		JLabel lblOthers3 = new JLabel("You may receive SMS Notifications from us and can opt out any time.");
		lblOthers3.setHorizontalAlignment(SwingConstants.LEFT);
		lblOthers3.setForeground(new Color(91, 91, 91));
		lblOthers3.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblOthers3.setBounds(20, 421, 408, 23);
		panel_2.add(lblOthers3);
		
		JPanel panelPassword = new JPanel();
		panelPassword.setBorder(new LineBorder(new Color(192, 192, 192)));
		panelPassword.setBackground(SystemColor.desktop);
		panelPassword.setBounds(20, 178, 408, 31);
		panel_2.add(panelPassword);
		panelPassword.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		passwordField.setText("Password");
		passwordField.setBorder(null);
		passwordField.setBounds(10, 5, 388, 20);
		panelPassword.add(passwordField);
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
	}
}
