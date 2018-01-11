package Chapter5;

import java.util.Scanner;

/**
 * Program to reverse a string (s1)
 *
 * @author Nathaniel Johnson
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s1 = input.next();
        String s2 = new StringBuffer(s1).reverse().toString();

        System.out.println("The reversed string is " + s2);
    }
}
