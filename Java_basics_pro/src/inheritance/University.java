package inheritance;

import java.util.Scanner;

public class University
{
	String University_Name ,University_location;
	Scanner s = new Scanner(System.in);
	void getUniversityDetails()
	{
		System.out.println("Please enter Univesity details Name and Location" );
		University_Name      = s.next();
		University_location  = s.next();
	}

}
