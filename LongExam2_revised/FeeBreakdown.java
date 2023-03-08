

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class FeeBreakdown {

	private JFrame frame; 
	private static String[] coursesOffered = {"Select Course", "Tourism","Computer Science", "Engineering", "Nursing", "Architecture"};
	private static String[] studentType = {"Select Student Type", "Discounted (GOLD)","Discounted (BLUE)", "Discounted (WHITE)", "Walk-in", "Continuing"};
	private String course = "";
	private String studType = "";
	int totalFees = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeeBreakdown window = new FeeBreakdown();
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
	public FeeBreakdown() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		EnrolleeCredentials tuition = new EnrolleeCredentials("","","","","");
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 160));
		frame.setBounds(100, 100, 350, 434);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFeeBreakdown = new JLabel("Fees Breakdown", SwingConstants.CENTER);
		lblFeeBreakdown.setForeground(Color.WHITE);
		lblFeeBreakdown.setFont(new Font("Georgia", Font.BOLD, 25));
		lblFeeBreakdown.setBounds(0, 11, 334, 38);
		frame.getContentPane().add(lblFeeBreakdown);
		
		JPanel panelTuitionFee = new JPanel();
		panelTuitionFee.setLayout(null);
		panelTuitionFee.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 128, 128)));
		panelTuitionFee.setBackground(Color.WHITE);
		panelTuitionFee.setBounds(54, 160, 224, 32);
		frame.getContentPane().add(panelTuitionFee);
		
		JLabel lblTuitionFee = new JLabel("");
		lblTuitionFee.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTuitionFee.setBounds(111, 7, 103, 18);
		panelTuitionFee.add(lblTuitionFee);
		
		JLabel lblTuition = new JLabel("Tuition:");
		lblTuition.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTuition.setBounds(10, 7, 91, 18);
		panelTuitionFee.add(lblTuition);
		
		JPanel panelMiscellaneousFee = new JPanel();
		panelMiscellaneousFee.setLayout(null);
		panelMiscellaneousFee.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 128, 128)));
		panelMiscellaneousFee.setBackground(Color.WHITE);
		panelMiscellaneousFee.setBounds(54, 209, 224, 32);
		frame.getContentPane().add(panelMiscellaneousFee);
		
		JLabel lblmiscellaneousFee = new JLabel("");
		lblmiscellaneousFee.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblmiscellaneousFee.setBounds(111, 7, 103, 18);
		panelMiscellaneousFee.add(lblmiscellaneousFee);
		
		JLabel lblMiscellaneous = new JLabel("Miscellaneous:");
		lblMiscellaneous.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMiscellaneous.setBounds(10, 7, 96, 18);
		panelMiscellaneousFee.add(lblMiscellaneous);
		
		JPanel panelInitialFee = new JPanel();
		panelInitialFee.setLayout(null);
		panelInitialFee.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 128, 128)));
		panelInitialFee.setBackground(Color.WHITE);
		panelInitialFee.setBounds(54, 257, 224, 32);
		frame.getContentPane().add(panelInitialFee);
		
		JLabel lblintialFee = new JLabel("");
		lblintialFee.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblintialFee.setBounds(111, 7, 103, 18);
		panelInitialFee.add(lblintialFee);
		
		JLabel lblInitialFees = new JLabel("Initial Fees:");
		lblInitialFees.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInitialFees.setBounds(10, 7, 96, 18);
		panelInitialFee.add(lblInitialFees);
		
		JPanel panelDiscountedFee = new JPanel();
		panelDiscountedFee.setLayout(null);
		panelDiscountedFee.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 128, 128)));
		panelDiscountedFee.setBackground(Color.WHITE);
		panelDiscountedFee.setBounds(54, 305, 224, 32);
		frame.getContentPane().add(panelDiscountedFee);
		
		JLabel lblDiscountedFee = new JLabel("");
		lblDiscountedFee.setForeground(new Color(255, 0, 0));
		lblDiscountedFee.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDiscountedFee.setBounds(111, 7, 103, 18);
		panelDiscountedFee.add(lblDiscountedFee);
		
		JLabel lblDiscountedFees = new JLabel("Total Fees:");
		lblDiscountedFees.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDiscountedFees.setBounds(10, 7, 96, 18);
		panelDiscountedFee.add(lblDiscountedFees);
		
		JComboBox comboBoxStudentType = new JComboBox(studentType);
		comboBoxStudentType.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				studType = (String) comboBoxStudentType.getSelectedItem();	
				totalFees = tuition.totalFees(studType, course, 0, 0);
				
				if (course.equals("Select course") || course.equals("")) {
					lblDiscountedFee.setText("");
				} else {
				lblDiscountedFee.setText("Php " + Integer.toString(totalFees));
				}
				
			}
		});
		comboBoxStudentType.setBounds(54, 110, 224, 32);
		frame.getContentPane().add(comboBoxStudentType);
		
		JComboBox comboBoxCourses = new JComboBox(coursesOffered);
		comboBoxCourses.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				course = (String) comboBoxCourses.getSelectedItem();
				int tf = tuition.tuitionFees(course, 0);
				int mf = tuition.miscellaneousFees(course, tf);
				int initialFee = tf + mf;
				totalFees = tuition.totalFees(studType, course, 0, 0);
				
				if (course.equals("Select course")) {
					lblDiscountedFee.setText("");
				} else {
					lblDiscountedFee.setText("Php " + Integer.toString(totalFees));
				}
				
				lblTuitionFee.setText("Php " + Integer.toString(tf));
				lblmiscellaneousFee.setText("Php " + Integer.toString(mf));
				lblintialFee.setText("Php " + Integer.toString(initialFee));
				
			}
		});
		
		comboBoxCourses.setBounds(54, 60, 224, 32);
		frame.getContentPane().add(comboBoxCourses);
		
		JButton btnReturnToEnrollment = new JButton("EXIT");
		btnReturnToEnrollment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		btnReturnToEnrollment.setForeground(Color.WHITE);
		btnReturnToEnrollment.setBackground(Color.RED);
		btnReturnToEnrollment.setBounds(54, 355, 85, 21);
		frame.getContentPane().add(btnReturnToEnrollment);
		
		JButton btnClearContents = new JButton("CLEAR");
		btnClearContents.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				comboBoxCourses.setSelectedIndex(0);
				comboBoxStudentType.setSelectedIndex(0);
				
				lblTuitionFee.setText("");
				lblmiscellaneousFee.setText("");
				lblintialFee.setText("");
				lblDiscountedFee.setText("");
				
			}
		});
		btnClearContents.setForeground(Color.WHITE);
		btnClearContents.setBackground(new Color(0, 255, 0));
		btnClearContents.setBounds(193, 354, 85, 21);
		frame.getContentPane().add(btnClearContents);
	}
}
