package com.selenium.basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
	
	@Test
	public void verifyfacebookhomepage()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaishnavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String URL="https://www.facebook.com";
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		String pagetitle=driver.getTitle();
		System.out.println("We get the title like: "+pagetitle);
		Assert.assertEquals(pagetitle, "Facebook – log in or sign up");
		driver.close();
		
	}

}
