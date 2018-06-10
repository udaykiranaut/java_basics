package nameLessObject;

public class NameLess2
{	int a;
	NameLess2()
	{	a=10;
		System.out.println("This is default programmer constructor " +"--value of a is --" +a);
		
	}
	NameLess2 increment()
	{
		a=a+10;
		System.out.println("value of a after increment " +a);
		return this;
	}
	void display()
	{	System.out.println("dispaly method");
		System.out.println("NameLess2()");
		System.out.println("increment()");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("executation of nameless object");
		new NameLess2().increment().display();
	

	}

}
