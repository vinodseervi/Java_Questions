package for_loop;
import java.util.Scanner;
public class SumTillN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		for(int i =1; i<=n; i++) {
			sum+=i;
		}
		System.out.println(sum);

	}

}
