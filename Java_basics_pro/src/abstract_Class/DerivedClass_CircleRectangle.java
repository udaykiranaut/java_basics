package abstract_Class;

public class DerivedClass_CircleRectangle
{

	public static void main(String[] args) 
	{
		System.out.println("With Respect To Circle");
		Figure fo = new Circle();
		fo.area();
		System.out.println("With Respect To Rrectangle");
				fo = new Rectangle();
				fo.area();
	

	}

}
