package annoymous_InnerClass;

public class Interface7 
{

	public static void main(String[] args) 
		{
	System.out.println("WRTB IDOC Raju");
	Banking bo = new Raju();
	bo.open();
	bo.deposit();
	bo.withDraw();
	bo.loan();
	System.out.println("WRTB IDOC Sathya");
	//Banking bo1 = new Sathya();
	bo = new Sathya();
	bo.open();
	bo.deposit();
	bo.withDraw();
		}
}
