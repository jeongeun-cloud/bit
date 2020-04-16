package org.comstudy21.test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProjTest {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjTest window = new ProjTest();
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
	public ProjTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 730, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uBC88 \uD638");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(28, 26, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(97, 23, 165, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(321, 0, 393, 210);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774 \uB984");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setBounds(28, 68, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(97, 65, 165, 21);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uC774 \uBA54 \uC77C");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_1.setBounds(28, 111, 57, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(97, 108, 165, 21);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_2.setBounds(28, 158, 57, 15);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(97, 155, 165, 21);
		frame.getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("\uC804\uCCB4\uBCF4\uAE30");
		btnNewButton.setBounds(97, 228, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCD94  \uAC00");
		btnNewButton_1.setBounds(206, 228, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC0AD  \uC81C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(315, 228, 97, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("\uAC80  \uC0C9");
		btnNewButton_2_1.setBounds(424, 228, 97, 23);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("\uCDE8  \uC18C");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1_1.setBounds(533, 228, 97, 23);
		frame.getContentPane().add(btnNewButton_2_1_1);
	}
}
