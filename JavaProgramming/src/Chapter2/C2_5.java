package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate the total amount of a bill with gratuity
 *
 * @author Nathaniel Johnson
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double subtotal;
        double gratuity;
        double total;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal >>> ");
        subtotal = input.nextDouble();

        System.out.print("Enter the gratuity rate(%) >>> ");
        gratuity = input.nextDouble();
        total = ((gratuity / 100) * subtotal) + subtotal;

        System.out.println("The total including gratuity is $" + total);
    }
}
