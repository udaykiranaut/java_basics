package library_crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SingletonDriver 
{
	public static WebDriver driver;
	public static void initillize(String browser_name)
	{
		if(browser_name.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browser_name.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if(browser_name.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","E:\\01 for testing\\selenium web drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
	}
	public static void closePage()
	{
		driver.close();
	}
	public static void quitBrowser()
	{
		driver.quit();
	}

}
