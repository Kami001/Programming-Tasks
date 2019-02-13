import java.lang.String;

public class Program {
    public static String verifySubstrs(String s1, String s2, String s3, String s4) {
        // Verify if the first string starts with the second string,
        // includes the third string, and ends with the fourth string.
        // If the first string passes all checks, return the string
        // "My head, body, and tail.", otherwise, return "Incomplete.".

        if ((s1.startsWith(s2)) && (s1.contains(s3)) && (s1.endsWith(s4))){
            return "My head, body, and tail.";
        } else {
            return "Incomplete.";
        }
    }
}