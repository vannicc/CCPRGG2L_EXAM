import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		Object[] columns = {"First Name", "Last Name", "Student ID", "Course", "Student Type", "Total Fees"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
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
				pane.setForeground(Color.RED);
				pane.setBackground(Color.WHITE);
				pane.setBounds(37,461,637,128);
				frame.getContentPane().add(pane);
		
		JLabel lblEnrollmentForm = new JLabel("Enrollment Form", SwingConstants.CENTER);
		lblEnrollmentForm.setFont(new Font("Georgia", Font.BOLD, 25));
		lblEnrollmentForm.setBounds(37, 11, 415, 38);
		frame.getContentPane().add(lblEnrollmentForm);
		
		JPanel panelFirstName = new JPanel();
		panelFirstName.setBackground(new Color(255, 255, 255));
		panelFirstName.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 128, 128)));
		panelFirstName.setBounds(137, 88, 224, 32);
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
		panelLastName.setBounds(137, 149, 224, 32);
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
		panelIDNumber.setBounds(137, 210, 224, 32);
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
					comboStudentType = "";
				
					if (comboBoxStudentType.getSelectedItem().toString().equals("Employee")) {
						comboStudentType = "Employee";
					} else if (comboBoxStudentType.getSelectedItem().toString().equals("Customer")) {
						comboStudentType = "Customer";
					} 
				
				} else {
					comboStudentType = "";
				}
			}
		});
		
		comboBoxStudentType.setBounds(137, 268, 224, 32);
		frame.getContentPane().add(comboBoxStudentType);
		
		JComboBox comboBoxCourse = new JComboBox(coursesOffered);
		comboBoxCourse.setBounds(137, 331, 224, 32);
		frame.getContentPane().add(comboBoxCourse);
		
		JButton btnEnrollStudent = new JButton("Enroll Student");
		btnEnrollStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] row = new Object[6];
				row[0] = textFirstName.getText();
				row[1] = textLastName.getText();
				row[2] = textIDNumber.getText();
				row[3] = comboStudentType;
				
				model.addRow(row);
				
			}
		});
		
		btnEnrollStudent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			boolean enrollmentSuccess = false;
			
			
			
			
			}
		});
		btnEnrollStudent.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEnrollStudent.setBounds(137, 388, 224, 32);
		frame.getContentPane().add(btnEnrollStudent);
		
		JLabel lblStudFirstName = new JLabel("Student's First Name");
		lblStudFirstName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblStudFirstName.setBounds(137, 70, 224, 14);
		frame.getContentPane().add(lblStudFirstName);
		
		JLabel lblStudLastName = new JLabel("Student's Last Name");
		lblStudLastName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblStudLastName.setBounds(137, 131, 224, 14);
		frame.getContentPane().add(lblStudLastName);
		
		JLabel lblStudIDNumber = new JLabel("Student's ID Number");
		lblStudIDNumber.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblStudIDNumber.setBounds(137, 192, 224, 14);
		frame.getContentPane().add(lblStudIDNumber);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCourse.setBounds(137, 253, 224, 14);
		frame.getContentPane().add(lblCourse);
		
		JLabel lblStudType = new JLabel("Student Type");
		lblStudType.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblStudType.setBounds(137, 311, 224, 14);
		frame.getContentPane().add(lblStudType);
		
		JLabel lblEnrolledStudents = new JLabel("Students Enrolled");
		lblEnrolledStudents.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnrolledStudents.setBounds(37, 436, 167, 14);
		frame.getContentPane().add(lblEnrolledStudents);
	}
}
