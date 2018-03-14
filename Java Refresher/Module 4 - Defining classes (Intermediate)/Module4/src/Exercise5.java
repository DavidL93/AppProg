public class Exercise5 {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(8, 4);
                //rect.show();
                System.out.println("The initial rectangle dimensions are " + rect.toString());
                rect.changeDimensions(6, 5);
                System.out.println("The new rectangle dimensions are " + rect.toString());
                //rect.show();
                
                int area = rect.calculateArea();
                if(area > 10){
                    System.out.println("This is a big rectangle.");
                } else{
                    System.out.println("This is a small rectangle.");
                }
	}
}
