package Recursion_1;

import java.util.Scanner;

public class palindrome {
	private static boolean StringPalindrome(char[] arr,int start, int end) {
		// Write your code here
		
		if(arr[start] != arr[end]) 
			return false;
		
		if(arr[start] >= arr[end])
			return true;
		
		
		boolean flag = StringPalindrome(arr, start+1, end -1);
		return flag;
	
		
		
	

	}
	public static boolean isStringPalindrome(String str) {
		char[] arr = new char[str.length()];
		
		return StringPalindrome(arr,0,arr.length-1);
		
	}
	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(isStringPalindrome(input));
	}
		
		
		

	}


