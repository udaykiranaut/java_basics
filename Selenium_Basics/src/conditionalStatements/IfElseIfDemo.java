package conditionalStatements;

public class IfElseIfDemo {

	public static void main(String[] args) {
		String browser="Chrome";
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("TC executed from Chrome");
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.out.println("TC executed from FireFox");
		}
		else if (browser.equalsIgnoreCase("IE")) {
			System.out.println("TC is executed from IE");
		}
		else {
			System.out.println("please enter a valid browser name");
		}
		

	}

}
