package InterfaceDemo;

public class AdvancedCal2 implements InterfaceCal{

	public static void main(String[] args) {
      // you canot create object for interface
		//InerfaceCal obj = new InterfaceCal();
// you canot craete object of interface because it has abstract method		
		//AdnacedCal2 obj1 = new InterfaceCal();
      AdvancedCal2 obj1 = new AdvancedCal2();
      obj1.add();
      obj1.sub();
      obj1.calculateCos();
      obj1.calculateSin();
      InterfaceCal obj2 = new AdvancedCal2();
      obj2.add();
      obj2.sub();
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
