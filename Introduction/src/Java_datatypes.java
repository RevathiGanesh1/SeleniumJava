import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class Java_datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int number = 333;
	 double decimal = 11.11;
	char Name =  'R';
	//char website = ('G','E');
	 java.lang.String life = "I went to Germany";
	 Boolean gotoffer = true;
	// WebDriver driver = new ChromeDriver();
	// driver.get("https://www.google.com");
	// driver.close();
	// System.out.println(Name+" "+life+"."+"It is happening now"+"."+gotoffer+" "+decimal+" "+number);
	
	System.out.println(number );	
	
	//below code 4 is no of elements, int always uses[] brackets, 
	//String[],  int[] is an array. An array is a container object that holds a fixed number of values of a single type.
	//The length of an array is established when the array is created. After creation, its length is fixed. 
	//Multiple strings are created it becomes an array.		
	 int[] array = new int[4];
		array[0] = 555;
		array[1] = 777;
		array[2] = 888;
		array[3] = 222;
	//	array[4] = 333;
	//arrays have multiple values coded directly like below
		int[] array2 = {111,222,333,444,555,666,777,888,999};
		
		System.out.println(array2[4]);
		
		
		
	}

}
