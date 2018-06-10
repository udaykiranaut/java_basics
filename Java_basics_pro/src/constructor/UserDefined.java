package constructor;
public class UserDefined 
{
	int a,b;
	UserDefined()
	{
		a=100;
		b=200;
		System.out.println("The value of a " +a);
		System.out.println("The value of a " +b);	
	}
	public static void main(String[] args)
	{
		UserDefined sd1 = new UserDefined();
		UserDefined sd2 = new UserDefined();
		UserDefined sd3 = new UserDefined();
	}
}
