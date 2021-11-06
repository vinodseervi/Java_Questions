package for_loop;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean divided = false;
		for(int i = 2; i<n; i++) {
			if(n % i == 0) {
				divided = true;
			}
		}
		if(divided) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}

	}

}
