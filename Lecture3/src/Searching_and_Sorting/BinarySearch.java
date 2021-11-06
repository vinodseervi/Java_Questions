package Searching_and_Sorting;

import java.util.Scanner;

public class BinarySearch {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int input[] = new int[size];
		
		for(int i = 0; i<size; i++) {
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static int search(int[] input ,int x) {
		int start = 0;
		int end = input.length-1;
		while(start <= end) {
			int mid = (start + end)/2;
			if(input[mid] == x) {
				return mid;
			}
			else if (x < input[mid]) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return -1;
	}
	
	public static void print(int input[]) {
		int size = input.length;
		for(int i = 0; i<size; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		Scanner s = new Scanner(System.in);
		int searchnum = s.nextInt();
		System.out.println("index is : " +search(input,searchnum));

	}

}
