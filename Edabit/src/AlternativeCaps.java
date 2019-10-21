Create a method that alternates the case of the letters in a string.
    
public class AlternativeCaps{
    public static String alternatingCaps(String s){
        String s1 = s.toLowerCase();
        char[] listOfChars = s1.toCharArray();
        String finalString = "";

        for (int i = 0; i < listOfChars.length; i++ ){
            if(i % 2 == 0){
                finalString += Character.toUpperCase(listOfChars[i]);
            }else{
                finalString += listOfChars[i];
            }
        }
        return finalString;
    }
}
