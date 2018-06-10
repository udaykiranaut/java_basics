package demo.crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchCrm 
{
	@Test
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8091/sugarcrm/index.php?action=Login&module=Users");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("root");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.quit();
		
	}

}
