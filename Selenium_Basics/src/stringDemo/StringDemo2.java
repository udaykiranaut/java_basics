package stringDemo;

public class StringDemo2 {

	public static void main(String[] args) {
		String actuals="welcome to selenuim web-driverworld";
		String expected="welcome to selenium world";
		boolean status=actuals.equals(expected);
		System.out.println("status is "+status);
		String actual1="WELCOME TO SELENIUM";
		String expected2="welcome to selenium";
		boolean status2=actual1.equalsIgnoreCase(expected2);
		System.out.println("status2 is "+status2);
		
		

	}

}
