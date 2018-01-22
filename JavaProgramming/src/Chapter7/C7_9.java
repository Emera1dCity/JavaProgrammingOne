
package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to populate an array with 10 elements and sort the array
 *
 * @author Nathaniel Johnson
 */
public class C7_9 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        System.out.print("Enter 10 numbers: ");
        
        for(int i = 0; i < array.length; i++){
        array[i] = input.nextDouble();
        }
        System.out.println(min(array));
    }
    
    /**
     * Min Method
     *
     * @param array arguments from command line prompt
     * @return returns array value as double to Main Method
     */
    public static double min(double[] array){
        Arrays.sort(array);
        return array[0];
    }
}
