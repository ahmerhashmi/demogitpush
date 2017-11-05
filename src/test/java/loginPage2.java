import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class loginPage2 {
	
public static WebDriver driver;  
	
	@Test
  public void login() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.findElement(By.name("email")).sendKeys("ahmer24");
		driver.findElement(By.name("pass")).sendKeys("ahmer24");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
  }
  
	@BeforeTest
  public void Setup() 
	{
		driver = new FirefoxDriver();
		driver.get("https://facebook.com");
    }

  @AfterTest
  public void teardown() {
  }
	
}
	