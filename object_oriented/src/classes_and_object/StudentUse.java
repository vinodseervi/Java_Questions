package classes_and_object;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      Student s1 = new Student();
      Student s2 = new Student();
      s1.name = "vinod";
      s1.setRollNumber(111);
      s2.name = "ankit";
      s2.setRollNumber(112);
      
      System.out.println(s1.name);
      System.out.println(s1.getRollNumber());
      System.out.println(s2.name);
      System.out.println(s2.getRollNumber());
      
	}

}
