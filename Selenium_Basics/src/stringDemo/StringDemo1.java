package stringDemo;

public class StringDemo1 {

	public static void main(String[] args) {
		
        String name="selenium webdriver";
        
        boolean status=name.startsWith("selenium");
        
        System.out.println("The status is"+status);
        
        String name1="welcome to selenium world";
        
        boolean status1=name1.endsWith("world");
        
        System.out.println("The status1 is "+status1);
        
        boolean status2=name1.endsWith("UFT");
        
        System.out.println("The status2 is "+status2);
        }
	
        }
        