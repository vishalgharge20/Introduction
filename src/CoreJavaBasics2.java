import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBasics2 {

	public static void main(String[] args) {
		
	int[] array1= {1,3,5,4,10,15,18,22,25};
		
	for(int i=0; i<array1.length;i++) 
	{
		if (array1[i] % 2 ==0) 
		{
			//System.out.println("Congratulations "+array1[i]+" is Multiple of 2");
			break;
		}
		else 
		{
			//System.out.println(array1[i]+" is not Multiple of 2");
		}
	}
		
			
	
	
			// Converting Array to Array list
	
			String[] arr = {"Java","Python","C#","Ruby"};
			List<String> arrList = new ArrayList<>(Arrays.asList(arr));
			
			arrList.add("Added");
			
			System.out.println(arrList);
			
			
			
	
		
	
	

		

	}

}
