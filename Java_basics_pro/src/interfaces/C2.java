package interfaces;

public class C2 implements I2
{
	public void f1()
	{
		System.out.println( "f1 overridded in c1");
	}
	public void f2()
	{
		System.out.println("f2 overridden in c2");
	}
	void f3()
	{
		System.out.println("f3 This is orginal method from C3");
	}

	public static void main(String[] args) 
	{
		System.out.println("WRT derived DOC");
		C2 co = new C2();
		co.f1();
		co.f2();
		co.f3();
		System.out.println("WRT Interface I1 IDOC");
		I1 i1 = new C2();
		i1.f1();//valid
		//i1.f2();//invalid
		//i1.f3();//invalid
		System.out.println("WRT Interface I2 IDOC");
		I2 i2 = new C2();
		i2.f1();//valid
		i2.f2();//valid
		//i2.f3();//invalid
		
		
			

	}

}
