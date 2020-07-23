import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class GuessingGame001 extends JFrame {
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int theNumber;
	
	public void checkGuess() {
		String guessText = txtGuess.getText();
		String message = "";
		
		int guess = Integer.parseInt(guessText);
		if (guess < theNumber)
			message = guess + "is too low. Try again.";
		else if (guess > theNumber)
			message = guess + "is too high. Try again.";
		else
			message = guess + "is correct. You win! Let's play again!";
		//newGame();
		lblOutput.setText(message);
		txtGuess.requestFocus();
		txtGuess.selectAll();
		
		}
	public void newGame() {
		theNumber = (int)(Math.random() * 100 + 1);
	}
	
	public GuessingGame001() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Richard Hi-Lo Guessing Game");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Guess a number between 1 and 100:");
		lblNewLabel_1.setBounds(35, 58, 198, 14);
		getContentPane().add(lblNewLabel_1);
		
		txtGuess = new JTextField();
		txtGuess.setBounds(216, 55, 86, 20);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);
		
		JButton btnGuess = new JButton("Guess!");
		
		btnGuess.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				checkGuess();
				
			}
			
		});
		
		btnGuess.setBounds(144, 121, 89, 23);
		getContentPane().add(btnGuess);
		
		lblOutput = new JLabel("Enter a number above and click Guess!");
		lblOutput.setBounds(104, 196, 198, 14);
		getContentPane().add(lblOutput);
		
		
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessingGame001 theGame = new GuessingGame001();
		theGame.newGame();
		theGame.setSize(new Dimension(450,450));
		theGame.setVisible(true);

	}
}
