package for_loop;
import java.util.Scanner;
public class ReverseOfANumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        
        while(n!=0){
            int temp = n%10;
            System.out.print(temp);
            n=n/10;
            
        }

	}

}
