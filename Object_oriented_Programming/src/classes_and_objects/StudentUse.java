package classes_and_objects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Student s1 = new Student("vinod", 55);
	//	System.out.println(s1);
//		s1.name = "vinod";
//		s1.setRollNumber(123);
		s1.print();
		
		Student s2 = new Student("arsgh",233);
	//	System.out.println(s2);
//		s2.name = "arsh";
//		s2.setRollNumber(124);
		
//		System.out.println(s1.numStudent);
//		System.out.println(s2.numStudent);
		System.out.println(Student.getnumStudent());
		
//		System.out.println("Nmae : "+ s1.name);
//		System.out.println("rollNumber : "+ s1.getRollNumber());
//		System.out.println(s2.name +" "+ s2.getRollNumber());
		s2.print();

	}

}
