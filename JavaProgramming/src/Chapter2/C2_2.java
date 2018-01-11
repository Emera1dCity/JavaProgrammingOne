package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate area and volume of a cylinder
 *
 * @author Nathaniel Johnson
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double length;
        double radius;
        double area;
        final double PIE = 3.14;
        double volume;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of a cylinder >>> ");
        radius = input.nextDouble();
        area = radius * radius * PIE;

        System.out.print("Enter the length of the cyclinder >>> ");
        length = input.nextDouble();
        volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
