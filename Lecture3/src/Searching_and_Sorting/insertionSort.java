package Searching_and_Sorting;
import java.util.Scanner;
public class insertionSort {
	
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
	
	public static void insertionSort(int[] arr) {
		for(int i =1; i < arr.length; i++) {
			int j = i - 1;
			int temp = arr[i];
			while(j>=0 && arr[j] >temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = takeInput();
		insertionSort(input);
		print(input);

	}

}

