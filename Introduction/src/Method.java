
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//classname obj = new classname()
		Method n = new Method();
		String name = n.getData1();
		System.out.println(name);
	//Created a separate class for method name = methodonly(any name) and executing here
	//create object and execute	
		methodonly n2 = new methodonly();
		System.out.println(n2.getUserData());
		
	//without object as we coded with static below	
		getData2();
		
		
		
	
		
	}

	//Method -> if any lines of code want to reuse everytime then wrap all the lines in 1 block.
	// Method should be write outside main block and not in above execution main block.
	// If you want to access/execute the method of the class then need object for the class.
	//eg webdriver driver = new chromedriver()
	//below public void -  any code in this project can access so it is coded as public void
	//if marking method as static then this belongs to class not object.
	// in the line 9 we can remove n(object) and execute. this is the difference for above sentence.eg String name = getData();

	//restrict below method 
	public String getData1()
	{
		System.out.println("hello Penguin!");
		return "Welcome";
		
	}
	
	public static String getData2()
	
	{
		System.out.println("Hey!!!");
		return "Good day";
	}
	
}
