package Chapter3;

import java.util.Scanner;

/**
 * Program to check whether an integer is divisible by "5 and 6", "5 or 6", and
 * "5 or 6, but not both"
 *
 * @author Nathaniel Johnson
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);

        //Ask for input
        System.out.print("Enter an integer >>> ");
        int number = input.nextInt();

        //Calculate
        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println(number + " is divisible by 5 and 6.");
        }

        if (number % 5 == 0 || number % 6 == 0) {
            System.out.println(number + " is divisible by 5 or 6.");
        }

        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println(number + " is divisible by 5 or 6, but not both.");
        }
    }
}
