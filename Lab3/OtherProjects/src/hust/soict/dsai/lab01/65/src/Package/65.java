package Package;
import java.util.*;

public class ex65 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		List<Integer> a = new ArrayList<>();
		int sum = 0;
		
		System.out.print("n: ");
		int n = keyboard.nextInt();
		
		System.out.print("a: ");
		
		for (int i = 0; i < n; ++i) 
			a.add(keyboard.nextInt());
		
		a.sort(null);
		
		for (int val : a) {
			System.out.print(val + " ");
			sum += val;
		}		
		
		System.out.println();		
		System.out.println("sum: " + sum);
		System.out.println("average: " + (double) sum / n);
		
		keyboard.close();
	}
}
