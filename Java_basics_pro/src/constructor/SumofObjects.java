package constructor;

public class SumofObjects 
{
	String a,b,c,sum_0f_strings;
	SumofObjects()
	{
		System.out.println("default constructor");
		a = "sample1";
		b = "sample2";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(sum_0f_strings);
	}
	
	SumofObjects(String x)
	{
		System.out.println("single parameterized");
		a = x;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(sum_0f_strings);
	}
	SumofObjects(String e ,String f)
	{
		System.out.println("double parameterized");
		a=e;
		b=f;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(sum_0f_strings);
	}
	SumofObjects(SumofObjects ss)
	{
		System.out.println("single object parameterized");
		sum_0f_strings = ss.a+ss.b;
		System.out.println("sum_0f_strings is " +"   "+ sum_0f_strings);
	}
	SumofObjects(SumofObjects k ,String l,String m)
	{
		System.out.println("triple parameterized -- object also");
		a=k.a+k.b;
		b=l;
		c=m;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	SumofObjects(SumofObjects k1, SumofObjects k2)
	{
		System.out.println("double object parameterized");
		System.out.println(k1.a+k1.b);
		sum_0f_strings = k2.a+" "+k2.b+"  "+k2.c;
		System.out.println(sum_0f_strings);
	}

	public static void main(String[] args)
	{
		SumofObjects d1 = new SumofObjects();
		SumofObjects s1 = new SumofObjects("browser");
		SumofObjects p2 = new SumofObjects("uday","kiran"); 
		SumofObjects p3 = new SumofObjects(p2);
		SumofObjects wish = new SumofObjects(p2,"NEWYORK","U.S.A");
		SumofObjects real = new SumofObjects(p2,wish);
	

	}

}
