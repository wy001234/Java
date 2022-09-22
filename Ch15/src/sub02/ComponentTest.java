package sub02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentTest extends JFrame {
	private final JLabel label = new JLabel("컴포넌트 실습하기");
	private final JLabel lblButtinl = new JLabel("TextFiled 컴포넌트l");
	private final JButton btn1 = new JButton("버튼1");
	private final JButton btn2 = new JButton("버튼2");
	private final JButton btn3 = new JButton("버튼3");
	private final JButton btn4 = new JButton("버튼4");
	private JTextField txtf2;
	private JTextField txtf1;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
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
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 483);
		getContentPane().setLayout(null);
		label.setBounds(12, 10, 148, 31);
		getContentPane().add(label);
		label.setFont(new Font("굴림", Font.BOLD, 14));
		lblButtinl.setBounds(12, 133, 158, 31);
		getContentPane().add(lblButtinl);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		btn1.setBounds(12, 92, 79, 31);
		getContentPane().add(btn1);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
				
			}
		});
		btn2.setBounds(112, 92, 79, 31);
		getContentPane().add(btn2);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼3 클릭...","대화상자 제목",JOptionPane.INFORMATION_MESSAGE);

			}
		});
		btn3.setBounds(222, 92, 79, 31);
		getContentPane().add(btn3);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer =JOptionPane.showConfirmDialog(null, "버튼4 클릭...","확인대화상자",JOptionPane.YES_NO_OPTION);
				
				if(answer == JOptionPane.YES_OPTION) {
					System.out.println("yes 클릭...");
				}else {
					System.out.println("no 클릭...");
				}
			}
		});
		
		
		btn4.setBounds(332, 92, 79, 31);
		getContentPane().add(btn4);
		
		JLabel lblButtinl_1 = new JLabel("Buttin 컴포넌트l");
		lblButtinl_1.setBounds(12, 51, 158, 31);
		getContentPane().add(lblButtinl_1);
		
		txtf2 = new JTextField();
		txtf2.setBounds(12, 191, 116, 21);
		getContentPane().add(txtf2);
		txtf2.setColumns(10);
		
		txtf1 = new JTextField();
		txtf1.setColumns(10);
		txtf1.setBounds(12, 163, 116, 21);
		getContentPane().add(txtf1);
		
		txtf3 = new JTextField();
		txtf3.setColumns(10);
		txtf3.setBounds(12, 217, 116, 21);
		getContentPane().add(txtf3);
		
		JLabel lblTxtf1Result = new JLabel("결과");
		lblTxtf1Result.setBounds(222, 169, 189, 15);
		getContentPane().add(lblTxtf1Result);
		
		JLabel lblTxtf2Result = new JLabel("결과");
		lblTxtf2Result.setBounds(222, 197, 189, 15);
		getContentPane().add(lblTxtf2Result);
		
		JLabel lblTxtf3Result = new JLabel("결과");
		lblTxtf3Result.setBounds(222, 223, 189, 15);
		getContentPane().add(lblTxtf3Result);
		
		JButton btnTxtf1 = new JButton("확인");
		btnTxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String txt = txtf1.getText();
				lblTxtf1Result.setText("결과: "+txt);
			}
		});
		btnTxtf1.setBounds(134, 160, 67, 26);
		getContentPane().add(btnTxtf1);
		
		
		JButton btnTxtf2 = new JButton("확인");
		btnTxtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt2 = txtf2.getText();
				lblTxtf2Result.setText("결과 : "+ txt2);
			}
		});
		btnTxtf2.setBounds(134, 190, 67, 26);
		getContentPane().add(btnTxtf2);
		
		JButton btnTxtf3 = new JButton("확인");
		btnTxtf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt3 = txtf3.getText();
				lblTxtf3Result.setText("결과 :"+txt3);
			}
		});
		btnTxtf3.setBounds(134, 216, 67, 26);
		getContentPane().add(btnTxtf3);
		
		JLabel lblChkResult = new JLabel("결과 :");
		lblChkResult.setBounds(12, 320, 148, 15);
		getContentPane().add(lblChkResult);
		
		JLabel lblNewLabel_1 = new JLabel("취미를 고르세요");
		lblNewLabel_1.setBounds(12, 270, 210, 15);
		getContentPane().add(lblNewLabel_1);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(13, 291, 59, 23);
		getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(80, 291, 59, 23);
		getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(152, 291, 59, 23);
		getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(222, 291, 59, 23);
		getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(293, 291, 59, 23);
		getContentPane().add(chk5);
		
		JLabel lblNewLabel_2 = new JLabel("Chackbox 컴포넌트");
		lblNewLabel_2.setBounds(12, 248, 148, 15);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnchk1 = new JButton("확인");
		btnchk1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> chks = new ArrayList<>();
				
				if(chk1.isSelected()) {
					chks.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					chks.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					chks.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					chks.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					chks.add(chk5.getText());
				}
				
				lblChkResult.setText("결과 : "+chks.toString());
				
			}
		});
		
		
		btnchk1.setBounds(344, 291, 67, 26);
		getContentPane().add(btnchk1);
		
		JLabel lblgenderResult = new JLabel("결과 :");
		lblgenderResult.setBounds(12, 395, 148, 15);
		getContentPane().add(lblgenderResult);
		
		JLabel lblNewLabel = new JLabel("RadioButton 컴포넌트");
		lblNewLabel.setBounds(12, 345, 148, 15);
		getContentPane().add(lblNewLabel);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(12, 366, 67, 23);
		getContentPane().add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(80, 366, 59, 23);
		getContentPane().add(rdFemale);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ButtonGroup bg = new ButtonGroup();
				bg.add(rdFemale);
				bg.add(rdMale);
				
				if(rdMale.isSelected()) {
					lblgenderResult.getText();
				}else {
					lblgenderResult.getText();
				}
					
				
				lblgenderResult.setText("결과:");
			}
		});
		btnGender.setBounds(144, 364, 67, 26);
		getContentPane().add(btnGender);
		
	}
}
