import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SelIntro {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
// Using webdriver so can use code in all browsers.If we use chromedriver then only
// chrome alone can use.
//webdriver method + own class methods
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Users/HP/OneDrive/Documents/Eclipse - Chrome driver");	
//Above step is alternative way instead of using selenium lib and it executes using our own code by
// downloading the chromedriver from the web and save it in out local library.
//Chromedriver.exe  -> third party library. It acts as middleman for selenium code to chrome browser.
//Selenium cannot directly connect with web browser restrictions. So here comes selenium manager.
// Selenium Manager library - If there is nthg coded scripted in selenium then it invokes the the C.D.exe file
// from web, download itself and through that launch Chrome browser.
		 
	}

}
