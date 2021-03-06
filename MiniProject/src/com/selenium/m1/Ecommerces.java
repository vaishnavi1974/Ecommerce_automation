package com.selenium.m1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ecommerces {
	@SuppressWarnings({ "deprecation" })
	@Test
	public void opening() throws Exception{
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\Vaishnavi\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	//WebDriver driver = new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaishnavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Actions action = new Actions(driver);
	driver.get(" http://automationpractice.com/index.php");									//YourLogoWebsite opens usingChrome driver.
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	WebElement block_1=driver.findElement(By.xpath("//a[text()='Women']"));					//Hovers over the women button.
	action.moveToElement(block_1).perform();
	
	WebElement tshirtbtn=driver.findElement(By.partialLinkText("T-shirts"));				//T-shirt link becomes visible and then clicks on it.
	tshirtbtn.click();
	String pg=driver.getTitle();
	Assert.assertEquals(pg, "T-shirts - My Store");											//This function is used to check if it has landed on the required WebPage.
	Thread.sleep(1000);
	
	WebElement block=driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div"));	//In the T-shirt page it hovers over the T-shirt block to find More button 
	action.moveToElement(block).perform();
	Thread.sleep(1000);
	
	WebElement more=driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[2]/span")); 	//It clicks on the More button.
	more.click();
	Thread.sleep(1000);
	
	WebElement increase=driver.findElement(By.xpath("//i[@class='icon-plus']"));			//It increases the quantity to 2 by clicking on the plus icon.
	increase.click();
	Thread.sleep(1000);
	
	Select size=new Select(driver.findElement(By.name("group_1")));							//It change the size to L by clicking the drop-down menu.
	size.selectByVisibleText("L");
	Thread.sleep(1000);
	
	WebElement color=driver.findElement(By.name("Blue"));									//It changes the color to Blue.
	color.click();
	Thread.sleep(1000);
	
	WebElement add_cart=driver.findElement(By.name("Submit"));								//It clicks on the Add to cart button.
	add_cart.click();
	String pg1=driver.getTitle();
	Assert.assertEquals(pg1, "Faded Short Sleeve T-shirts - My Store");
	Thread.sleep(1000);
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);						//It waits until the next page loads.
	WebElement pro = driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a"));
	pro.click();																			//It then clicks on the proceed to checkout button.
	String pg2=driver.getTitle();
	Assert.assertEquals(pg2, "Order - My Store");
	Thread.sleep(1000);
	
	WebElement proceed=driver.findElement(By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium"));
	proceed.click();																		//Again clicks on the proceed to checkout button to move to the next page.
	String pg3=driver.getTitle();
	Assert.assertEquals(pg3, "Login - My Store");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("automation1@yourlogo.com");	//Change the email address if there is need to check the automation.
	Thread.sleep(1000);																		//It now fills the input in the email textbox.
	
	driver.findElement(By.xpath("//span[normalize-space()='Create an account']")).click();	//Then clicks on the Create an account button.
	Thread.sleep(1000);
	
	driver.findElement(By.id("id_gender2")).click();										//Now it enters the personal information page and clicks on gender2 radio button.
	Thread.sleep(1000);
	
	driver.findElement(By.id("customer_firstname")).sendKeys("Vaishnavi");					//It writes the firstname.
	Thread.sleep(2000);
		
	driver.findElement(By.id("customer_lastname")).sendKeys("Venkatesh");					//It writes the lastname.
	Thread.sleep(2000);
	
	driver.findElement(By.id("passwd")).sendKeys("automate*123");							//It writes the password.
	Thread.sleep(2000);
	
	Select s1=new Select(driver.findElement(By.id("days")));								//It selects the day of birth from drop-down menu.
	s1.selectByIndex(14);
	Thread.sleep(1000);
	
	Select s2=new Select(driver.findElement(By.id("months")));								//It selects the month of birth from drop-down menu.
	s2.selectByIndex(4);
	Thread.sleep(1000);
	
	Select s3=new Select(driver.findElement(By.id("years")));								//It selects the year of birth from the drop down menu.
	s3.selectByIndex(22);
	Thread.sleep(1000);
	
	/*driver.findElement(By.id("firstname")).sendKeys("Vaishnavi");
	Thread.sleep(1000);
	driver.findElement(By.id("lastname")).sendKeys("Venkatesh");*/
	
	driver.findElement(By.id("company")).sendKeys("yourlogo");
	Thread.sleep(1000);
	
	driver.findElement(By.name("address1")).sendKeys("Dayanand Sagar College of Engineering");	//It then writes the addrees
	driver.findElement(By.name("city")).sendKeys("Bangalore");
	
	Select s4=new Select(driver.findElement(By.name("id_state")));							//It then selects a state from the drop down menu.
	s4.selectByIndex(33);
	Thread.sleep(1000);
	
	driver.findElement(By.name("postcode")).sendKeys("10001");								//It writes the postal code given by the user. 
	
	Select s5=new Select(driver.findElement(By.name("id_country")));						//It selects the country given by the user from the drop down menu.
	s5.selectByIndex(1);
	
	driver.findElement(By.name("phone_mobile")).sendKeys("9876543210");						//It writes the mobile number of the user.
	
	driver.findElement(By.name("alias")).sendKeys(" is given below");								//It writes the alias name as it is compulsory.
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//span[normalize-space()='Register']")).click();			//It registers' the user signs' in the user.
	Thread.sleep(1000);
	
	System.out.println("User is created.");
	
	driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")).click();	//It clicks the proceed to checkout.
	
	driver.findElement(By.id("cgv")).click();												//It ticks the terms and conditions block.
	
	driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")).click();		//It proceeds to checkout and stops near payment.
	Thread.sleep(1000);
	String pg4=driver.getTitle();
	Assert.assertEquals(pg4,"Order - My Store");
	
	System.out.println("Congratulations, order placed successfully !!");
	
	
	driver.close();
	}
	
	
}
	

