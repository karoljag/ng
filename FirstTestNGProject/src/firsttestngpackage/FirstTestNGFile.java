package firsttestngpackage;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNGFile {
	WebDriver driver = new FirefoxDriver();
    String baseUrl = "http://newtours.demoaut.com";
   
  @BeforeTest
  public void OdpalFF(){
	  driver.get(baseUrl);
	  
  }
    
  
  @BeforeMethod
  public void kazdy(){
	  
	  System.out.println("XXXXXXXXXX");
	  Assert.assertEquals(1, 1);
  }
  
  
  
	
	
  @Test
  public void a() {
	 
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);	 
	  	  
  }
  
 @Test
  public void b() {
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);	 
		  
  }
  
  @Test
  public void c() {
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);	 
	  //driver.quit();	  
	  if(driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/bbb")).isDisplayed() )                                                                                                         
	  {         
		  System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x"); 
	  }
	  
  }
  
  
  @AfterTest
  public void TerminateBrowser(){
	  driver.quit();
	  
  }   
}
