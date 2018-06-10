package exceptionHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandlinThrows {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, AWTException {
		System.out.println("start");
		Thread.sleep(5000);
		System.out.println("end");
		FileInputStream fs = new FileInputStream("");
		Robot a = new Robot();
	}

}
