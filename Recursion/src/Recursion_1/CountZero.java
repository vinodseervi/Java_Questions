package Recursion_1;
import java.util.Scanner;

public class CountZero {
	static int finalcount = 0;
	public static int countZero(int n) {
		if(n == 0) {
			return 1;
		}

		if(n%10 == 0) {
			finalcount++;
		}
		int count = countZero(n/10);
	     
		return finalcount;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(countZero(n));

	}

}
