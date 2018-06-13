package library_crm;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginCode 
{
	@Test
	public void browserName(String browser) throws Exception
	{
		SingletonDriver.initillize(browser);
		Thread.sleep(1000);
	}
		public void url(String url) throws Exception
		{
		SingletonDriver.driver.navigate().to(url);
		Thread.sleep(1000);
		}
		public void userDetails(String Uname,String Pass) throws Exception
		{
		SingletonDriver.driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(Uname);
		Thread.sleep(1000);
		SingletonDriver.driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(Pass);
		Thread.sleep(1000);
		SingletonDriver.driver.findElement(By.xpath("//input[@name='Login']")).click();
		}
		public void close()
		{
			
		SingletonDriver.quitBrowser();
		}
	}
	
