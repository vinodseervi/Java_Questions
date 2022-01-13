package Recursion_1;
import java.util.Scanner;

public class SumOfNaturalNumber {
	
	public static int sum(int n) {
		if(n == 1) {
			return 1;
		}
		int smallsum = sum(n-1);
		return n+smallsum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = s.nextInt();
		int ans = sum(n);
		System.out.println(ans);
		

	}

}
