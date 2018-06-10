package samePackage;

public class SamePackageDemo 
{

	public static void main(String[] args) 
	{
		samePackage.BaseClass sbc = new samePackage.BaseClass();
		sbc.sBC();
		System.out.println("--------------------");
		samePackage.DerivedClass sdc = new samePackage.DerivedClass();
		sdc.sDC();
		System.out.println("--------------------");
		samePackage.IndepeClass sind = new samePackage.IndepeClass();
		sind.sIND();
		System.out.println("--------------------");
		otherPackage.OPderived_class odc = new otherPackage.OPderived_class();
		odc.oPDC();
		System.out.println("--------------------");
		otherPackage.OPIndClass opi = new otherPackage.OPIndClass();
		opi.opInd();
		

	}

}
