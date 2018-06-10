package datatypeDemo;

public class Local_Global_VariableDemo1 
{
static int mynumber;//Global or class level
	public static void main(String[] args)
	{
		int a=78;//local or method level
		int b=0;//local or method level
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);
		System.out.println(mynumber);

	}

}
