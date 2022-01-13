package Recursion_1;
import java.util.Scanner;

public class Multiplication {
	public static int multiplyTwoIntegers(int m, int n){
		if(m ==0 || n == 0)
            return 0;
        
          int ans = multiplyTwoIntegers(m, n-1);
         return  m +ans;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println(multiplyTwoIntegers(m, n));

	}

}
