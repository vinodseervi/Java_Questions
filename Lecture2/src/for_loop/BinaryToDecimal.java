package for_loop;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int placeValue = 1;
		int ans = 0;
		
	  
	    while(n != 0) {
	    	int temp = n%10;
	    	ans = ans + placeValue * temp;
	    	 
	    	n = n/10;
	    	placeValue += placeValue; 

	}
	    System.out.println(ans);

}
}
