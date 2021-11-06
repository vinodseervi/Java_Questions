package while_loop;

import java.util.Scanner;
public class FahreToCelsius {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		int s = p.nextInt();
		int e = p.nextInt();
		int w = p.nextInt();
		
        while(s<=e) {
        	int ss = (5*(s-32))/9;
        	System.out.println(s+ " "+ ss);
        	s=s+w;
        }
		

	}

}
