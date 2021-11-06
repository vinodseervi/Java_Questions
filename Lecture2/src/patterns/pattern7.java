package patterns;
import java.util.Scanner;
public class pattern7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = s.nextInt();
		
		int i = 1;
		while(i<=n) {
			int j = 1;
			while(j<=n) {
				System.out.print("*" + " ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
