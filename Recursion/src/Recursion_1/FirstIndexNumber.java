package Recursion_1;
import java.util.Scanner;
public class FirstIndexNumber {
	
	private static int firstIndex(int arr[], int x, int startIndex) {
		
		if(arr[startIndex] == x)
			return startIndex;
		if(startIndex == arr.length -1 )
			return -1;
		
		 return firstIndex(arr,x,startIndex + 1);
		
		
	}
	
	public static int firstIndex(int arr[],int x) {
		return firstIndex(arr,x,0);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(firstIndex(arr,x));
		

	}

}
