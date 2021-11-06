package Test_1;
import java.util.Scanner;
public class Question_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i= 1;
		while(i<=n) {
			int j = 1;
			while(j <= n) {
				if(j == i) {
					System.out.print("*");
					j++;
				}
				else {
					System.out.print("0");
					j++;
				}
			}
			
			System.out.print("*");
			
			
			int k =1;
			while(k <= n) {
				if(k == n-i+1) {
					System.out.print("*");
					k++;
				}
				else {
					System.out.print("0");
					k++;
				}
			}
			
			System.out.println();
			i++;
		}
		
		
		

	}

}
