package methodsDemo;

public class AdditionNINO 
{
	int add2()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println("the additon value is " +c);
		return c;
	}

	public static void main(String[] args) 
	{
		AdditionNINO a2 = new AdditionNINO();
		a2.add2();
		

	}

}
