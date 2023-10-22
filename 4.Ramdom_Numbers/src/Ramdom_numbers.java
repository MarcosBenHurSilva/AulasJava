import java.util.Random;

public class Ramdom_numbers {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt(99)+0;
		//double y = random.nextDouble();
		//boolean z = random.nextBoolean();

		System.out.println(x);

	}

}
