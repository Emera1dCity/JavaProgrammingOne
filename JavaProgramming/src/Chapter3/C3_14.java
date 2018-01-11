package Chapter3;

import java.util.Scanner;

/**
 * Program to flip a coin and have the user guess heads or tails
 *
 * @author Nathaniel Johnson
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        //Generate heads or tails on coin
        int coin = (int) (Math.random() * 2);

        //Prompt user for guess
        Scanner input = new Scanner(System.in);
        System.out.print("Guess 0 for heads or 1 for tails>>> ");
        int guess = input.nextInt();

        //Check the guess
        if (guess == coin) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
        System.out.println(coin);
    }
}
