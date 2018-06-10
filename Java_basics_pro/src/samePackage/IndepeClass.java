package samePackage;

public class IndepeClass 
{

	BaseClass bc = new BaseClass();
	public void sIND()
	{
		//System.out.println("IND priv "+bc.a); cannot access private features
		System.out.println("IND def "+bc.b);
		System.out.println("IND pro "+bc.c);
		System.out.println("IND public "+bc.d);
	}

}
