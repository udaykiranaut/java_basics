package nameLessObject;

public class NameLess1 
{
	NameLess1 disp()
	{
		System.out.println("Display method -- disp()");
		return this;
	}
	NameLess1 show()
	{
		System.out.println("Show method -- show()");
		return this;
		
	}
	void write()
	{
		System.out.println("This is write method wite()");
		
	}
	

	public static void main(String[] args) 
	{	
		//System.out.println("--With named object--");
		//NameLess1 o1 = new NameLess1();
		//o1.disp();
		//o1.show();
		//o1.write();
		//o1.disp().show().write();
		System.out.println("with name less object");
		new NameLess1().disp().show().disp();

	}

}
