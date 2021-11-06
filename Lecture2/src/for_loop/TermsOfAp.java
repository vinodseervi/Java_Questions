package for_loop;
import java.util.Scanner;
public class TermsOfAp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i =1;
		int equal = 1;
		while(equal <= n) {
			

			int temp = (3*i)+ 2;
			if( temp %4 == 0 ) {
			i++;
			
			continue;
			}
			System.out.print(temp + " ");
			i++;
			equal ++;
		}
		

	}
	

}
