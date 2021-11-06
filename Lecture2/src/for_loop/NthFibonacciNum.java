package for_loop;
import java.util.Scanner;
public class NthFibonacciNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int n1 = 1;
		int n2 = 1;
		//int nth ;
		if(n == 1 || n == 2) {
			System.out.println("1");
		}
		else {
			int temp=1;
			for(int i =3; i<=n; i++) {
				 temp = n1 + n2;
				n1 = n2;
				n2 = temp;
			}
			System.out.println(temp);
		}

	}

}
