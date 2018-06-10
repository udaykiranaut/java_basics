package conditionalStatements;

public class SwitchDemo {

	public static void main(String[] args) {
		int x = 5;
		switch(x)
		{
		case 1:
			System.out.println("Poor performance");
			break;
		case 2:
			System.out.println("Slow performance");
			break;
		case 3 :
			System.out.println("Average - meeting expectations");
			break;
		case 4 :
			System.out.println("Good - performance");
			break;
		case 5 :
			System.out.println("Best Performer");
			break;
		default:
			System.out.println("please be ready for HR meeting");
		
		}

	}

}
