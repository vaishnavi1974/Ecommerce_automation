package com.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class signin {
	@Test
	public void testrediffsignin() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaishnavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		String Url="https://www.rediff.com/";
		driver.get(Url);
		String pagetitle=driver.getTitle();
		Assert.assertEquals(pagetitle,"Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
		WebElement signinlink=driver.findElement(By.linkText("Sign in"));
		signinlink.click();
		Assert.assertEquals(driver.getTitle(),"Rediffmail");
		WebElement username=driver.findElement(By.id("login1"));
		WebElement password=driver.findElement(By.id("password"));
		username.sendKeys("veenagopalakrishna@rediffmail.com");
		Thread.sleep(4000);
		password.sendKeys("Bharani");
		Thread.sleep(1000);
		
		WebElement goBtn=driver.findElement(By.name("proceed"));
		goBtn.click();
		Assert.assertEquals(driver.getTitle(),"Rediffmail");
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
