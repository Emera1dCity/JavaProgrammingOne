package Chapter4;

import java.util.Scanner;

/**
 * Program to determine a bid winner based on how much work they require and how
 * much they charge per hour
 *
 * @author Nathaniel Johnson
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter bidder 1 name: ");
        String bid1Name = input.next();

        System.out.print("How many hours of work will you require?: ");
        int bid1Hours = input.nextInt();

        System.out.print("How much do you charge per hour?: ");
        double bid1Rate = input.nextDouble();

        System.out.println("");

        System.out.print("Enter bidder 2 name: ");
        String bid2Name = input.next();

        System.out.print("How many hours of work will you require?: ");
        int bid2Hours = input.nextInt();

        System.out.print("How much do you charge per hour?: ");
        double bid2Rate = input.nextDouble();

        System.out.println("");

        double bidder1Cost = bid1Hours * bid1Rate;
        double bidder2Cost = bid2Hours * bid2Rate;

        if (bidder1Cost < bidder2Cost) {
            System.out.printf("The winner is %s", bid1Name);
            System.out.println("");
            System.out.printf("The total cost is $%.2f", bidder1Cost);
            System.out.println("");
        } else if (bidder2Cost < bidder1Cost) {
            System.out.printf("The winner is %s", bid2Name);
            System.out.println("");
            System.out.printf("The total cost is $%.2f", bidder2Cost);
            System.out.println("");
        } else if (bidder1Cost == bidder2Cost && bid1Hours < bid2Hours) {
            System.out.printf("The winner is %s", bid1Name);
            System.out.println("");
            System.out.printf("The total cost is %.2f", bidder1Cost);
            System.out.println("");
            System.out.printf("The number of hours is %d", bid1Hours);
            System.out.println("");
        } else if (bidder2Cost == bidder1Cost && bid2Hours < bid1Hours) {
            System.out.printf("The winner is %s", bid2Name);
            System.out.println("");
            System.out.printf("The total cost is %.2f", bidder2Cost);
            System.out.println("");
            System.out.printf("The number of hours is %d", bid2Hours);
            System.out.println("");
        } else if (bidder1Cost == bidder2Cost && bid1Hours == bid2Hours) {
            System.out.printf("Both %s and %s have identical bids.", bid1Name, bid2Name);
            System.out.println("");
            System.out.println("");
            System.out.println("Number of hours:");
            System.out.printf("First bidder = %d      Second bidder = %d", bid2Hours, bid2Hours);
            System.out.println("");
            System.out.println("");
            System.out.println("Cost per hour:");
            System.out.printf("First bidder = %.2f      Second bidder = %.2f", bid1Rate, bid2Rate);
            System.out.println("");
            System.out.println("");
            System.out.println("Total Cost:");
            System.out.printf("First bidder = $%.2f      Second bidder = $%.2f", bidder1Cost, bidder2Cost);
            System.out.println("");
        }
    }
}
