package for_loop;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int result = 0;
		int i = 1;
		while(i<=n) {
			int temp = i * i;
			if(temp <= n) {
				result++;
			}
			i++;
		}
		System.out.println(result);
		

	}

}
