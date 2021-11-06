package Assignmnet;

import java.util.Scanner;
import java.lang.Math;

  // Total salary

public class TotalSalary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int basic = s.nextInt();
		char ch = s.next().charAt(0);
		
		double hra = basic*0.2;
		double da = basic*0.5;
		double pf = basic*0.11;
		int allow;
		
		if(ch == 'A') {
			 allow = 1700;
		}
		else if(ch == 'B') {
			allow = 1500;
		}
		else {
			allow =1300;
		}
		
		double TotalSalary = (basic + hra + da + allow )- pf;
		
		System.out.println(Math.round(TotalSalary));

	}

}
