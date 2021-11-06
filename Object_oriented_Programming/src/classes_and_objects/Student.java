package classes_and_objects;

public class Student {
	public String name;
	private final  int rollNumber;
	
	private static int numStudent;
//	
//	public Student(String n) {
//		name = n;
//	}
	
	public static  int getnumStudent() {
		return numStudent;
	}
//	
	public Student(String name, int rollNumber) {
	//	System.out.println(this);
		this.name = name;
		this.rollNumber = rollNumber;
		numStudent++;
	}
	
//	public void setRollNumber(int rn) {
//		if(rn <= 0) {
//			return;
//		}
//		rollNumber = rn;
//	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public void print() {
		System.out.println("name : "+ name+ "   Rollnumber : "+rollNumber);
	}

}
