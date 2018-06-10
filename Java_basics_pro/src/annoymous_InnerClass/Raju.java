package annoymous_InnerClass;

public class Raju implements Banking 
{
	public void open()
	{
		System.out.println("customer opened an account");
		
	}
	public void deposit()
	{
		System.out.println("customer deposited 5000");
	}
	public void withDraw()
	{
		System.out.println("Customer withdraw 1000");
	}
	public void loan()
	{
		System.out.println("customer taken lone of 10000");
	}

}
