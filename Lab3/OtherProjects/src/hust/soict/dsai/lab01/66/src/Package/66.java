package Package;
import java.util.Scanner;

public class ex66 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("m: ");
		int m = keyboard.nextInt();
		System.out.print("n: ");
		int n = keyboard.nextInt();
		
		System.out.println("a: ");
		int[][] a = new int[m][n];
		for (int i = 0; i < m; ++i)
			for (int j = 0; j < n; ++j)
				a[i][j] = keyboard.nextInt();
		System.out.println("b: ");
		for (int i = 0; i < m; ++i)
			for (int j = 0; j < n; ++j)
				a[i][j] += keyboard.nextInt();
		
		keyboard.close();
		
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}

}
