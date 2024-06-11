//Write a Java program to create a String object with a character array.

public class CharArrayToString {
    public static void main(String[] args) {
        // Define a character array
        char[] charAry = {'A', 'n', 'i', 'k', 'e', 't',' ', 'B', 'o', 'd', 'h', 'e'};

        // Create a String object using the character array
        String str = new String(charAry);

        // Display the resulting String
        System.out.println("The string created from the character array is: " + str);
    }
}
