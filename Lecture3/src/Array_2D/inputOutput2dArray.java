package Array_2D;
import java.util.Scanner;
public class inputOutput2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = s.nextInt();
		System.out.println("Enter number if cols");
		int cols = s.nextInt();
		int input[][] = new int[rows][cols];
		for(int  i = 0; i < rows; i++) {
			for(int j = 0; j< cols; j++) {
				System.out.println("Enter element at" +i+" row " +j+ "colom");
				input[i][j] = s.nextInt();
			}
		}
		
		for(int  i = 0; i < rows; i++) {
			for(int j = 0; j< cols; j++) {

				System.out.print(input[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		

	}

}
