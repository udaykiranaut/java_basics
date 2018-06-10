package parameterDemo;

public class PassParameter2 {

	public static void main(String[] args) {
		
		DynamicCalculator obj1 = new DynamicCalculator();
		int sum = obj1.add(121, 13);
		System.out.println(sum);
		double sub = obj1.sub(41, 31);
		System.out.println(sub);
		String fullname = DynamicCalculator.getMyFullName("uday", "kiran");
		System.out.println("The fullname is " + fullname);
	}
	
	
	
}
