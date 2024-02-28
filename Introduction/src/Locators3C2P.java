import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators3C2P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Documents\\Eclipse - Chrome driver\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
	//absolute xpath -> start from root of html. //header/header/header
	//relative xpath -> starting from the middle of header. /header/header/
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//body/header/div/button[1]/following-sibling::button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText());		
		
	}

}
