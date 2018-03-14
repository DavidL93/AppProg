public class Exercise4 {
	public static void main(String[] args) {
		double rad = Input.askDouble("What is the circle radius?");
                Circle circleObject = new Circle(rad);
                if(circleObject.calculateArea()>=10){
                    System.out.println("This circle is big.");
                } else {
                    System.out.println("This circle is small.");
                }
	}
}
