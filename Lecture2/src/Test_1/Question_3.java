package Test_1;
import java.util.*;
public class Question_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int orgNum = n;
	   int num = 0;
	   int  SumOfSquar = 0;
	  //to get total digits
	   while(n != 0 ) {
		   num++;
		   n = n/10;
	   }
	    n=orgNum;
	    while(n != 0) {
	    	//get power of num and sum it
	    	int temp = n%10;
	    	SumOfSquar += (int)Math.pow(temp, num);
	    	
	    	
	    	n/=10;
	    }
	 
	   
	   if(orgNum == SumOfSquar) {
		   System.out.println("true");
	   }
	   else {
		   System.out.println("false");
	   }
		

	}

}
