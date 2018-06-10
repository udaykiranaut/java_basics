package superRule1234;

public class DC2 extends BC2
{
	int b;
	DC2(int a ,int b)
	{
		super(a);
		System.out.println("This is from DC2 parameterized constructor");
		this.b=b;
		System.out.println("values of DC2 is " +this.b);
	}

}
