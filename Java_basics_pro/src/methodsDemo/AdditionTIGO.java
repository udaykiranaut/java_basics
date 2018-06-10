package methodsDemo;

public class AdditionTIGO 
{
	
	int add2(int a ,int b)
	{
		int c =a+b;
		System.out.println("The addition value is ---" +c);
		return c;
	}
	
	public static void main(String[] args) 
	{	
		AdditionTIGO a1 = new AdditionTIGO();
		a1.add2(10, 20);
		
	}

}
