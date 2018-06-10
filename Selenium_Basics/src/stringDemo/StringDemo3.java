package stringDemo;

public class StringDemo3 {

	public static void main(String[] args) {
		String actuals="welcome to selenium";
		String expected="selenium";
		boolean status=actuals.contains(expected);
		System.out.println("status is "+status);

	}

}
