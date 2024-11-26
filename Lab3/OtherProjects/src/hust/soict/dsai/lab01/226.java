import javax.swing.JOptionPane;

public class 226 {	
	private static void firstEquation() {
		double a = Double.parseDouble(
				JOptionPane.showInputDialog(null, 
				"Input a: ",
				"Input a",
				JOptionPane.INFORMATION_MESSAGE)
				);
		
		double b = Double.parseDouble(
				JOptionPane.showInputDialog(null, 
				"Input b: ",
				"Input b",
				JOptionPane.INFORMATION_MESSAGE)
				);
		
		JOptionPane.showMessageDialog(null, 
				a == 0 ? 
				"There is no solution" :
				"x = " + (b == 0 ? 0 : -b / a));
	}
	
	private static void firstSystem() {
		double a11 = Double.parseDouble(
				JOptionPane.showInputDialog(null, 
				"Input a11: ",
				"Input a11",
				JOptionPane.INFORMATION_MESSAGE)
				);
		
		double a12 = Double.parseDouble(
				JOptionPane.showInputDialog(null, 
				"Input a12: ",
				"Input a12",
				JOptionPane.INFORMATION_MESSAGE)
				);
		
		double b1 = Double.parseDouble(
				JOptionPane.showInputDialog(null, 
				"Input b1: ",
				"Input b1",
				JOptionPane.INFORMATION_MESSAGE)
				);
		
		double a21 = Double.parseDouble(
				JOptionPane.showInputDialog(null, 
				"Input a21: ",
				"Input a21",
				JOptionPane.INFORMATION_MESSAGE)
				);
		
		double a22 = Double.parseDouble(
				JOptionPane.showInputDialog(null, 
				"Input a22: ",
				"Input a22",
				JOptionPane.INFORMATION_MESSAGE)
				);
		
		double b2 = Double.parseDouble(
				JOptionPane.showInputDialog(null, 
				"Input b2: ",
				"Input b2",
				JOptionPane.INFORMATION_MESSAGE)
				);
		
		double d = a11 * a22 - a21 * a12;
		double d1 = b1 * a22 - b2 * a12;
		double d2 = a11 * b2 - a21 * b1;
		
		if (d == 0)
			JOptionPane.showMessageDialog(null, 
					"There are infinity solutions");
		else {
			JOptionPane.showMessageDialog(null, 
					"x1 = " + (d1 == 0 ? 0 : d1 / d) + "\n" +
					"x2 = " + (d1 == 0 ? 0 : d2 / d));
		}
	}
	
	private static void secondEquation() {
		double a = Double.parseDouble(
				JOptionPane.showInputDialog(null, 
				"Input a: ",
				"Input a",
				JOptionPane.INFORMATION_MESSAGE)
				);
		
		double b = Double.parseDouble(
				JOptionPane.showInputDialog(null, 
				"Input b: ",
				"Input b",
				JOptionPane.INFORMATION_MESSAGE)
				);
		
		double c = Double.parseDouble(
				JOptionPane.showInputDialog(null, 
				"Input c: ",
				"Input c",
				JOptionPane.INFORMATION_MESSAGE)
				);
		
		double delta = b * b - 4 * a * c;
		
		if (a == 0) {
			JOptionPane.showMessageDialog(null, 
					b == 0 ? 
					"There is no solution" :
					"x = " + (c == 0 ? 0 : - c / b));
			return;
		}
		
		if (delta < 0)
			JOptionPane.showMessageDialog(null, 
					"There is no solution");
		else if (delta == 0)
			JOptionPane.showMessageDialog(null, 
					"x = " + (b == 0 ? 0 : -b / (2 * a)));
		else
			JOptionPane.showMessageDialog(null, 
					"x1 = " + (-b - Math.sqrt(delta)) / (2 * a) + "\n" +
					"x2 = " + (-b + Math.sqrt(delta)) / (2 * a));
		
	}

	public static void main(String[] args) {
		Object[] options = { 
				"Linear equation", 
				"Linear system", 
				"Quadratic equation"};

		Object option = JOptionPane.showInputDialog(null,
		             "Choose the equation", 
		             "Equation choosing",
		             JOptionPane.QUESTION_MESSAGE, 
		             null,
		             options, 
		             options[0]);
		
		if (option == options[0])
			firstEquation();
		else if (option == options[1])
			firstSystem();
		else
			secondEquation();
		
		System.exit(0);
	}

}
