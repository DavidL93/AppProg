public class Exercise4 {
	public static void main(String[] args) {
		int age = Input.askInt("How old are you?");
                if(age >= 17){
                    System.out.println("You are old enough to drive.");
                } else {
                    System.out.println("You are not old enough to drive.");
                }
	}
}
