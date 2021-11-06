package patterns;
import java.util.Scanner;
public class pattern18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int  i = 1;
		while(i<=n) {
			int space = 1;
			while(space<=n-i) {
				System.out.print(" ");
				space++;
			}
			int j = 1;
			while(j<=i) {
				System.out.print(i+j-1);
				j++;
				

			}
			
			j=j-1;
			int k = (2*i)-2;
			while(j>1) {
				System.out.print(k);
				j--;
				k--;
				}
			
			
			System.out.println();
			i++;
			
		}

	}

}
