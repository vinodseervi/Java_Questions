package Recursion_1;
import java.util.Scanner;

public class SumOfArray {
	
	public static int sumOfArr(int arr[], int n) {
		if(n == -1) {
			return 0;
		}
		
	    int ss = sumOfArr(arr,n-1);
	    		return arr[n] + ss;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(sumOfArr(arr, n-1));
		

	}

}
 