public class MiddleAverage {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        System.out.print("Value: ");
        int number = In.nextInt();
        int min = number; 
        int max = number;

        while(number != -1){
            if (number < min) {
                min = number;
            } else if(number > max){
                max = number;
            }
            
            count++;
            sum += number;
            System.out.print("Value: ");
            number = In.nextInt();    
        }
        if (count > 3) {
            double average = (double)(sum -(min+max)) /(double)(count -2);
            System.out.println("Middle average = " + average);
        }	
    }
}
