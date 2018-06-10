package class_Object;

import java.util.Scanner;

public class StudentData 
{
	int sno;
	String sname;
	float m1,m2,m3,total;
	void getStudentData()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter student number");
		sno=s.nextInt();
		System.out.println("please enter student name");
		sname = s.next();
		System.out.println("please enter student marks");
		m1=s.nextFloat();
		m2=s.nextFloat();
		m3=s.nextFloat();
		s.close();
		
	}
	void studentDisp()
	{
		total = m1+m2+m3;
		System.out.println("The student number is " +sno);
		System.out.println("The stdudent name is " +sname);
		System.out.println("The student total marks are " +total);
		
	}

	public static void main(String[] args) 
	{
		StudentData s1 = new StudentData();
		s1.getStudentData();
		s1.studentDisp();

	}

}
