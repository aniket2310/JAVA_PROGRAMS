//Write a Java program to get the character at the given index within the string.

import java.util.Scanner;

public class CharAtIndex {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //create scannner object

        //the user to enter a string
        System.out.println("Enter the Srtin" +
                "" +
                "g to get character : ");
        String str1 = sc.nextLine();

        //user enter the index
        System.out.println("Enter the index to know Character : ");
        int index = sc.nextInt();

        if(index < 0 && str1.length() >= index)  //check the index character
        {
            System.out.println("Char at index "+index+" is : "+str1.charAt(index));

            // print index and its character
        }else
        {
            System.out.println("you enter the invalid index number ");

        }


    }
}
