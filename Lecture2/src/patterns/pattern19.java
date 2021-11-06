package patterns;
import java.util.Scanner;
public class pattern19 {

	public static void main(String[] args) {
		
		  Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int i = 1;
	        while(i<= n/2+1){
	            int space = 1;
	            while(space <= (n/2+1)-i){
	                System.out.print(" ");
	                space++;
	            }
	            int j = 1;
	            while(j<=2*i-1){
	                System.out.print("*");
	                j++;
	            }
	            
	            System.out.println();
	            i++;
	        }
	       i= (n/2+1)-1;
	        while(i>=1) {
	        	int space =1;
	        	while(space <= (n/2+1)-i) {
	        		System.out.print(" ");
	        		space++;
	        	}
	        	int j = 1;
	        	while(j<= 2*i-1) {
	        		System.out.print("*");
	        		j++;
	        	}
	        	System.out.println();
	        	i--;
	        }
	

	}

}
