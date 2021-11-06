package patterns;
import java.util.Scanner;
public class pattern12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		while(i<=n) {
			
			int j = 1;
            char ch = ((char)('A'+j-1));
			while(j<=n) {
				System.out.print(ch);
				j++;
				ch++;
				
			}
			System.out.println();
			i++;
		}

	}

}
