package Chapter3;

import java.util.Scanner;

/**
 * Program to determine which of 3 packages has the best price based on their
 * weight
 *
 * @author Nathaniel Johnson
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Get weight and price for package 1
        System.out.print("Enter weight for package 1 >>> ");
        double weight1 = input.nextDouble();
        System.out.print("Enter price for package 1 >>> ");
        double price1 = input.nextDouble();
        double r1 = price1 / weight1;

        //Get weight and price for package 2
        System.out.print("Enter weight for package 2 >>> ");
        double weight2 = input.nextDouble();
        System.out.print("Enter price for package 2 >>> ");
        double price2 = input.nextDouble();
        double r2 = price2 / weight2;

        //Compare the prices
        if (r1 < r2) {
            System.out.println("Package 1 has a better price.");
        } else if (r2 < r1) {
            System.out.println("Package 2 has a better price.");
        } else {
            System.out.println("The packages have equal price.");
        }
    }

}
