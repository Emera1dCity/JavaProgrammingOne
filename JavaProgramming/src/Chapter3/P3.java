package Chapter3;

import java.util.Scanner;

/**
 * Program to determine if a number is "less than", "greater than", or "equal
 * to" another number
 *
 * @author Nathaniel Johnson
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Initialize variables
        double num1;
        double num2;

        //Prompt user for the first and second numbers
        System.out.print("Enter the first number >>> ");
        num1 = input.nextDouble();

        System.out.print("Enter the second number >>> ");
        num2 = input.nextDouble();

        //Start if statements
        //If the first number is less than the second
        if (num1 < num2) {
            System.out.println("The first number is less than the second number.");
        }

        //If the first number is greater than the second
        if (num1 > num2) {
            System.out.println("The first number is greater than the second number.");
        }

        //If the first number is equal to the second
        if (num1 == num2) {
            System.out.println("The first number is equal to the second number.");
        }

        //If the first number is less than or equal to the second
        if (num1 <= num2) {
            System.out.println("The first number is less than or equal to the second number.");
        }

        //If the first number is not equal to the second
        if (num1 != num2) {
            System.out.println("The first number is not equal to the second number.");
        }

        //If the second number is equal to zero
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else if (num1 / num2 < 1) {
            System.out.println("Proper fraction.");
        } else {
            System.out.println("Improper fraction.");
        }

        //If the first number is gretaer than or equal to 90, 80, 70, and 60
        if (num1 >= 90) {
            System.out.println("A");
        } else if (num1 >= 80) {
            System.out.println("B");
        } else if (num1 >= 70) {
            System.out.println("C");
        } else if (num1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        //If the second number is between 1 and 100
        if (num2 >= 1 && num2 <= 100) {
            System.out.println("In range.");
        } else {
            System.out.println("Out of range.");
        }
    }
}
