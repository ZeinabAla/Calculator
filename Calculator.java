package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textDisplay;

	// Some variables for ya mum
	double firstnum; // double bc it could hold a decimal
	double secondnum;
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
		frame.getContentPane().setBackground(new Color(255, 192, 203));
		frame.setBounds(100, 100, 403, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setForeground(new Color(0, 191, 255));
		textDisplay.setBackground(new Color(255, 255, 255));
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 24));
		textDisplay.setBounds(47, 43, 286, 44);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
		
		// ------------ ROW 1 ------------
		//---------- Buttons ( <- , C , % , + ) ----------
		
		
		JButton btnBackSpace = new JButton("\u2190");
		btnBackSpace.setBackground(new Color(255, 182, 193));
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace=null;
				
				if(textDisplay.getText().length()>0) { // get the text and if it is less than zero
				StringBuilder strB = new StringBuilder(textDisplay.getText()); // create string builder and store in the text
				strB.deleteCharAt(textDisplay.getText().length() -1); // delete character from text,, delete 1
				backspace = strB.toString();
				textDisplay.setText(backspace);
				
				}
				
			}
		});
		btnBackSpace.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btnBackSpace.setBounds(49, 95, 55, 55);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnClear = new JButton("C");
		btnClear.setBackground(new Color(255, 182, 193));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btnClear.setBounds(130, 95, 55, 55);
		frame.getContentPane().add(btnClear);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setBackground(new Color(221, 160, 221));
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText()); 
				//First Value is stored inside the variable (firstnum)
				
				textDisplay.setText("");
				operations = "%"; // The String variable 'operations' is set to '%'
				
				
			}
		});
		btnPercent.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btnPercent.setBounds(203, 95, 55, 55);
		frame.getContentPane().add(btnPercent);
		
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(new Color(221, 160, 221));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText()); 
				//First Value is stored inside the variable (firstnum)
				
				textDisplay.setText("");
				operations = "+"; // The String variable 'operations' is set to '+'
				
			}
		});
		btnPlus.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btnPlus.setBounds(278, 95, 55, 55);
		frame.getContentPane().add(btnPlus);
		
		
		// ------------ ROW 1 ------------
		//---------- Buttons ( 7 , 8 , 9 , - ) ----------
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(230, 230, 250));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn7.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btn7.setBounds(49, 154, 55, 55);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(230, 230, 250));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn8.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btn8.setBounds(130, 154, 55, 55);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(230, 230, 250));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn9.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btn9.setBounds(203, 154, 55, 55);
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.setBackground(new Color(221, 160, 221));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText()); 
				//First Value is stored inside the variable (firstnum)
				
				textDisplay.setText("");
				operations = "-"; // The String variable 'operations' is set to '+'
				
				
				
			}
		});
		btnSub.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btnSub.setBounds(278, 154, 55, 55);
		frame.getContentPane().add(btnSub);

		// ------------ ROW 2 ------------
	    //---------- Buttons ( 4 , 5 , 6 , * ) ----------
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(230, 230, 250));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn4.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btn4.setBounds(49, 215, 55, 55);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(230, 230, 250));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn5.getText();
				textDisplay.setText(EnterNumber);
				
			}
		});
		btn5.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btn5.setBounds(130, 215, 55, 55);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(230, 230, 250));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn6.getText();
				textDisplay.setText(EnterNumber);
				
			}
		});
		btn6.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btn6.setBounds(203, 215, 55, 55);
		frame.getContentPane().add(btn6);
		
		JButton btnMult = new JButton("*");
		btnMult.setBackground(new Color(221, 160, 221));
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText()); 
				//First Value is stored inside the variable (firstnum)
				
				textDisplay.setText("");
				operations = "*"; // The String variable 'operations' is set to '+'
				
			}
		});
		btnMult.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btnMult.setBounds(278, 215, 55, 55);
		frame.getContentPane().add(btnMult);
		
		
		// ------------ ROW 3 ------------
	    //---------- Buttons ( 1 , 2 , 3 , / ) ----------
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(230, 230, 250));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn1.getText();
				textDisplay.setText(EnterNumber);
				
			}
		});
		btn1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btn1.setBounds(49, 276, 55, 55);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(230, 230, 250));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn2.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btn2.setBounds(130, 276, 55, 55);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(230, 230, 250));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn3.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btn3.setBounds(203, 276, 55, 55);
		frame.getContentPane().add(btn3);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBackground(new Color(221, 160, 221));
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText()); 
				//First Value is stored inside the variable (firstnum)
				
				textDisplay.setText("");
				operations = "/"; // The String variable 'operations' is set to '+'
				
			}
		});
		btnDivide.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btnDivide.setBounds(278, 276, 55, 55);
		frame.getContentPane().add(btnDivide);
		

		
		// ------------ ROW 4 ------------
	    //---------- Buttons ( 0 , . ,  , = ) ----------
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(230, 230, 250));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn0.getText();
				textDisplay.setText(EnterNumber);
				
			}
		});
		btn0.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btn0.setBounds(49, 337, 55, 55);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(! textDisplay.getText().contains("."))
				{
					textDisplay.setText(textDisplay.getText()+btnDot.getText());
					
				}				
			}
		});
		btnDot.setBackground(new Color(230, 230, 250));
		btnDot.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		btnDot.setBounds(130, 337, 55, 55);
		frame.getContentPane().add(btnDot);
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.setBackground(new Color(221, 160, 221));
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			double ops = Double.parseDouble(textDisplay.getText()); 		
			ops= ops *(-1);
			textDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnPM.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btnPM.setBounds(203, 337, 55, 55);
		frame.getContentPane().add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(new Color(238, 130, 238));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Call your String variable to store the Answer
				String answer;
				secondnum = Double.parseDouble(textDisplay.getText());
				if (operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);		
				}
				else if (operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);	
				}
				
				else if (operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if (operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if (operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}							
				
			}
		});
		btnEqual.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		btnEqual.setBounds(278, 337, 55, 55);
		frame.getContentPane().add(btnEqual);
		

	}
}
