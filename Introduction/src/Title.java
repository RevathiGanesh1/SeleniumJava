import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "Users/HP/OneDrive/Documents/Eclipse - Chrome driver");
		driver.get("https://Ajio.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
//Quit -> It closed associated multiple windows opened by this run.
//close -> it closes only current window.
		
		
		
	}

}
