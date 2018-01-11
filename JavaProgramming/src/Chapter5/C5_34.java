package Chapter5;

import java.util.Scanner;

/**
 * Program to play Rock, Paper, Scissors with the user
 *
 * @author Nathaniel Johnson
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computerCounter = 0;
        int userCounter = 0;

        while (userCounter != (computerCounter * 2) && computerCounter != (userCounter * 2) || userCounter == 0 && computerCounter == 0) {
            int computerPlay = (int) (Math.random() * 3);

            System.out.print("Enter 0 for scissors, 1 for rock, or 2 for paper: ");
            int userPlay = input.nextInt();

            if (userPlay == 0) {
                if (computerPlay == 1) {
                    System.out.println("You - paper, Computer - rock: You Win!");
                    ++userCounter;
                } else if (computerPlay == 2) {
                    System.out.println("You - paper, Computer - scissors: Computer Wins!");
                    ++computerCounter;
                }
            } else if (userPlay == 1) {
                if (computerPlay == 2) {
                    System.out.println("You - Rock, Computer - scissors: You Win!");
                    ++userCounter;
                } else if (computerPlay == 0) {
                    System.out.println("You - Rock, Computer - paper: Computer Wins!");
                    ++computerCounter;
                }
            } else if (userPlay == 2) {
                if (computerPlay == 0) {
                    System.out.println("You - Scissors, Computer - paper: You Win!");
                    ++userCounter;
                } else if (computerPlay == 1) {
                    System.out.println("You - Scissors, Computer - rock: Computer Wins!");
                    ++computerCounter;
                }

                if (userCounter > computerCounter) {
                    System.out.println("You won the game!");
                    System.out.println("You have " + userCounter + " point(s).");
                    System.out.println("The Computer has " + computerCounter + " point(s).");
                } else if (computerCounter > userCounter) {
                    System.out.println("The Computer wins the game!");
                    System.out.println("The Computer has " + computerCounter + " point(s).");
                    System.out.println("You have " + userCounter + " point(s).");
                } else if (computerCounter == userCounter) {
                    System.out.println("It's a tie! Both You and the Computer have equal points!");
                }

            }

        }

        if (userCounter == (computerCounter * 2)) {
            System.out.println("You won more than two times.");
        } else if (computerCounter == (userCounter * 2)) {
            System.out.println("The Computer won more than two times.");
        }

    }
}
