package Recursion_1;
import java.util.Scanner;

public class LastIndexNumber {
	
	private static int lastIndex(int arr[], int x, int n) {
		if(arr[n] == x) {
			return n;
		}
		
		if(n == 0) {
			return -1;
		}
		
		return lastIndex(arr,x,n-1);
	}
	
	public static int lastIndex(int arr[], int x) {
		return lastIndex(arr,x,arr.length-1);
	}

	public static void main(String[] args) {
		Scanner  s =new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<n; i++) {
		    arr[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(lastIndex(arr,x));

	}

}
