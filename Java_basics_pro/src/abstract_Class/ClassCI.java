package abstract_Class;

public class ClassCI extends ClassC2
{

	public static void main(String[] args) 
	{
		ClassC1 o1 =  new ClassCI();
	    o1.f1();
	    ClassC1 o2 = new ClassC2();
	    o2.f1();
	    ClassC2 o3 = new ClassCI();
	    o3.f1();
	

	}

}
