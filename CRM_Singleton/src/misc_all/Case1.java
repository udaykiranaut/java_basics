package misc_all;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Case1 {
    WebDriver wd;
    
    @BeforeMethod
    public void setUp(){
    	System.setProperty("webdriver.gecko.driver","E:\\01 for testing\\selenium web drivers\\geckodriver\\geckodriver10.exe");
        wd = new FirefoxDriver();
        wd.get("http://127.0.0.1:8091/sugarcrm/index.php?action=Login&module=Users");
       
    }
    
    @Test
    public void login() {
        
        wd.findElement(By.id("user_name")).click();
        wd.findElement(By.id("user_name")).clear();
        wd.findElement(By.id("user_name")).sendKeys("admin");
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("root");
        wd.findElement(By.id("login_button")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
