package parameterDemo;

public class DynamicCalculator {
	
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}

	public double sub(double x ,double y) {
		double z = x-y;
		return z;
	}
	public static String getMyFullName(String first,String second) {
		String fullname = first+ "  " +second;
		return fullname;
	}

}
