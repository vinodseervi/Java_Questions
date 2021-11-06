package Assignmnet;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int n = s.nextInt();
		int result = 1;
		int j =1;
		while(j<=n) {
			result = result * x;
			j++;
		}
		System.out.println(result);

	}

}
