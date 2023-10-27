
public class methods {
	public static void main(String[] args) {
	
		// method = a block of code that is executed 
		//whenever it is called upon
		String title = "Mom";
		int age = 51;
		
		hello(title, age);
		
		int x = 15;
		int y = 20;
		
		System.out.println(add(x, y));
	}
	
	static void hello(String title, int age) {
		System.out.println("Hello " + title + "!");
		System.out.println("You are " + age);
	}
	
	static int add(int a, int b) {
		return a + b;
	}
}
