
public class CoreJavaBasics {

	public static void main(String[] args) {
		
		int SelectedNum = 5;
		String name = "vishal";
		//System.out.println(name);
		
		double deciNum = 99.99;
		float floatNum = 10.50f;
		
		char character = 'g';
		boolean age = true;
		//System.out.println(SelectedNum);
		//System.out.println("Name is " + name + " and the number Selected is: "+  SelectedNum );
		//System.out.println(name +" "+character);
		//System.out.println("age is " + age);
		
		
		// Array
		
		int[] arr1 = {1,4,6,8,12};
		int[] arr2 = new int[5];
		
		arr2[0] = 1;
		arr2[1] = 4;
		arr2[2] = 6;
		arr2[3] = 8;
		arr2[4] = 1;
		
		//System.out.println(arr2[4]);
		
		
		
		
		// For Loop
		
		// 1.
		for(int i = 0; i<arr1.length; i++)
		{
			//System.out.println(arr1[i]);
		}
			
		
		// 2.
		for(int i:arr1)
		{
			//System.out.println(i);
		}
		
		
		
		String[] arr3 = {"Java","Python","C#","Ruby"};
		
		for(int i = 0; i<arr3.length; i++ )
		{
			//System.out.println(arr3[i]);
		}
		
		
		for(String lang : arr3)
		{
			//System.out.println(lang);
		}
		
		for(int i=0; i<10;i++)
		{
			//System.out.println((2*i)+1);
		}
			
		// Decrement for Loop
		for(int i=10;i!=0;i--)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
	}
		
	}


