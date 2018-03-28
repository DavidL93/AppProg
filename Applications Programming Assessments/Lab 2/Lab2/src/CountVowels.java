public class CountVowels {
    public static void main(String[] args) {
        System.out.print("Character: ");
        char letter = In.nextChar();
        int numberOfVowels = 0;
        
        while(letter != '.'){
            System.out.print("Character: ");
            letter = In.nextChar();
            
            if(letter=='a' || letter=='e' || letter=='i'|| letter=='o' || letter=='u'){
                numberOfVowels++;
            }
        }
        
        System.out.println("Vowel count = " + numberOfVowels);
    }
}
