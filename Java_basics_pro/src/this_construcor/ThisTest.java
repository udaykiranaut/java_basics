package this_construcor;

public class ThisTest 
{
	int a,b;
	ThisTest()
	{
		System.out.println("This is from default constructor");
		a=b=1;
		System.out.println("The value of a is " +a);
		System.out.println("The value of b is " +b);
	}
	ThisTest(int x)
	{
		this();
		System.out.println("The is from single parameterized constrictor");
		a=b=x;
		System.out.println("The value of a is " +a);
		System.out.println("The value of b is " +b);
	
	}
	ThisTest(int m,int n)
	{
		this(1000);
		System.out.println("This is from double parameterized constructor");
		a=m;
		b=n;
		System.out.println("The value of a is " +a);
		System.out.println("The value of b is " +b);	
	}
	public static void main(String[] args) 
	{
		ThisTest tt = new ThisTest(10,20);
	

	}

}
