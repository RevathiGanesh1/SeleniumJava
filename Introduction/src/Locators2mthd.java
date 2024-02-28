import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2mthd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Revathi";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//adding back to the class and giving a variable name to transverse through the code to execute.	
		String password= getPassword(driver);
		System.setProperty("Webdriver.chrome.driver", "Users/HP/OneDrive/Documents/Eclipse - Chrome driver");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.id("inputUsername")).sendKeys(name);
//		driver.findElement(By.name("inputPassword")).sendKeys("test");
//		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
//		driver.findElement(By.className("submit")).click();
//		driver.findElement(By.cssSelector(".error")).getText();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("revatganesan@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("3333333333");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		driver.findElement(By.cssSelector("p.infoMsg")).getText();
		driver.findElement(By.xpath("//div/button[1]")).click();
		Thread.sleep(1000);	
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hello"+" "+name+",");
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Welcome to Rahul Shetty Academy");
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		System.out.println(driver.findElement(By.tagName("p")).getText());
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}

	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);	
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		driver.findElement(By.cssSelector("p.infoMsg")).getText();
	//need to split that sentence and extract rahulshettyacademy "Please use temporary password 'rahulshettyacademy' to Login." 
	//converting into string and giving name as variable.
	//splitting the string to extract the password, Please use temporary password 'rahulshettyacademy' to Login.
	//split 0 index -> Please use temporary password '
	//split 1 index -> rahulshettyacademy' to Login.
	//we can also write another step before row 53 
	//String passwordarray2 = passwordarray[1].split("'");
	//passwordarray2[0];
		String passwordtext =driver.findElement(By.cssSelector("p.infoMsg")).getText();
		passwordtext.split("'");
		String[] passwordarray = passwordtext.split("'");
		String password = passwordarray[1].split("'")[0];
		return password;
	}
	
	
	
}
