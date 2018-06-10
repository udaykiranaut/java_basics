package conditionalStatements;

public class IfElseDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Test Started");
		
		String browser = "Chrome";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("If -----Block");
			System.out.println("TC executed on chrome");
		}
		else {
			System.out.println("Else-----Block");
			System.out.println("TC executed on firefox");
		}
		System.out.println("End of Test");
	}

}
