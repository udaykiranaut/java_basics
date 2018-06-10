package InterfaceDemo;

public class AdvancedCal implements InterfaceCal{

	public static void main(String[] args) {
		AdvancedCal obj=new AdvancedCal() ;
		obj.calculateCos();
		obj.calculateSin();
		obj.add();
		obj.sub();
	
	}	
	public void calculateCos()
	{
		System.out.println("this method is from calculateCos");
	}
	public void calculateSin()
	{
		System.out.println("This method is from calculateSin");
	}

	@Override
	public void add() {
		System.out.println("This method is from add");
		
	}

	@Override
	public void sub() {
		System.out.println("This method is from sub");
		
	}

}
