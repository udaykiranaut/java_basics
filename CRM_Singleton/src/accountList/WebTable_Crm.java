package accountList;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import library_crm.LoginCode;
import library_crm.SingletonDriver;

public class WebTable_Crm 
{
	@Test(priority=1)
	void login() throws Exception
	{
		
		LoginCode lc = new LoginCode();
		lc.browserName("chrome");
		lc.url("http://127.0.0.1:8091/sugarcrm/index.php?action=index&module=Home");
		lc.userDetails("admin", "root");
		SingletonDriver.driver.findElement(By.xpath("//a[text()='Accounts']")).click();
	}
	@Test(priority=2)
	public void accountTab()
	{
		String before_xpath = "//*[@id='MassUpdate']/table/tbody/tr[";
		String after_xpath = "]/td[2]/a";
	here:for(int i=3;i<=41;i+=2)
		{	
			
			String str = before_xpath+i+after_xpath;
			String str2 = SingletonDriver.driver.findElement(By.xpath(str)).getText();
			System.out.println(str2);	
			if(i==41)
			{
				SingletonDriver.driver.findElement(By.xpath("//button[@class='button' and @title='Next']")).click();
				continue here;
			}
		}
	}

}
