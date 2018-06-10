package scanner;

import java.util.Scanner;

public class Student_Details {

	public static void main(String[] args)
	{
	 int sno;
	 String student_name , college_name;
	 float  testing,java,automation,total;
	 Scanner s = new Scanner(System.in);
	 System.out.println("please enter the student number");
	 sno = s.nextInt();
	 System.out.println("please enter the student name");
	 student_name = s.next();
	 System.out.println("please enter the student marks in 3 subjects -- each subject marks shoukd not be more than 100 ");
	 System.out.println("Testing for 100 marks");
	 testing = s.nextFloat();
	 System.out.println("Java for 100 marks");
	 java = s.nextFloat();
	 System.out.println("automation for 100 marks");
	 automation = s.nextFloat();
	 
	 total = testing+java+automation;
	
	 System.out.println("please enter the student college name");
	 college_name = s.next();
	 System.out.println("The student details are");
	 System.out.println("The student number is " +sno);
	 System.out.println("The student name is " +student_name);
	 System.out.println("The student college name is " +college_name);
	 System.out.println("The student marks in Testing " +testing);
	 System.out.println("The student marks in Testing " +java);
	 System.out.println("The student marks in Testing " +automation);
	 System.out.println("The total marks  for 300 are" +total);
	 System.out.println("The grade of the student is ");
	 if(total>250)
	 {
		 System.out.println("The Grade is ---A---" );
	 }else if(total>=200&total<=249)
	 {
		 System.out.println("The Grade is ---B---" ); 
	 }else if(total>=150&total<=199)
	 {
		 System.out.println("The Grade is ---C---" ); 
	 }else if(total>=100&total<=149)
	 {
		 System.out.println("The Grade is ---D---" ); 
	 }else if(total>=0&total<=99)
	 {
		 System.out.println("The Grade is ---F---" ); 
	 }
	 System.out.println("GRADES INDICATES");
	 System.out.println(" A  Distinction ");
	 System.out.println(" B  First  Class");
	 System.out.println(" C  Second Class");
	 System.out.println(" D  Third  Class");
	 System.out.println(" F  Fail        "); 

	}

}
