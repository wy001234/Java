package Test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test1 frame = new Test1();
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
	public Test1() {
		setTitle("나의 계산기 v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 286, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("굴림", Font.BOLD, 16));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(12, 10, 244, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(12, 64, 50, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1.setBounds(79, 64, 50, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_2.setBounds(145, 64, 50, 50);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_3.setBounds(207, 64, 50, 50);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("*");
		btnNewButton_3_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_3_1.setBounds(207, 125, 50, 50);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_2_1 = new JButton("5");
		btnNewButton_2_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_2_1.setBounds(145, 125, 50, 50);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_1_1 = new JButton("4");
		btnNewButton_1_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1_1.setBounds(79, 125, 50, 50);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_4 = new JButton("3");
		btnNewButton_4.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_4.setBounds(12, 125, 50, 50);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_3_2 = new JButton("-");
		btnNewButton_3_2.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_2.setBounds(207, 186, 50, 50);
		contentPane.add(btnNewButton_3_2);
		
		JButton btnNewButton_2_2 = new JButton("3");
		btnNewButton_2_2.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_2_2.setBounds(145, 186, 50, 50);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_1_2 = new JButton("2");
		btnNewButton_1_2.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1_2.setBounds(79, 186, 50, 50);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_5 = new JButton("1");
		btnNewButton_5.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_5.setBounds(12, 186, 50, 50);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_3_3 = new JButton("+");
		btnNewButton_3_3.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_3_3.setBounds(207, 246, 50, 50);
		contentPane.add(btnNewButton_3_3);
		
		JButton btnNewButton_2_3 = new JButton("=");
		btnNewButton_2_3.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_2_3.setBounds(145, 246, 50, 50);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_1_3 = new JButton("c");
		btnNewButton_1_3.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1_3.setBounds(79, 246, 50, 50);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_6 = new JButton("0");
		btnNewButton_6.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_6.setBounds(12, 246, 50, 50);
		contentPane.add(btnNewButton_6);
	}
}
