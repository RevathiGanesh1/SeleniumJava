
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] array = new int[5];	
	array[0] = 111;
	array[1] = 222;
	array[2] = 333;
	array[3] = 444;
	array[4] = 555;
	
	int[] array2 = {11,22,33,44,55,66,77,88,99,00};
	
	//For loop, [] denotes multiple values/elements. there is no ; at the end of code
	
	//For loop 1
	
	for(int i=0; i<array.length; i++)
	{	
		System.out.println(array[i]);
			
	}
	
	System.out.println("**********Next Output**************");
	
	//For loop 2
	for(int i=0; i<array2.length; i++)
	{
		System.out.println(array2[i]);
	}
	
	System.out.println("**********Next Output**************");
	
	String[] Quote = {"Revathi","My","Dream","is","Fulfilled"};
	
	// i=0 => iterative staring from 0 index value coded above
	//For loop 3
	for(int i = 0; i<Quote.length; i++)
	{
	}
	
	//Enhanced For loop, instead of = will use : Other same as above just keeping code as simple as that.
	// below, r = variable and Quote = object
	//Enhanced For loop 1
	for( String r : Quote)
	{
		System.out.println(r);
	}
		
	
	}

}
