package Recursion_1;
import java.util.Scanner;

   

public class Factorial {
	
	public static int fact(int n){
		   if(n == 0) {
			   return 1;
		   }
		   int smallans = fact(n-1);
		   return n*smallans;
	   }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = s.nextInt();
		int ans = fact(n);
		System.out.println(ans);
		
	}		

	}


