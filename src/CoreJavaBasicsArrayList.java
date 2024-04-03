import java.util.ArrayList;

public class CoreJavaBasicsArrayList {

	public static void main(String[] args) {
		
		
		ArrayList <String> a = new ArrayList <String> ();
		//System.out.println(a);
		
		a.add("Python");
		a.add("Java");
		a.add("C++");
		a.add(0,"None");
		System.out.println(a);
		
		//a.remove(0);
		//System.out.println(a);
		
		// Simple For Loop
		for(int i = 0; i<a.size(); i++) 
		{
			System.out.println(a.get(i));
		}
		
		// Enhanced For Loop
		for(String s: a) 
		{
			System.out.println(s);
		}
		

		
	}

}
