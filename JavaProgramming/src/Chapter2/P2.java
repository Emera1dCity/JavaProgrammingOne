package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate the total cost of a meal including entree, drink,
 * dessert, and tip
 *
 * @author Nathaniel Johnson
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mealPrice;
        double drinkPrice;
        double dessertPrice;
        double salesTax;
        double grossCost;
        double totalCost;
        double tip;
        final double TAX = 0.1;

        System.out.print("Enter price of the meal >>>");
        mealPrice = input.nextDouble();

        System.out.print("Enter price of drink >>>");
        drinkPrice = input.nextDouble();

        System.out.print("Enter price of dessert >>>");
        dessertPrice = input.nextDouble();

        grossCost = mealPrice + drinkPrice + dessertPrice;
        salesTax = grossCost * TAX;
        tip = .15 * (grossCost + salesTax);
        totalCost = tip + salesTax + grossCost;

        System.out.println("The price of the meal alone is $" + grossCost);
        System.out.println("Tax is $" + salesTax);
        System.out.println("A 15% tip is $" + tip);
        System.out.println("The total cost of your bill is $" + totalCost);
    }
}
