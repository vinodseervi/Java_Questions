package patterns;

import java.util.Scanner;
//n=5
//1
//23
//345
//4567
//56789

public class pattern4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		
		while(i<=n) {
			int j=1;
			int num = i;
			while(j<=i) {
				
				System.out.print(num);
				j++;
				num++;
			}
			System.out.println();
			i++;
			
		}

	}

}