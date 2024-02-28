import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class windowsactivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Documents\\Eclipse - Chrome driver\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.linkedin.com/in/revathi-ganesan111/");
		driver.navigate().back();
		driver.navigate().to("https://www.naukri.com/mnjuser/profile?id=&altresid");
		driver.navigate().back();
	
	} 

}
