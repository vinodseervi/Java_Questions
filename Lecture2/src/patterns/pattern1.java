package patterns;
import java.util.Scanner;
public class pattern1 {

//	n=5
//	1 
//	2 2 
//	3 3 3 
//	4 4 4 4 
//	5 5 5 5 5
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(i+ " ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
