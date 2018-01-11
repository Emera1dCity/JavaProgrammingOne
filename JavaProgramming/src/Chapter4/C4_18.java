package Chapter4;

import java.util.Scanner;

/**
 * Program to organize the major and grade of a student based on the user's
 * input
 *
 * @author Nathaniel Johnson
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters (Ex.\"m1\") >>> ");
        String a = input.next().toUpperCase();

        char major = a.charAt(0);
        char grade = a.charAt(1);

        switch (major) {
            case 'M':
                System.out.print("Mathematics ");
                break;
            case 'C':
                System.out.print("Computer Science ");
                break;
            case 'I':
                System.out.print("Information Technology ");
                break;
            default:
                System.out.println("Invalid input");
        }

        switch (grade) {
            case '1':
                System.out.println("Freshman");
                break;
            case '2':
                System.out.println("Sophomore");
                break;
            case '3':
                System.out.println("Junior");
                break;
            case '4':
                System.out.println("Senior");
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}
