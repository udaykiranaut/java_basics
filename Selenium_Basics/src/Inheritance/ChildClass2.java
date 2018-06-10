package Inheritance;

public class ChildClass2 extends BaseClass{

	public static void main(String[] args)
	{
	BaseClass cobj = new ChildClass2();
	/*base class reference and child class object
	ChildClass2 cobj = new BaseClass();
	child class reference and base class object - not possible
	*/cobj.add();
	cobj.sub();
	//obj.mul();
	//cobj.div();
	}
	public void mul() {
		System.out.println("The is Chlid class Multipication Block");
	}
	public void div() {
		System.out.println("This is child class division Block");
	}

}
