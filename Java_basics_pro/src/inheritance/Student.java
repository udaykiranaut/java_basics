package inheritance;

public class Student extends College 
{	
	int Student_Id;
	String Student_Name,Student_Course;
	void getStudentDetails()
	{
		System.out.println("Please enter Student Details i.e his Id,Name,Course");
		Student_Id      = s.nextInt();
		Student_Name    = s.next();
		Student_Course  =s.next();
	}
	
	void display()
	{
		System.out.println("The Univesity Name is      " +University_Name);
		System.out.println("The University Location is " +University_location);
		System.out.println("The College Name is        " +College_Name);
		System.out.println("the College Location is    " +College_Location);
		System.out.println("The Student Id is          " +Student_Id);
		System.out.println("The Student Name is        " +Student_Name);
		System.out.println("The Student Course is      " +Student_Course);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.getUniversityDetails();
		s1.getCollegeDetails();
		s1.getStudentDetails();
		s1.display();
	

	}

}
