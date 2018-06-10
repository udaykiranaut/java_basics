package inheritance;

import java.util.Scanner;

public class Company 
{
	String Company_Name,Company_Location,Company_Type;
	static Scanner s = new Scanner(System.in);
	void getCompanyDetails()
	{
		System.out.println("Please Enter Company Details - Name,Location and Type");
		Company_Name = s.next();
		Company_Location = s.next();
		Company_Type = s.next();
	}
	void dispCompany()
	{
		System.out.println("The Company details are ");
		System.out.println("The Company Name is " +Company_Name);
		System.out.println("The Company Location is " +Company_Location);
		System.out.println("The Company Type is " +Company_Type);
	}

}
