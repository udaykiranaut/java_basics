package Inheritance;

public class ChildClass extends BaseClass{

	public static void main(String[] args)
	{
	ChildClass cobj = new ChildClass();
	cobj.add();
	cobj.sub();
	cobj.mul();
	cobj.div();
	}
	public void mul() {
		System.out.println("The is Chlid class Multipication Block");
	}
	public void div() {
		System.out.println("This is child class division Block");
	}

}
