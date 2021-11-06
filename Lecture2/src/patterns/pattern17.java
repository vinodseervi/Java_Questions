package patterns;
import java.util.Scanner;
public class pattern17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		while(i<=n) {
			int space = 1;
			while(space<=n-i) {
				System.out.print(" ");
				space++;
			}
			int p = 1;
			int j = 1;
			while(j<=i) {
				System.out.print(p);
				j++;
				p++;
			}
			p = i-1;
			int k = 1;
			while(k<=i-1) {
				System.out.print(p);
				k++;
				p--;
			}

			
			System.out.println();
			i++;
		}

	}

}
