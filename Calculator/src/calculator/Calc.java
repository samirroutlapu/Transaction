package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calc {

	private JFrame frame;
	private JTextField textDisplay;
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 328, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 textDisplay = new JTextField();
		 textDisplay.setBackground(Color.CYAN);
		 textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		 textDisplay.setBounds(10, 11, 295, 70);
		frame.getContentPane().add( textDisplay);
		 textDisplay.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setBounds(10, 92, 75, 53);
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace= null;
				if(textDisplay.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textDisplay.getText());
					str.deleteCharAt( textDisplay.getText().length()-1);
					backSpace= str.toString();
					 textDisplay.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		frame.getContentPane().add(btnBackspace);
		
		JButton btnClear = new JButton("C");
		btnClear.setBounds(84, 92, 75, 53);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnClear);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(158, 92, 75, 53);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble( textDisplay.getText());
				 textDisplay.setText("");
				operation="/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnDiv);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textDisplay.getText()+btn7.getText();
				 textDisplay.setText(number);
				
			}
		});
		btn7.setBounds(10, 144, 75, 53);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textDisplay.getText()+btn8.getText();
				 textDisplay.setText(number);
				
			}
		});
		btn8.setBounds(84, 144, 75, 53);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textDisplay.getText()+btn9.getText();
				 textDisplay.setText(number);
				
			}
		});
		btn9.setBounds(158, 144, 75, 53);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textDisplay.getText()+btn4.getText();
				 textDisplay.setText(number);
				
			}
		});
		btn4.setBounds(10, 194, 75, 53);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textDisplay.getText()+btn1.getText();
				 textDisplay.setText(number);
				
			}
		});
		btn1.setBounds(10, 247, 75, 53);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn1);
		
		JButton btn = new JButton("0");
		btn.setBounds(10, 300, 75, 53);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textDisplay.getText()+btn.getText();
				 textDisplay.setText(number);
				
			}
		});
		btn.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textDisplay.getText()+btn5.getText();
				 textDisplay.setText(number);
				
			}
		});
		btn5.setBounds(84, 194, 75, 53);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textDisplay.getText()+btn2.getText();
				 textDisplay.setText(number);
				
			}
		});
		btn2.setBounds(84, 247, 75, 53);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textDisplay.getText()+btnDot.getText();
				 textDisplay.setText(number);
				
			}
		});
		btnDot.setBounds(84, 300, 75, 53);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnDot);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textDisplay.getText()+btn6.getText();
				 textDisplay.setText(number);
				
			}
		});
		btn6.setBounds(158, 194, 75, 53);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =  textDisplay.getText()+btn3.getText();
				 textDisplay.setText(number);
				
			}
		});
		btn3.setBounds(158, 247, 75, 53);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn3);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble( textDisplay.getText());
				 textDisplay.setText("");
				operation="-";
			}
		});
		btnSub.setBounds(230, 144, 75, 53);
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setBounds(230, 92, 75, 53);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble( textDisplay.getText());
				 textDisplay.setText("");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnAdd);
		
		JButton btnMul = new JButton("X");
		btnMul.setBounds(230, 194, 75, 53);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble( textDisplay.getText());
				 textDisplay.setText("");
				operation="X";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnMul);
		
		JButton btnper = new JButton("%");
		btnper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble( textDisplay.getText());
				 textDisplay.setText("");
				operation="%";
			}
		});
		btnper.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnper.setBounds(230, 247, 75, 53);
		frame.getContentPane().add(btnper);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				second=Double.parseDouble( textDisplay.getText());
				if(operation=="+")
				{
					
					result=first+second;
					answer=String.format("%.2f",result);
					 textDisplay.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f",result);
					 textDisplay.setText(answer);
				}
				else if(operation=="X")
				{
					result=first*second;
					answer=String.format("%.2f",result);
					 textDisplay.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f",result);
					 textDisplay.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f",result);
					 textDisplay.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(158, 300, 147, 53);
		frame.getContentPane().add(btnEqual);
	}
}
