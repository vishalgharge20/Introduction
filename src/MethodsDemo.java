
public class MethodsDemo {

	public static void main(String[] args) {
		
		MethodsDemo a = new MethodsDemo();
		String name = a.SayHello();
		System.out.println(name);
		
		a.SayBye("vishal");		
		
		MethodsDemo2 a1 = new MethodsDemo2();
		a1.SayThankYou("Vishal");

	}

	
	public String SayHello() {
		System.out.println("Hello");
		return "User";
	}
	
	
	public String SayBye(String user) {
		System.out.println("Bye "+ user);
		return user;
	}
	
}
