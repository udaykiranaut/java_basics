package abstract_Class;

public class ClassIntop1 extends ClassAdAop
{
	int a,b,c;
	String st = "please enter any two values";
	void sum()
	{   
		System.out.println(st);
		a=s.nextInt();
		b=s.nextInt();
		c = a+b;
		System.out.println("The sum value is " +c);
	}
	void sub()
	{
		System.out.println(st);
	
		a=s.nextInt();
		b=s.nextInt();
		c = a-b;
		System.out.println("The sub value is " +c);
	}
	void mul()
	{
		System.out.println(st);

		a=s.nextInt();
		b=s.nextInt();
		c=a*b;
		System.out.println("The mul value is " +c);
	}
	void div()
	{
		System.out.println(st);

		a=s.nextInt();
		b=s.nextInt();
		c=a/b;
		System.out.println("The div value is " +c);
	}
	public static void main(String[] args)
	{
		
		System.out.println("With repect to implementation class");
		ClassIntop1 io = new ClassIntop1();
		io.sum();
		io.sub();
		io.mul();
		io.div();
		System.out.println("With respect to adaptor class");
		ClassAdAop ad = new ClassIntop1();
		ad.sum();
		ad.sub(); 
		System.out.println("with respect to adaptor class ");
	    ClassAop ap = new ClassIntop1();
		ap.mul();
		ap.div();
	}
}
