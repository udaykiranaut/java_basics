package constructor;

public class Obj
{
	int a ,b,c;
	
	Obj()
	{
		a=1;
		b=2;
		c=3;
		System.out.println("The value of a is " +a);
		System.out.println("The value of b is " +b);	
		System.out.println("The value of c is " +c);
	}
	
	Obj(int x)
	{
		a=x;
		System.out.println("Single The value of a is " +a);
		
	}
	
	Obj(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("Double The value of a is " +a);
		System.out.println("Double The value of b is " +b);
	}
	
	Obj(Obj e)
	{
		a=e.a;
		b=e.b;
		System.out.println("Object1 The value of a is " +a);
		System.out.println("Object1 The value of b is " +b);
		
	}
	Obj(Obj g , Obj h ,Obj i,Obj j)
	{
		a=g.a;
		b=g.b;
		c=g.c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("=============");
		a=h.a;
		b=h.b;
		c=h.c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("=============");
		a=i.a;
		b=i.b;
		c=i.c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("=============");
		a=j.a;
		b=j.b;
		c=j.c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("=============");
	}
	public static void main(String[] args) 
	{
		Obj dc = new Obj();
		System.out.println(dc);
		Obj p1 = new Obj(2);
		Obj p2 = new Obj(10,20);
		Obj p22 = new Obj(100,200);
		Obj o2 = new Obj(p2);
		Obj o3 = new Obj(dc,p1,p2,p22);	
	}
}
