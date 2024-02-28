import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdownwithselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "Users/HP/OneDrive/Documents/Eclipse - Chrome driver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//if tagname is select then its static. and its not dependent on other field selection
		WebElement StaticDropdown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(StaticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.close();
		System.out.println("This is executed successfully");
		
//		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("revathinetlink@gmail.com");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.cssSelector("a[href='https://rahulshettyacademy.com/seleniumPractise/#/']")).click();
//		driver.findElement(By.cssSelector("a[target='_blank']")).click();
		
		
				
		
		
		
		
		
		
		
		
	}

}
