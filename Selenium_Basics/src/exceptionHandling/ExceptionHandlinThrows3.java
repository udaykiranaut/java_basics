package exceptionHandling;

import java.awt.Robot;
import java.io.FileInputStream;

public class ExceptionHandlinThrows3 {

	public static void main(String[] args) throws Exception {
		System.out.println("start");
		Thread.sleep(5000);
		System.out.println("end");
		FileInputStream fs = new FileInputStream("");
		Robot a = new Robot();
	}

}
