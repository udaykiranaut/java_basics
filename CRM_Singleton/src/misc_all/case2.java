package misc_all;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class case2 {
    public static void main(String[] args) throws Exception {
    	System.setProperty("webdriver.gecko.driver","E:\\01 for testing\\selenium web drivers\\geckodriver\\geckodriver10.exe");
        WebDriver wd;
        wd = new FirefoxDriver();
        wd.get("http://127.0.0.1:8091/sugarcrm/index.php?action=Login&module=Users");
        
        wd.findElement(By.id("user_name")).click();
        wd.findElement(By.id("user_name")).clear();
        wd.findElement(By.id("user_name")).sendKeys();
        wd.findElement(By.id("login_button")).click();
        if (!wd.findElement(By.tagName("html")).getText().contains("You must specify a valid username and password.")) {
            System.out.println("verifyTextPresent failed");
        }
        
        wd.findElement(By.id("user_name")).click();
        wd.findElement(By.id("user_name")).clear();
        wd.findElement(By.id("user_name")).sendKeys("admin");
        wd.findElement(By.id("login_button")).click();
        if (!wd.findElement(By.tagName("html")).getText().contains("You must specify a valid username and password.")) {
            System.out.println("verifyTextPresent failed");
        }
        wd.findElement(By.xpath("//td[@id='main']/table/tbody/tr/td")).click();
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("manager");
        wd.findElement(By.id("login_button")).click();
        if (!wd.findElement(By.tagName("html")).getText().contains("You must specify a valid username and password.")) {
            System.out.println("verifyTextPresent failed");
        }
        wd.findElement(By.xpath("//td[@id='main']/table/tbody/tr/td")).click();
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("root");
        wd.findElement(By.id("login_button")).click();
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
