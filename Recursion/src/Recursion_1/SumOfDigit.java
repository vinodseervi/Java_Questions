package Recursion_1;
import java.util.Scanner;
public class SumOfDigit {
	static int count = 0;
	public static int sumDigit(int n) {
		if(n == 0) {
		    return 0;
			
		}
		count+= n%10;
		sumDigit(n/10);
		return count;
		
	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(sumDigit(n));

	}

}
