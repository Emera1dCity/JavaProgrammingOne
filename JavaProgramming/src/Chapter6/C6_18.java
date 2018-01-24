package Chapter6;

import java.util.Scanner;

/**
 * Program to check if a password from the user is valid/invalid
 *
 * @author Nathaniel Johnson
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1;

        System.out.print("Enter a string: ");
        s1 = input.next();

        System.out.print("");
        if (passwordTest(s1) == true) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

    }

    /**
     * PasswordTest Method
     *
     * @param password arguments passed/returned to Main Method
     * @return boolean returns true or false based on whether password is
     * correct or not
     */
    public static boolean passwordTest(String password) {
        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters!");
            return false;
        }

        //Consists of only letters and digits
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                System.out.println("Password must only contain letters and digits!");
                return false;
            }
        }

        //Must contain at least 2 digits
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                ++counter;
            }
        }
        if (counter < 2) {
            System.out.println("Password must contain at least 2 digits!");
            return false;
        }

        return true;
    }
}
