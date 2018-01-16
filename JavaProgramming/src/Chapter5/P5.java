package Chapter5;

import java.util.Scanner;

/**
 * Program to collect votes from the user and print the numbers to the console
 *
 * @author nj0974191
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yesVotes = 0;
        int noVotes = 0;
        int invalidVotes = 0;
        String run = "y";

        while (run.equals("y")) {
            System.out.print("Enter 'Y' to vote yes,'N' to vote no, or 'Q' to quit voting: ");
            String vote = input.next();

            if (vote.toUpperCase().equals("Y")) {
                ++yesVotes;
            } else if (vote.toUpperCase().equals("N")) {
                ++noVotes;
            } else if (vote.toUpperCase().equals("Q")) {
                run = "n";
            } else {
                System.out.print("INVALID CODE: ");
                ++invalidVotes;
            }

        }

        System.out.println("Voting Stopped");
        System.out.println("");
        System.out.println("Total (Yes) votes:    " + yesVotes);
        System.out.println("Total (No) votes:     " + noVotes);
        System.out.println("Total Invalid votes:  " + invalidVotes);
        System.out.println("Total votes:          " + (yesVotes + noVotes + invalidVotes));

    }
}
