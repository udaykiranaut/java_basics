package Inheritance;

public class ChildClass1 extends BaseClass{

	public static void main(String[] args) {
		BaseClass bobj = new BaseClass();
		bobj.add();
		bobj.sub();
		//bobj.mul();
	}
	public void mul() {
		System.out.println("The is Chlid class Multipication Block");
	}
	public void div() {
		System.out.println("This is child class division Block");
	}
	}
