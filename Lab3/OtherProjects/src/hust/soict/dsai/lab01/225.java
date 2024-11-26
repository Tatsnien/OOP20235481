import javax.swing.JOptionPane;

public class 225 {

	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog(null, 
				"Input the first number: ",
				"First number input",
				JOptionPane.INFORMATION_MESSAGE);
		
		String input2 = JOptionPane.showInputDialog(null, 
				"Input the second number: ",
				"Second number input",
				JOptionPane.INFORMATION_MESSAGE);
		
		double num1 = Double.parseDouble(input1);
		double num2 = Double.parseDouble(input2);
		
		JOptionPane.showMessageDialog(null,
				"Sum: " + (num1 + num2) + "\n" + 
				"Difference: " + (num1 - num2) + "\n" +
				"Product: " + (num1 * num2) + "\n" +
				"Quotient: " + (num2 == 0 ? "Not exist" : num1 / num2));
		
		System.exit(0);
	}

}
