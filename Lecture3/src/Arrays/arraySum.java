package Arrays;
import java.util.Scanner;
public class arraySum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
       
        
        for(int j =1; j<= t; j++){
            int size = s.nextInt();
            int[] input = new int[size];
               for(int i =0; i<size; i++){
                    input[i] = s.nextInt();
               }
           
            
            
            
            int sum = 0;
               for(int i = 0; i<size; i++){
                   sum += input[i];
               }
            System.out.println(sum);
          
        }
        
     
	}

}
