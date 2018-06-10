package inheritance;

public class College extends University 
{
	String College_Name,College_Location;
	void getCollegeDetails()
	{
		System.out.println("Please enter College Name and Location");
		College_Name      = s.next();
		College_Location  = s.next();
	}
}
