package Assignmnet;
import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int even=0;
		int odd = 0;
		while(n!=0) {
			int rem = n%10;
			if(rem % 2 == 0) {
				even+=rem;
			}
			else {
				odd+=rem;
			}
			n=n/10;
		}
		System.out.println(even + " " + odd);

	}

}
