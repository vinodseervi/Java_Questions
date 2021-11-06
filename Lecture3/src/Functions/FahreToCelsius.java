package Functions;
import java.util.Scanner;
public class FahreToCelsius {
	
	public static void FahreToCelsius(int s, int e, int w) {
		// (32°F − 32) × 5/9
		while(s <= e) {
			int cel = ((s-32)*5)/9;
			System.out.println(s + " " + cel);
			s+=w;
		}
		
	}

	public static void main(String[] args) {
		Scanner se = new Scanner(System.in);
		int s = se.nextInt();
		int e = se.nextInt();
		int w = se.nextInt();
		
		
		FahreToCelsius(s, e, w);
		

	}

}
