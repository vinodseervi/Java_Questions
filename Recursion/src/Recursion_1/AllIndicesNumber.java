package Recursion_1;

import java.util.Scanner;

public class AllIndicesNumber {
	
	private static int[] allIndices(int arr[], int x, int startIndex) {
		if(startIndex  == arr.length -1) {
			return new int[0];
		}

		int arr1[] = allIndices(arr,x, startIndex+1);
         if(arr[0] == x) {
        	  int output[] = new int[arr1.length];
        	  output[0] = x;
        	  for(int i = 1; i<output.length; i++) {
        		  output[i] = arr1[i-1];
        	  }
        	  return output;
		}
         return arr1;
		

	}
	
	public static int[] allIndices(int arr[], int x) {
	
	return arr =  allIndices(arr,x,0);
	  
	}

	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		int x = s.nextInt();
		int lastoutput[] = allIndices(arr,x);
		for(int i =0; i<lastoutput.length; i++) {
			System.out.print(lastoutput[i] + " ");
		}

	}

}
