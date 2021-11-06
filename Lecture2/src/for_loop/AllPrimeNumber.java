package for_loop;
import java.util.Scanner;
public class AllPrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		for(int n =2; n<=p; n++) {
		boolean divided = false;
		for(int i = 2; i<n; i++) {
			if(n % i == 0) {
				divided = true;
			}
		}
		if(divided == false) {
			System.out.println(n);
		}
		
		
		}

	}
}
