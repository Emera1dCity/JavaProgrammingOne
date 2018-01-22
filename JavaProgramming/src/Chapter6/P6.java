package Chapter6;

import java.util.Scanner;

/**
 * Program to convert US dollars to Pounds, Euros, and Yen
 *
 * @author Nathaniel Johnson
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many Euros will 1 US Dollar buy?: ");
        double euroRate = input.nextDouble();

        System.out.print("How many Pounds will 1 US Dollar buy?: ");
        double poundRate = input.nextDouble();

        System.out.print("How many Yen will 1 US Dollar buy?: ");
        double yenRate = input.nextDouble();

        String answer = "";
        do {
            System.out.print("Enter the number of US Dollars to be used: ");
            double dollars = input.nextDouble();

            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds, or \"Y\" to buy Yen: ");
            String type = input.next();

            if (type.equalsIgnoreCase("E")) {
                double e = Convert(dollars, euroRate);
                System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros", dollars, e);
            } else if (type.equalsIgnoreCase("P")) {
                double p = Convert(dollars, poundRate);
                System.out.printf("For %.2f dollars, you will be able to buy %.2f Pounds", dollars, p);
            } else if (type.equalsIgnoreCase("Y")) {
                double y = Convert(dollars, yenRate);
                System.out.printf("For %.2f dollars, you will be able to buy %.2f Yen", dollars, y);
            }

            System.out.println("");
            System.out.print("Are there more conversions to perform? >");
            answer = input.next();

            if (!answer.equalsIgnoreCase("Yes") || !answer.equalsIgnoreCase("No")) {
                System.out.print("Please enter \"Yes\" to continue or \"No\" to stop: ");
                answer = input.next();
            }

        } while (answer.equalsIgnoreCase("Yes"));

    }

    /**
     * Convert Method
     *
     * @param inputDollars arguments returned to Main Method
     * @param currency arguments returned to Main Method
     * @return returns double value for total dollar amount 
     */
    public static double Convert(double inputDollars, double currency) {
        double total = 0;

        if (inputDollars > 100) {
            total = inputDollars * 0.95 * currency;
        } else {
            total = inputDollars * 0.90 * currency;
        }

        return total;
    }
}
