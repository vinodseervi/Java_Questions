package Recursion_1;
import java.util.Scanner;

public class CheckNumberInArray {
	
	public static boolean checkNum(int arr[], int n, int x) {
			if(n -1 <0)  
				return false;
	    if(arr[n-1] == x)
	    	return true;
		
		 
		 return false || checkNum(arr,n-1, x);
		
	}
		
		

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] arr = new int[n];
		for(int i =0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNum(arr,n-1,x));

	}

}
