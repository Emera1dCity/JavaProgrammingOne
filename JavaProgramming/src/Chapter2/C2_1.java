package Chapter2;

import java.util.Scanner;

/**
 * Program to convert Celsius to Fahrenheit
 *
 *
 * @author Nathaniel Johnson
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degrees in Celsius >>> ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println("That degrees in fahrenheit is " + fahrenheit);
    }

}
