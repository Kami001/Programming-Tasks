import java.lang.String;

// Create a function that takes a string,
// checks if it has the same number of 'x's and 'o's
// and returns either true or false.

public class XO {
    public static boolean getXO (String str){
        int countX = 0;
        int countO = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.toLowerCase().charAt(i) == 'x'){
                countX++;
            } else if (str.toLowerCase().charAt(i) == 'o'){
                countO++;
            }
        }
        return (countO == countX);
    }
}
