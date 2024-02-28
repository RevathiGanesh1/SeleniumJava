import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraycondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] Array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		int[] Array2 = new int[5];
		Array2[0] = 11;
		Array2[1] = 22;
		Array2[2] = 33;
		Array2[3] = 44;
		
	for(int i=0; i<Array.length; i++)
		
	{
		if(Array[i] % 2 == 0)
		{
		
		System.out.println(Array[i]);
		break;
		
	}
		else
		{
			System.out.println(Array[i] + "is not multiples of 2");
		}
	}
	
	System.out.println("*********Next Ouput************");
	
	// Arraylist -> We can add multiple values and no need of predefined elements like array.
		// Arraylist will be scripted object.method. Create object of the class.
		// Adding string in brackets as we are gonna add string instead of int.
		//ArrayList is used as size in the for loop whereas Array uses length.
		// Only ArrayList has contains method and Array doesn't have method to find any item
	
	ArrayList<String> obj = new ArrayList<String>();
	//obj.method.
	obj.add("My");
	obj.add("Dream");
	obj.add("is");
	obj.add("is");
	obj.add("fulfilled");
	obj.remove("is");
	//if we want to remove and can use obj.remove method.
	
	System.out.println(obj.get(1));
	
	System.out.println("*********Next Ouput************");
	
	//For loop 1
	for(int i=0; i<obj.size(); i++)
	{
	 System.out.println(obj.get(i));
	}
	
	System.out.println("**********Next Output**************");
	
	//Enhanced For loop 1
	for(String newvariable: obj)
	{
		
	System.out.println(newvariable);
	}
	
	System.out.println("**********Next Output**************");
	
	//Item is present in ArrayList
	// This method boolean result in true /false
	System.out.println(obj.contains("My"));
	
	System.out.println("**********Next Output**************");
	
	//Convert Array to ArrayList
	
	String[] Name = {"My","Dream","is","fulfilled"};
	List<String> vconvertAL =  Arrays.asList(Name);
	
	System.out.println(vconvertAL.get(1));
	System.out.println( vconvertAL.contains("fulfilled"));
	
	System.out.println("**********Next Output**************");	
	
	for(String newvar2: vconvertAL)
	{
		System.out.println((newvar2));
	}
	
	
	}

}
