public class Rectangle {
	private int width;
	private int height;
        
        public Rectangle() {
		System.out.println("Creating new rectangle.");
		width = Input.askInt("Enter width:");
		height = Input.askInt("Enter height:");
	}
        
        public Rectangle(int width, int height){
            this.width = width;
            this.height = height;
        }
       
        public void changeDimensions(int width, int height){
            this.width = width;
            this.height = height;
        }
                
                
        public int calculateArea(){
            return (this.width*this.height);
        }

	public void show() {
		System.out.println("The rectangle has dimensions " + width + "x" + height);
	}

	public void showArea() {
		int area = width * height;
		System.out.println("The rectangle's area is " + area);
	}
        
        @Override
        public String toString(){
            return (this.width + "x" + this.height);
        }
}
