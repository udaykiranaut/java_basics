package parameterDemo;

public class PassParameter {

	public static void main(String[] args) {
		PassParameter obj1 = new PassParameter();
		obj1.add(12, 13);
		obj1.sub(122, 34);

	}
	
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("the value of addition is " +c);
	}

	public void sub(double x ,double y) {
		double z = x-y;
		System.out.println("the value of sub is "+z);
	}
	
}
