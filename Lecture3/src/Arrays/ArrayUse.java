package Arrays;
import java.util.Scanner;
public class ArrayUse {
	
	    public static int largestInArray(int input[]) {
	    	int max = Integer.MIN_VALUE;
	    	for(int i = 0; i<input.length; i++) {
	    		if(input[i] > max) {
	    			max = input[i];
	    		}
	    	}
	    	return max;
	    }
	  
		public static int[] takeInput() {
			Scanner s = new Scanner(System.in);
			int size = s.nextInt();
			int input[] = new int[size];
			
			for(int i = 0; i<size; i++) {
				input[i] = s.nextInt();
			}
			return input;
		}
		
		public static void print(int input[]) {
			int size = input.length;
			for(int i = 0; i<size; i++) {
				System.out.print(input[i] + " ");
			}
			System.out.println();
		}
		
		public static void swapAlternate(int arr[]) {
	    	//Your code goes here
	        for(int i =0; i<arr.length-1; i = i+2){
	            int temp = arr[i];
	            arr[i] = arr[i+1];
	            arr[i+1] = temp;
	            }

	        }
		
		public class Solution {  

		    public static void rotate(int[] arr, int d) {
		    	//Your code goes here
		        // int i = d;
		        // int k = 0;
		        // int[] arr1 = new int[arr.length];
		        // for(; i< arr.length; i++){
		        //     arr1[k] = arr[i];
		        //     k++;
		        // }
		        // for(i =0;  i < d; i++){
		        //     arr1[k] = arr[i];
		        //     k++;
		        // }
		        // arr = arr1;
		        
		        while(d>0){
		            int i =0;
		            int temp = arr[i];
		            for( ; i< arr.length; i++){
		                arr[i] = arr[i+1];
		                
		            }
		            arr[i] = temp;
		            d--;
		        }
		        
		    }

		}
		
		public static int findUnique(int[] arr){
			//Your code goes here
	        for(int i =0; i<arr.length; i++){
	            int unique = 1;
	            for(int j =0; j<arr.length; j++){
	                if(i == j){ 
	                    continue;
	                }
	                if(arr[i] == arr[j]){
	                    unique++;
	                }
	                
	            
	            }
	            if(unique == 1){
	               return arr[i];
	               
	            }
	        
	        }
	        return -1;
	    }

	public static void main(String[] args) {
		int arr[]  = takeInput();
		//print(arr);
		//rotate(arr,2);
		print(arr);

	}

}
