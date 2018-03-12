public class Exercise6 {
	public static void main(String[] args) {
		String userName = Input.askString("Username:");
                String password = Input.askString("Password:");
                
                if(userName.equals("joe")&& password.equals("guess")){
                    System.out.println("Welcome, " + userName + "!");
                } else {
                    System.out.println("Incorrect username or password.");
                }
	}
}
