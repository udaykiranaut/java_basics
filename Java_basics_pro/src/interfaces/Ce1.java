package interfaces;

public class Ce1 extends C1
{
	public void f1()
	{
		System.out.println("f1 - Int1- overridden in ce1");
	}
	public void f2() {
		System.out.println("f2 - Int2- overridden in ce1");
	}
	void f3()
	{
		System.out.println("f3 -c1 - overridden in ce1 ");
	}
	

	public static void main(String[] args) 
	{
		Ce1 e1 = new Ce1();
		e1.f1();
		e1.f2();
		e1.f3();
	

	}

}
