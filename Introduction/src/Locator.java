import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//Locator types -> id,name, classname, xpath, css selector, linktext, tagname, partial link text
		
	WebDriver driver = new ChromeDriver();	
// implicit code added for timeout and this is for waiting to show something by action of anything in UI 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	System.setProperty("WebDriver.chrome.driver","Users/HP/OneDrive/Documents/Eclipse - Chrome driver");
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
//id, name & class:
	driver.findElement(By.id("inputUsername")).sendKeys("Revathi");
	driver.findElement(By.name("inputPassword")).sendKeys("test");
	driver.findElement(By.className("submit")).click();
//using css selector if there is no id, classname or basic locators. 
// tagname.classname or tagname#id , tagname[attribute='value'], etc
//in console - $'')
// CSS & LINKTEXT:
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	driver.findElement(By.linkText("Forgot your password?")).click();
//	Thread.sleep(1000); this thread is already field present in UI waiting to find out due to transition of page.This is how it is diff from implicit
//XPATH:
//tagname[@attribute='value'], //tagname[@attribute='value'][1] here 1 denotes index like first values or second values etc )if have multiple identical attributes)
//in console - $x('xpath') and can check those present or not
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Revathi");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("revatganesan@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
//	driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("revaa.ganesh@gmail.com");
	driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("revaa.ganesh@gmail.com");
// using css using tagname without attribute i.e. //parenttagname/childtagname[int]
	driver.findElement(By.xpath("//form/input[3]")).sendKeys("9999999999");
//	driver.findElement(By.className("reset-pwd-btn")).click();
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	System.out.println(driver.findElement(By.className("infoMsg")).getText());
	System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
	driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
//parent with class
	driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Revathi");
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	System.out.println("Hello Revathi,\r\n" + "Welcome to Rahul Shetty Academy\r\n"+ "You are successfully logged in.");
	
	
	
	
	
	
	
	
	
	}

}
