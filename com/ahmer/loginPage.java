package com.ahmer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class loginPage {
 
	public static WebDriver driver;  
	
	@Test
  public void f() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS;	
		driver.findElement(By.name("email")).sendKeys("ahmer24");
		driver.findElement(By.name("pass")).sendKeys("ahmer24");
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
  }
  
	@BeforeTest
  public void Setup() 
	{
		driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
    }

  @AfterTest
  public void teardown() {
  }

}
