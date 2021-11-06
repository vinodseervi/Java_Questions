package Searching_and_Sorting;
import java.util.Scanner;
public class bubbleSort {
	
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
	
	public static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = takeInput();
		bubbleSort(input);
		print(input);

	}

}
