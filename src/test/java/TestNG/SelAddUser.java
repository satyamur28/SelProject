package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelAddUser {
    WebDriver driver;
    
	@BeforeMethod
  public void launch() {
    	System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
    	driver.get("http://35.196.241.98:3001/add.php");
    }
	
	@Test
  public void adduser() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("login")).sendKeys("satya");
		driver.findElement(By.name("password")).sendKeys("edureka");
		driver.findElement(By.name("click")).click();
  }
	
	@AfterMethod
  public void logout() {
		driver.close();
		
	}
}
