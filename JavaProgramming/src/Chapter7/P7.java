
package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to populate an array with average values determined by the user
 *
 * @author Nathaniel Johnson
 */
public class P7 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Get input
        System.out.print("How many numbers will the array read in?: ");
        int[] inputArray = new int[input.nextInt()];

        //Fill array with elements
        System.out.print("Enter " + inputArray.length + " elements: ");
        fill(inputArray);

        //Display average
        System.out.println("The average is " + average(inputArray));

        System.out.println("");

        //Display array contents
        System.out.println("The contents of the array: ");
        print(inputArray);
    }
    
    /**
     * Fill Method
     *
     * @param list1 arguments returned to Main Method
     */
    public static void fill(int[] list1) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
    }
    
    /**
     * Average Method
     *
     * @param list1 arguments returned to Main Method
     * @return returns array average as double to Main Method
     */
    public static double average(int[] list1) {
        int total = 0;
        for (int i : list1) {
            total += i;
        }

        double average = total / list1.length;
        return average;
    }
    
    /**
     * Print Method
     *
     * @param list1 arguments returned to Main Method
     */
    public static void print(int[] list1) {
        System.out.println(Arrays.toString(list1));
    }
}
