//Write a Java program to get the character at the given index within the string.


import java.util.Scanner;

public class CharIndexDemo {
    static String a = "AniketBodhe";
    int index = 5;

    public static void main(String[] args) {   //main method
        Scanner sc = new Scanner(System.in);   //making scanner object to read input
        System.out.println("Enter the String to char at index : ");
        String b =sc.nextLine();        //
        char c = b.charAt(5);   //check  the character at index no. 5
        System.out.println("The char at index 5 is : "+c);
        System.out.println("The char at index 5 is : "+a.charAt(4));        //check  the character at index no. 4
    }
}


//import java.util.Scanner;
//
//public class CharIndexDemo {
//    static String a = "AniketBodhe";
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String to char at index 5: ");
//        String b = sc.nextLine();
//
//        // Check if the string length is sufficient for index 5
//        if (b.length() > 5) {
//            char c = b.charAt(5);
//            System.out.println("Character at index 5 in the input string: " + c);
//        } else {
//            System.out.println("The input string is too short for index 5.");
//        }
//
//        // Since 'a' is a static variable, it can be accessed directly
//        System.out.println("Character at index 4 in the static string: " + a.charAt(4));
//
//        // Close the scanner
//        sc.close();
//    }
//}
