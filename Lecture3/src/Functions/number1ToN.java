package Functions;
import java.util.Scanner;

public class number1ToN {

	
	public static void printnum(int n) {
		for(int i =1; i<=n; i++) {
			System.out.println(i);
		}
		
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printnum(n);
		

	}
}
