package Recursion_1;
import java.util.Scanner;

public class CalculatePower {
	
	public static int calPower(int x, int n) {
		if(n == 1)
			return x*n;
		
		int smallPower = calPower(x,n-1);
		return x*smallPower;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter x and n : ");
		int x = s.nextInt();
		int n = s.nextInt();
		System.out.println(calPower(x,n));

	}

}
