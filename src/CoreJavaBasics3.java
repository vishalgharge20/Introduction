
public class CoreJavaBasics3 {

	public static void main(String[] args) {
		
		String word = "Core Java Basics";
		//System.out.print(word);
		
		String [] new_word = word.split(" ");
		for(String s:new_word) {
			//System.out.println(s);
		}
		
		
		for(int i=0;i<word.length();i++){
			//System.out.println(word.charAt(i));
		}
		
		// Reverse String:
		
		for(int i=word.length()-1;i>=0;i--) {
			System.out.println(word.charAt(i));
		}
		
		

		
		
	}
	
}
