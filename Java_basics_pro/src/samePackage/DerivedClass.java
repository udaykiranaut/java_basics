package samePackage;

public class DerivedClass extends BaseClass
{
	public void sDC()
	{
		//System.out.println("SDC pri "+a); cannot access 
		System.out.println("SDC de "+b);
		System.out.println("SDC pr"+c);
		System.out.println("SDC pub"+d);
	}

}
