package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	
	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 411, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.BOLD, 30));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(30, 10, 334, 75);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		//================ ROW1 ====================
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("굴림", Font.BOLD, 18));
		btn7.setBounds(32, 159, 73, 52);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("굴림", Font.BOLD, 18));
		btn8.setBounds(123, 159, 73, 52);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("굴림", Font.BOLD, 18));
		btn9.setBounds(208, 159, 73, 52);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("굴림", Font.BOLD, 18));
		btnPlus.setBounds(291, 95, 73, 52);
		frame.getContentPane().add(btnPlus);
	
		//================ ROW2 ====================
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("굴림", Font.BOLD, 18));
		btn4.setBounds(32, 221, 73, 52);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("굴림", Font.BOLD, 18));
		btn5.setBounds(123, 221, 69, 52);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("굴림", Font.BOLD, 18));
		btn6.setBounds(208, 221, 73, 52);
		frame.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("굴림", Font.BOLD, 18));
		btnSub.setBounds(293, 159, 71, 52);
		frame.getContentPane().add(btnSub);
		//===================== ROW3 ====================
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("굴림", Font.BOLD, 18));
		btn1.setBounds(32, 283, 73, 52);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("굴림", Font.BOLD, 18));
		btn2.setBounds(123, 283, 73, 52);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("굴림", Font.BOLD, 18));
		btn3.setBounds(208, 283, 73, 52);
		frame.getContentPane().add(btn3);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("굴림", Font.BOLD, 18));
		btnMult.setBounds(291, 221, 73, 52);
		frame.getContentPane().add(btnMult);
		
		//======================= ROW4 =======================
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("굴림", Font.BOLD, 18));
		btn0.setBounds(32, 345, 73, 52);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("굴림", Font.BOLD, 18));
		btnDot.setBounds(123, 345, 73, 52);
		frame.getContentPane().add(btnDot);
		
		JButton btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops =ops *(-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("굴림", Font.PLAIN, 9));
		btnPM.setBounds(207, 348, 74, 52);
		frame.getContentPane().add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNum = Double.parseDouble(textField.getText());
				
				switch (operations) {
				case "+":
					 result = firstNum + secondNum;
					 answer = String.format("%.2f", result);
					 setTextManager(answer);
					break;
				case "-" :
					result = firstNum - secondNum;
					 answer = String.format("%.2f", result);
					 setTextManager(answer);
					break;
				case "*" :
					result = firstNum * secondNum;
					 answer = String.format("%.2f", result);
					 setTextManager(answer);
					break;
				case "/" :
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					setTextManager(answer);
					break;
				case "%" :
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					setTextManager(answer);
					break;
				}
				
			}
		});
		btnEqual.setFont(new Font("굴림", Font.BOLD, 18));
		btnEqual.setBounds(291, 345, 73, 52);
		frame.getContentPane().add(btnEqual);
		
		JButton btnBack = new JButton("<=");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				
				if(textField.getText().length() > 0) {
					StringBuilder sb = new StringBuilder(textField.getText());
					sb.deleteCharAt(textField.getText().length()-1);
					backspace = sb.toString();
					textField.setText(backspace);
					
					
				}
			}
		});
		btnBack.setFont(new Font("굴림", Font.BOLD, 18));
		btnBack.setBounds(30, 95, 75, 52);
		frame.getContentPane().add(btnBack);
		
		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnCancel.setFont(new Font("굴림", Font.BOLD, 18));
		btnCancel.setBounds(123, 94, 69, 55);
		frame.getContentPane().add(btnCancel);
		
		JButton btnRemainder = new JButton("%");
		btnRemainder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnRemainder.setFont(new Font("굴림", Font.BOLD, 18));
		btnRemainder.setBounds(206, 94, 73, 55);
		frame.getContentPane().add(btnRemainder);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("굴림", Font.BOLD, 18));
		btnDiv.setBounds(291, 283, 73, 52);
		frame.getContentPane().add(btnDiv);
		
		
		
		
	}
	public void setTextManager(String s) {
		textField.setText(s);
	}
}


