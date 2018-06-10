package abstract_Class;

public class ArithImple extends ArithematicAbstract 
{
	int a,b,c;
	
	
	void sum()
	{
		System.out.println("Please enter any two values ");
		a=s1.nextInt();
		b=s1.nextInt();
		c=a+b;
	}
	void sub()
	{
		c=a-b;
	}
	void mul()
	{
		c=a*b;
	}
	void div()
	{
		c=a/b;
	}
	public static void main(String[] args)
	{
		ArithImple aa = new ArithImple();
		aa.sum();
		aa.sub();
		aa.mul();
		aa.div();
	}

}
