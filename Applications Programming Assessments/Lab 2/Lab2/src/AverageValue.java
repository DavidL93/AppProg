public class AverageValue {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        
        System.out.print("Value: ");
        int number = In.nextInt();

        while(number != -1){
            count++;
            sum += number;
            System.out.print("Value: ");
            number = In.nextInt();    
        }
        if (sum > 0) {
            double average = (double)sum/(double)count;
            System.out.println("Average = " + average);
        }	
    }
}
