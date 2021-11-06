package for_loop;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int placeValue = 1;
		int ans = 0;
		
		while(n != 0 ) {
			int temp = n%2;
			ans = ans + temp*placeValue;
			placeValue *= 10;
			n = n/2;
		}
		System.out.println(ans);
		

	}

}
