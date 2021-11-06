package for_loop;
import java.util.Scanner;
public class SumOfProducat {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c = s.nextInt();
		int sum = 0;
		int multisum = 1;
			for(int i=1; i<=n; i++) {
				sum += i;
				multisum *= i;
			}
			if(c ==1) {
				System.out.println(sum);
		    }
			else if(c == 2) {
				System.out.println(multisum);
			}
			else {
				System.out.println("-1");
			}
			

	}

}
