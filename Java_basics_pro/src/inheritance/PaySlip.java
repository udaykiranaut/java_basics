package inheritance;

public class PaySlip extends Employee
{
	
	
	void employeeDetails()
	{
		System.out.println("Please Enter Employee Number and Name");
		Employee_No = s.nextInt();
		Employee_Name = s.next();
	}
	void employeeDisp()
	{
		System.out.println("The Employee Number is " +Employee_No);
		System.out.println("The Employee Name is " +Employee_Name);
		
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Please Enter Employee Status i.e" +" 1 for Permanent "  +" or " +" 0 for Contract ");
		Status = s.nextInt();
		PaySlip ps = new PaySlip();
		ps.getCompanyDetails();
		ps.employeeDetails();
		ps.dispCompany();
		ps.employeeDisp();
		ps.salary();
		
		
		
	}

}
