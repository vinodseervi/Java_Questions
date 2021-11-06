package Searching_and_Sorting;

import java.util.Scanner;

public class SelectionSort {
	
	public static void selectionSort(int[] input) {
		for(int i =0; i<input.length-1; i++) {
			int min = input[i];
			int minIndex = i;
			for(int j= i+1; j<input.length; j++) {
				if(input[j] < min) {
					min = input[j];
					minIndex = j;
				}
			}
			if(minIndex != i) {
				input[minIndex] = input[i];
				input[i] =min;
			}
		}
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input =  takeInput();
		selectionSort(input);
		print(input);

	}

}
