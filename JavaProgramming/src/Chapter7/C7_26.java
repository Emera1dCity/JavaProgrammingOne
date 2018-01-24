package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to determine whether two array lists are identical
 *
 * @author Nathaniel Johnson
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.println("");
        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];

        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        if (equals(list1, list2) == true) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }

    }

    /**
     * Equals Method
     *
     * @param list1 arguments returned to Main Method
     * @param list2 arguments returned to Main Method
     * @return returns boolean values for list1 & list2 to Main Method
     */
    public static boolean equals(int[] list1, int[] list2) {
        return Arrays.equals(list1, list2);
    }
}
