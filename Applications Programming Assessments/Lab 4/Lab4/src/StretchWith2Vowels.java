public class StretchWith2Vowels 
{
    public static void main(String[] args) {
        String string; 
        while(!((string = readSentence()).equals("*"))){
            System.out.println("Matching words = " + matchCount(string));
        } 
    }
    
    public static String readSentence(){
        System.out.print("Sentence: ");
        return In.nextLine().toLowerCase();
    }
    
    public static int matchCount(String sentence){
        int count = 0;
        for(String x: sentence.split(" +")){
            if(matches(x)){
                count++;
            }
        }
        return count;
    }
    
    public static boolean matches(String word){
        for(String x: word.split("z")){
            if(vowelCount(x) == 2){
                return true;
            }
        }
        return false;
    }
    
    public static int vowelCount(String part){
        int count = 0;
        for(int x = 0; x < part.length(); x++){
            if(isVowel(part.charAt(x))){
                count++;
            }
        }
        return count;
    }
    
    public static boolean isVowel(char a){
        char[] vowelz = {'a','e','i','o','u'};   
        
        for(char v: vowelz){
            if (v == a) {
                return true;
            }
        }   
        return false; 
        //return "aeiou".contains(""+a)
    }
}
