package Recursion_1;

public class CheckArraySorted {
	
	// first method
	public static boolean checkSorted(int arr[]) {
		if(arr.length <=1)
			return true;
		
		if(arr[0] >= arr[1])
			return false;
		
        int smallarr[] = new int[arr.length -1];
        for(int i =1; i<arr.length; i++) {
        	smallarr[i-1] = arr[i];
        }
        boolean smallans = checkSorted(smallarr);
        return smallans;
		
	}
	// second method 
	private  static boolean checkBettersorted(int arr[], int startIndex) {
		if(startIndex >= arr.length-1)
			return true;
		if(arr[startIndex] > arr[startIndex +1])
			return false;
		
		boolean smallans = checkBettersorted(arr, startIndex +1);
		return smallans;
	}
	public static boolean checkBettersorted(int arr[]) {
		return checkBettersorted(arr,0);
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		System.out.println(checkBettersorted(arr));

	}

}
