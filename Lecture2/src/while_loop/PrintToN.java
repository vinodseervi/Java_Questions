package while_loop;
import java.util.Scanner;
public class PrintToN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i =1;
		while(i<=n) {
			System.out.print(i+" ");
			i+=1;
		}
		

	}

}
