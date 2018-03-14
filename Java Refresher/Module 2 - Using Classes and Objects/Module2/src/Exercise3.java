public class Exercise3 {
	public static void main(String[] args) {
		double rad = Input.askDouble("What is the circle radius?");
                Circle circleObject = new Circle(rad);
                circleObject.showArea();
	}
}
