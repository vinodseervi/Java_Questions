package Recursion_1;

public class PrintNumber {
	
	public static void printNum(int n) {
		if(n == 1) {
			System.out.print(n + " ");
			return;
		}

		printNum(n-1);
		System.out.print(n + " ");
			
	}

	public static void main(String[] args) {
		int n =5;
	   printNum(n);

	}

}
