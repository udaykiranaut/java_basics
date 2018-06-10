package interfaces;

public class C1 implements Int1 ,Int2
{
	public void f1()
	{
		System.out.println("F1 over rides in c1");
	}
	public void f2()
	{
		System.out.println(" F2 over rides in c1");
	}
	void f3()
	{
		System.out.println("F3 is orginal method in c1");
	}
	public static void main(String[] args) 
	{
	System.out.println("With repect to direct objject creation");
	C1 do1 = new C1();
			do1.f1();
			do1.f2();
			do1.f3();
	System.out.println("With repect ot Int1 -- indirect object creation");
		Int1 i1 = new C1();
		i1.f1();
		//i1.f2();//invalid
		//i1.f3();//invalid
	System.out.println("With respect to Int2 -- indirect object creation");
	Int2 i2 = new C1();
	//i2.f1();//invalid
	i2.f2();//valid
	//i2.f3();//invalid
		
	}

}
