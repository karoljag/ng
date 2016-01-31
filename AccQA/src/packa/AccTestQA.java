package packa;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class AccTestQA {
	WebDriver driver = new FirefoxDriver();
	String accounts = "http://217.74.73.117/accounts";
	String management = "http://217.74.73.117/management";

	// @BeforeTest

	@Test
	public void logAM() {
		driver.get(accounts);

		WebElement email = driver
				.findElement(By.xpath("//label[@for='email']"));
		email.sendKeys("1qq@1qq.com");

		WebElement password = driver.findElement(By
				.xpath("//input[@id='password']"));
		password.sendKeys("1QQ1qq$");

		WebElement staySigned = driver.findElement(By
				.xpath("//input[@id='password']"));
		staySigned.click();

		WebElement signiIn_btn = driver.findElement(By
				.xpath("//button[@type='submit']"));
		signiIn_btn.click();

	}

	@Test
	public void management() {
		driver.get(management);
		
		
		WebElement avatar = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By
						.xpath("//img[@alt='Avatar']")));
		
		
		
		
		
		

	}
	
	@Test
	public void management1() {
		
		WebElement avatar = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By
						.xpath("//img[@alt='Avatar']")));
		
		Assert.assertEquals(true, avatar.isDisplayed());
		
		
	}
	

	@Test
	public void managementLogout() {
		WebElement avatar = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By
						.xpath("//img[@alt='Avatar']")));
		avatar.click();

		WebElement logout_btn = driver.findElement(By
				.xpath("//a[@ng-click='userManager.logout()']"));
		logout_btn.click();

		driver.get(accounts);

		WebElement signin_btn = driver.findElement(By
				.xpath("//a[@class='btn btn-success']"));
		signin_btn.click();

	}

}