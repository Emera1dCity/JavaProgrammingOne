package Chapter8;

import java.util.Scanner;

/**
 * Program to collect information from the user about a salesman, then store the
 * data in an array
 *
 * @author Nathaniel Johnson
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] salesArray = new double[4][5];
        String cont = "Y";
        //Start "yes" "no" loop
        while (cont.equalsIgnoreCase("Y")) {
            int sub1 = 0;
            int sub2 = 0;

            if (sub1 != -1) {
                System.out.println("Enter the salesman ID as A, B, C, or D.");
                System.out.print("Input: ");
                String salesmanID = input.next();
                char salesManID = salesmanID.toUpperCase().charAt(0);
                sub1 = linSearch(salesArray, salesManID);
            }

            if (sub2 != -1) {
                System.out.println("Enter the day as M, T, W, H, or F.");
                System.out.print("Input: ");
                String day = input.next();
                char Day = day.toUpperCase().charAt(0);
                sub2 = linSearch(salesArray, Day);
            }

            while (sub1 == -1) {
                System.out.println("Invalid ID! Please enter the salesman ID as A, B, C, or D.");
                System.out.print("Input: ");
                String salesmanID = input.next();
                char salesManID = salesmanID.toUpperCase().charAt(0);
                sub1 = linSearch(salesArray, salesManID);
            }

            while (sub2 == -1) {
                System.out.println("Invalid ID! Please enter the day as M, T, W, H, or F.");
                System.out.print("Input: ");
                String day = input.next();
                char Day = day.toUpperCase().charAt(0);
                sub2 = linSearch(salesArray, Day);
            }

            if (sub1 != -1 && sub2 != -1) {
                System.out.print("Enter the amount of sale: ");
                double saleAmount = input.nextDouble();
                salesArray[sub1][sub2] += saleAmount;

                System.out.print("More data? Enter Y for more or N to stop: ");
                cont = input.next();
            }
        }

        String[][] salesMan = {
            {"A"},
            {"B"},
            {"C"},
            {"D"}};

        System.out.println("Salesman  M      T       W       H       F");

        for (int row = 0; row < salesArray.length; row++) {
            System.out.print(" " + salesMan[row][0]);

            for (int column = 0; column < salesArray[row].length; column++) {
                System.out.print("\t" + salesArray[row][column] + "  ");
            }
            System.out.println();
        }
    }

    /**
     * linSearch Method
     *
     * @param arr generate new array to populate
     * @param target array to be searched
     * @return returns integer value to Main Method
     */
    public static int linSearch(double[][] arr, char target) {
        int index;
        switch (target) {
            case 'A':
                index = 0;
                break;
            case 'B':
                index = 1;
                break;
            case 'C':
                index = 2;
                break;
            case 'D':
                index = 3;
                break;
            case 'M':
                index = 0;
                break;
            case 'T':
                index = 1;
                break;
            case 'W':
                index = 2;
                break;
            case 'H':
                index = 3;
                break;
            case 'F':
                index = 4;
                break;
            default:
                index = -1;
                break;
        }
        return index;
    }
}
