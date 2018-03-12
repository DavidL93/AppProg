public class Exercise9 {
	public static void main(String[] args) {
		double xp1 = Input.askDouble("Enter x coordinate for point 1:");
                double yp1 = Input.askDouble("Enter y coordinate for point 1:");
                double xp2 = Input.askDouble("Enter x coordinate for point 2:");
                double yp2 = Input.askDouble("Enter y coordinate for point 2:");
                
                double insideTheFuckingRoot = Math.pow(xp2-xp1, 2) + Math.pow(yp2-yp1, 2);
                double finalFuckingAnswer = Math.pow(insideTheFuckingRoot, 0.5);
                
                System.out.println("The distance between the two points is " + finalFuckingAnswer);
	}
}
