import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Revathi";
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	System.setProperty("Webdriver.chrome.driver", "Users/HP/OneDrive/Documents/Eclipse - Chrome driver");
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys(name);
	driver.findElement(By.name("inputPassword")).sendKeys("test");
	driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
	driver.findElement(By.className("submit")).click();
	driver.findElement(By.cssSelector(".error")).getText();
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("revatganesan@gmail.com");
	driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("3333333333");
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	driver.findElement(By.cssSelector("p.infoMsg")).getText();
	driver.findElement(By.xpath("//div/button[1]")).click();
	Thread.sleep(1000);	
	driver.findElement(By.id("inputUsername")).sendKeys(name);
	driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
	driver.findElement(By.cssSelector("button[type='submit']")).click();
//	System.out.println(driver.findElement(By.tagName("h2")).getText());
//	driver.findElement(By.tagName("h1")).getText();
//	driver.findElement(By.tagName("p")).getText();
//	driver.findElement(By.cssSelector("button[class*='logout']")).click();
	Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hello"+" "+name+",");
	Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Welcome to Rahul Shetty Academy");
	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	System.out.println(driver.findElement(By.tagName("p")).getText());
	driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	driver.close();

	
	
	
		
		
	}

}
