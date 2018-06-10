package inheritance;

public class Class_IBC_1 extends Class_Bc
{
	int b,c;
	void sum(int x,int y)
	{
		super.a=x;
		b=y;
		c= a+b;
		System.out.println("The Sum of two values is  " +c);
		
	}

}
