

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String is an object which represents by sequential of characters.	
			//String Literal -> if multiple objects having a same values in s1 and s2 but only 1 object is created.
			// if object values are different the unique object is created for the string. for rev3 - new object is created as it is diff values.
				
				//Literal String
		String rev = "My dream is fulfilled";
		String rev1 = "My dream is fulfilled";
		String rev3 = "fulfilled";
		
		//New Keyword String - coding new which create new object in every string with same values in the memory space
		//Multiple strings splitted and are created it becomes an array.	
		String reva = new String("I got a job offer with visa sponsorship and relocation support");
		String reva2 = new String("I got a job offer with visa sponsorship and relocation support");
		String revv = new String("I went to Germany happily with an excellent job offer");
		
		//Split using space " ". So it delimited with space.
		String[] splittedstring = revv.split(" ");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[2]);
		System.out.println(splittedstring[3]);
		System.out.println(splittedstring[4]);
		
		System.out.println("**********Next Output**************");
		//Split using to. So it delimited with to. index also calculated based on removing the delimited characters.
		
		String[] splittedstring1 = revv.split(" ");
		System.out.println(splittedstring1[0]);
		System.out.println(splittedstring1[1]);
		System.out.println(splittedstring1[2]);
		System.out.println(splittedstring1[3]);
		
		System.out.println("**********Next Output**************");
		
		//Char one by one
		
		for(int i=0; i<reva.length(); i++)
		{
			System.out.println(reva.charAt(i));
		}
		
		System.out.println("**********Next Output**************");
		
		//reverse order
		for(int i=reva.length()-1; i<reva.length(); i--)
		{
			System.out.println(reva.charAt(i));

		}
		
		
//		System.out.println("*************************************");
		
//		
//		for(int i=reva.length()-1; i>=0; i--)
//		{
//			System.out.println(reva.charAt(i));
//		}	
		
		
	}

}
