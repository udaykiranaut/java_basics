package interfaces;

public class C3 extends C2ADC
{
	public void f1()
	{
		System.out.println("from int f1");
	}
	public void f2()
	{
		System.out.println("from int f2");
	}
	public void f3()
	{
		System.out.println("from acc f3");
	}
	void f4()
	{
		System.out.println("from ADC f4");
	}
	void f5()
	{
		System.out.println("f5 This is orginally from C3");
	}

	public static void main(String[] args) 
	{
		System.out.println("WRTDC DOC");
		C3 d1 = new C3();
		d1.f1();
		d1.f2();
		d1.f3();
		d1.f4();
		d1.f5();
		System.out.println("WRT Ib1");
		Ib1 ad = new C3();
		ad.f1();
		System.out.println("WRTC Id1");
		Id1 ad2 = new C3();
		ad2.f1();
		ad2.f2();
		System.out.println(" WRTC acc");
		acc ac1 = new C3();
		ac1.f3();
		System.out.println("WRTC C2ADC");
		C2ADC ca = new C3();
		ca.f1();
		ca.f2();
		ca.f3();
		ca.f4();
		
	

	}

}
