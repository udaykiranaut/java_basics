package methodsDemo;

public class OverLoadedMethod 
{
	int add(int x,int y)
	{
		int c= x+y;
		System.out.println("The addition of two values is --" +c);
		return c;
	}
	float add(float a ,float b ,float c)
	{
		float d = a+b;
		System.out.println("The addition of three values -- " +d);
		return d;
	}
	String add(String a ,String b)
	{
		String c = a+b;
		System.out.println("The value of Strings after combining -- " +c);
		return c;
	}
	double add(float a, int b ,double c)
	{
		double d = a+b+c;
		System.out.println("The addition of three values -- " +d);
		return d;
	}

	public static void main(String[] args) 
	{
		OverLoadedMethod om1 = new OverLoadedMethod();
		om1.add(2, 4);
		om1.add(12.2f, 22.11f, 33.22f);
		om1.add("India", "Delhi");
		om1.add(10.21f, 22, 32.3232);

	}

}
