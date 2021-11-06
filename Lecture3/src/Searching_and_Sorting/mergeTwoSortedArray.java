package Searching_and_Sorting;
import java.util.Scanner;
public class mergeTwoSortedArray {
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
	
	public static int[] merge(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		int k = 0;
		int ans[] = new int[arr1.length + arr2.length];
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			}
			else {
				ans[k] = arr2[j];
				k++;
				j++;
			}
		}
		while(i < arr1.length) {
			ans[k]=arr1[i];
			k++;
			i++;
		}
		while(j < arr2.length) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input1 = takeInput();
		int[] input2 = takeInput();
		int[] ans = merge(input1, input2);
		print(ans);

}
}
