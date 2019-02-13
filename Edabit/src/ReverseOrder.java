// Create a method that takes a string as its argument and returns the string in reversed order.

public class ReverseOrder {
    public static String reverse(final String str) {
        String reversedString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);

        }
        return reversedString;
    }
}