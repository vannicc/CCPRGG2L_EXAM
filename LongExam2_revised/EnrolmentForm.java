import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import javax.swing.JTable;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

public class EnrolmentForm {

	private JFrame frame;
	private JTextField textFirstName;
	private JTextField textLastName;
	private JTextField textIDNumber;
	private static String[] coursesOffered = {"Select Course", "Tourism","Computer Science", "Engineering", "Nursing", "Architecture"};
	private static String[] studentType = {"Select Student Type", "Discounted (GOLD)","Discounted (BLUE)", "Discounted (WHITE)", "Walk-in", "Continuing"};
	private String comboStudentType;
	private String comboCourseName;
	private JTable table;
	private int totalPayableFee;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnrolmentForm window = new EnrolmentForm();
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
	public EnrolmentForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 650);
		frame.setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Object[] columns = {"First Name", "Last Name", "Student ID", "Course", "Student Type", "Tot. Fees (in Php)"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		
		JLabel lblEnrollmentForm = new JLabel("Enrollment Form", SwingConstants.CENTER);
		lblEnrollmentForm.setForeground(new Color(255, 255, 255));
		lblEnrollmentForm.setFont(new Font("Georgia", Font.BOLD, 25));
		lblEnrollmentForm.setBounds(319, 11, 365, 38);
		frame.getContentPane().add(lblEnrollmentForm);
		
		JPanel panelFirstName = new JPanel();
		panelFirstName.setBackground(new Color(255, 255, 255));
		panelFirstName.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 128, 128)));
		panelFirstName.setBounds(388, 88, 224, 32);
		frame.getContentPane().add(panelFirstName);
		panelFirstName.setLayout(null);
		
		textFirstName = new JTextField();
		textFirstName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textFirstName.getText().equals("First Name")) {
					textFirstName.setText("");
				}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if (textFirstName.getText().equals("")) {
					textFirstName.setText("First Name");
				}
			}
		});
		textFirstName.setBorder(null);
		textFirstName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFirstName.setText("First Name");
		textFirstName.setBounds(10, 6, 204, 20);
		panelFirstName.add(textFirstName);
		textFirstName.setColumns(10);
		
		JPanel panelLastName = new JPanel();
		panelLastName.setLayout(null);
		panelLastName.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 128, 128)));
		panelLastName.setBackground(Color.WHITE);
		panelLastName.setBounds(388, 149, 224, 32);
		frame.getContentPane().add(panelLastName);
		
		textLastName = new JTextField();
		textLastName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textLastName.getText().equals("Last Name")) {
					textLastName.setText("");
				}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if (textLastName.getText().equals("")) {
					textLastName.setText("Last Name");
				}
			}
		});
		textLastName.setText("Last Name");
		textLastName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textLastName.setColumns(10);
		textLastName.setBorder(null);
		textLastName.setBounds(10, 6, 204, 20);
		panelLastName.add(textLastName);
		
		JPanel panelIDNumber = new JPanel();
		panelIDNumber.setLayout(null);
		panelIDNumber.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 128, 128)));
		panelIDNumber.setBackground(Color.WHITE);
		panelIDNumber.setBounds(388, 210, 224, 32);
		frame.getContentPane().add(panelIDNumber);
		
		textIDNumber = new JTextField();
		textIDNumber.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textIDNumber.getText().equals("ID Number")) {
					textIDNumber.setText("");
				}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if (textIDNumber.getText().equals("")) {
					textIDNumber.setText("ID Number");
				}
			}
		});
		textIDNumber.setText("ID Number");
		textIDNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textIDNumber.setColumns(10);
		textIDNumber.setBorder(null);
		textIDNumber.setBounds(10, 6, 204, 20);
		panelIDNumber.add(textIDNumber);
		
		JComboBox comboBoxStudentType = new JComboBox(studentType);
		comboBoxStudentType.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					comboStudentType = comboBoxStudentType.getSelectedItem().toString();
				} else {
					comboStudentType = "";
				}
			}
		});
		
		comboBoxStudentType.setBounds(388, 268, 224, 32);
		frame.getContentPane().add(comboBoxStudentType);
		
		JComboBox comboBoxCourse = new JComboBox(coursesOffered);
		comboBoxCourse.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					comboCourseName = comboBoxCourse.getSelectedItem().toString();
				} else {
					comboCourseName = "";
				}
			}
		});
		
		comboBoxCourse.setBounds(388, 326, 224, 32);
		frame.getContentPane().add(comboBoxCourse);
		
		JLabel lblStudFirstName = new JLabel("Student's First Name");
		lblStudFirstName.setForeground(new Color(255, 255, 255));
		lblStudFirstName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblStudFirstName.setBounds(388, 68, 224, 14);
		frame.getContentPane().add(lblStudFirstName);
		
		JLabel lblStudLastName = new JLabel("Student's Last Name");
		lblStudLastName.setForeground(new Color(255, 255, 255));
		lblStudLastName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblStudLastName.setBounds(388, 131, 224, 14);
		frame.getContentPane().add(lblStudLastName);
		
		JLabel lblStudIDNumber = new JLabel("Student's ID Number");
		lblStudIDNumber.setForeground(new Color(255, 255, 255));
		lblStudIDNumber.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblStudIDNumber.setBounds(388, 192, 224, 14);
		frame.getContentPane().add(lblStudIDNumber);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(0, 0, 160));
		panel.setBounds(0, 0, 684, 434);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnEnrollStudent = new JButton("Enroll Student");
		btnEnrollStudent.setForeground(new Color(255, 255, 255));
		btnEnrollStudent.setBackground(new Color(0, 193, 49));
		btnEnrollStudent.setBounds(387, 377, 224, 32);
		panel.add(btnEnrollStudent);
		btnEnrollStudent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			boolean enrollmentSuccess = false;
			EnrolleeCredentials enroll = new EnrolleeCredentials("","","",comboCourseName,comboStudentType);
				totalPayableFee = enroll.totalFees(comboStudentType, comboCourseName, 0, 0);
			
				if (textFirstName.getText().equals("") || textLastName.getText().equals("") || textIDNumber.getText().equals("") || comboStudentType.equals("") || comboCourseName.equals("")) {
					enrollmentSuccess = false;
				}
				else if (textFirstName.getText().equals("First Name") || textLastName.getText().equals("Last Name") || textIDNumber.getText().equals("ID Number") || comboStudentType.equals("Select Student Type") || comboCourseName.equals("Select Course")) {	
					enrollmentSuccess = false;
					
				} else {
					enrollmentSuccess = true;
				}


				if (enrollmentSuccess) {
					
					btnEnrollStudent.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Object[] row = new Object[6];
							row[0] = textFirstName.getText();
							row[1] = textLastName.getText();
							row[2] = textIDNumber.getText();
							row[3] = comboBoxCourse.getSelectedItem();
							row[4] = comboBoxStudentType.getSelectedItem();
							row[5] = totalPayableFee;
					
							model.addRow(row);
							}
						}); 
					
					JOptionPane.showMessageDialog(null, "Enrollment Complete!");
					
				} else {
					JOptionPane.showMessageDialog(null, "Invalid Input, Please try again!");
				}
				
				} 
		});
		btnEnrollStudent.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblSchoolPoster = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("HNSPOST.png")).getImage();
		lblSchoolPoster.setIcon(new ImageIcon(img));
		lblSchoolPoster.setBounds(0, 0, 309, 434);
		lblSchoolPoster.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(lblSchoolPoster);
		
		JLabel lblCourse = new JLabel("Student Type");
		lblCourse.setForeground(new Color(255, 255, 255));
		lblCourse.setBounds(387, 251, 224, 14);
		panel.add(lblCourse);
		lblCourse.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblStudType = new JLabel("Course");
		lblStudType.setForeground(new Color(255, 255, 255));
		lblStudType.setBounds(387, 308, 224, 14);
		panel.add(lblStudType);
		lblStudType.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
			
			JPanel panelEnrollDisplay = new JPanel();
			panelEnrollDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
			panelEnrollDisplay.setBackground(new Color(255, 219, 72));
			panelEnrollDisplay.setBounds(0, 435, 684, 176);
			frame.getContentPane().add(panelEnrollDisplay);
			panelEnrollDisplay.setLayout(null);
			
			table = new JTable();
			table.setModel(model);
			table.setBackground(Color.WHITE);
			table.setForeground(Color.BLACK);
			table.setSelectionBackground(Color.RED);
			table.setGridColor(Color.RED);
			table.setSelectionForeground(Color.WHITE);
			table.setFont(new Font("Tahoma", Font.PLAIN, 12));
			table.setRowHeight(30);
			table.setAutoCreateRowSorter(true);
			
				JScrollPane pane = new JScrollPane(table);
				pane.setBounds(10, 37, 664, 128);
				panelEnrollDisplay.add(pane);
				pane.setForeground(Color.RED);
				pane.setBackground(Color.WHITE);
				
				JLabel lblEnrolledStudents = new JLabel("Students Enrolled");
				lblEnrolledStudents.setBounds(10, 12, 167, 14);
				panelEnrollDisplay.add(lblEnrolledStudents);
				lblEnrolledStudents.setFont(new Font("Tahoma", Font.BOLD, 12));
				
				JButton btnNewButton = new JButton("Log Out");
				btnNewButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						LoginPage login = new LoginPage();
						frame.dispose();
						login.main(null);
					}
				});
				btnNewButton.setForeground(new Color(255, 255, 255));
				btnNewButton.setBackground(new Color(255, 0, 0));
				btnNewButton.setBounds(589, 10, 85, 21);
				panelEnrollDisplay.add(btnNewButton);
	}
}
