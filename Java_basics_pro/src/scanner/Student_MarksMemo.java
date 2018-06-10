package scanner;

import java.util.Scanner;

public class Student_MarksMemo {

	public static void main(String[] args)
	{
	 int sno;
	 String student_name , college_name;
	 float  student_marks;
	 Scanner s = new Scanner(System.in);
	 System.out.println("please enter the student number");
	 sno = s.nextInt();
	 System.out.println("please enter the student name");
	 student_name = s.next();
	 System.out.println("please enter the student marks");
	 student_marks = s.nextFloat();
	 System.out.println("please enter the student college name");
	 college_name = s.next();
	 System.out.println("The student number is " +sno);
	 System.out.println("-----------------------------");
	 System.out.println("The student name is " +student_name);
	 System.out.println("-----------------------------");
	 System.out.println("The student marks are " +student_marks);
	 System.out.println("-----------------------------");
	 System.out.println("The student college name is " +college_name);
	 System.out.println("-----------------------------");
	 
	 
	 
	 
	 
	 
	 
	 
	 

	}

}
