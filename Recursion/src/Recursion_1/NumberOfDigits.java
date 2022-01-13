package Recursion_1;

public class NumberOfDigits {
	static int count = 1;
	public static int NumOfD(int n) {
		
		if(n == 0)
			return 0;
		int sm = NumOfD(n/10);
		return sm+1;
		
		
	}

	public static void main(String[] args) {
		int n =12345235;
		System.out.print(NumOfD(n));

	}

}
