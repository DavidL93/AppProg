import java.util.Random;

public class Exercise5 {
	public static void main(String[] args) {
		Random rand = new Random(7777);
                int ran = rand.nextInt(100);
                System.out.println("Here is a random number: " + ran);
	}
}
