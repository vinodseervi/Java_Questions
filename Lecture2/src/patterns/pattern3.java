package patterns;

import java.util.Scanner;
//n=5
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 

public class pattern3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int num = 1;
		int i = 1;
		while(i<=n) {
			int space=1;
			while(space <= n - i) {
				System.out.print("  ");
				space++;
			}
			int j = 1;
			while(j<=i) {
				System.out.print(num+" ");
				j++;
				num++;
			}
			System.out.println();
			i++;
		}
		

	}

}
