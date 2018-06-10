package inheritance;

public class Employee extends Company
{
	int Employee_No;
	static int Status; 
	String Employee_Name;
	double Basic_Salary;
	
	
	void salary()
	{
		
		if(Status==1)
		{
			System.out.println("Please enter Basic salary amount");
			Basic_Salary =s.nextFloat();
			double da,ta,cca,ma,hra,pf,lic,net_sal;
			da=Basic_Salary*0.2;
			ta=Basic_Salary*0.1;
			cca=Basic_Salary*0.02;
			ma=Basic_Salary*0.1;
			hra=Basic_Salary*0.1;
			pf=Basic_Salary*0.05;
			lic=Basic_Salary*0.02;
			net_sal=(Basic_Salary+da+ta+cca+ma+hra)-(pf+lic);
			System.out.println("The Salary detals of Employee  " +Employee_Name +"    Whose Employee Status is Permenent");
			System.out.println("The Basic Salary is " +Basic_Salary);
			System.out.println("The da is  " +da);
			System.out.println("The ta  is " +ta);
			System.out.println("The cca  is " +cca);
			System.out.println("The ma  is " +ma);
			System.out.println("The hra  is " +hra);
			System.out.println("The pf  is " +pf);
			System.out.println("The ta  net_sal " +net_sal);
		}else if(Status==0)
		{
			 
			int working_day;
			float Total_Salary,Daily_Wage;
			System.out.println("Please Enter The Number of Working Days and daily salary");
			working_day  = s.nextInt();
			Daily_Wage   = s.nextFloat();
			Total_Salary = (working_day*Daily_Wage);
			System.out.println("The Salary Details are ");
			System.out.println("The Number of Working Days " +working_day );
			System.out.println("The daily wage is " +Daily_Wage);
			System.out.println("The Total Salary is " +Total_Salary);
			
		}	
	}
}
