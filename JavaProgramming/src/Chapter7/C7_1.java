
package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to generate and populate an array with student scores
 *
 * @author nj0974191
 */
public class C7_1 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Create placeholders
        String grade;
       
        //Get input for # of students and assign it to array
        System.out.print("Enter the number of students: ");       
        int[] studentArray = new int[input.nextInt()];

        System.out.println("");

        //Get input for scores and add them to an array
        System.out.print("Enter " + studentArray.length + " scores: ");
        for(int i = 0; i < studentArray.length; i++){
            studentArray[i] = input.nextInt();
        }
        
        //Sort the array holding student values
        Arrays.sort(studentArray);
        int best = studentArray[studentArray.length - 1];
        
        //Using a For loop to populate the elements of the array
        for(int i = 0; i < studentArray.length; i++){
            if(studentArray[i] >= best - 10){
                grade = "A";
                System.out.println("Student " + i + " score is " + studentArray[i] + " and grade is " + grade);
            }
            
            else if(studentArray[i] >= best - 20){
                grade = "B";
                System.out.println("Student " + i + " score is " + studentArray[i] + " and grade is " + grade);
            }
            
            else if(studentArray[i] >= best - 30){
                grade = "C";
                System.out.println("Student " + i + " score is " + studentArray[i] + " and grade is " + grade);
            }
            
            else if(studentArray[i] >= best - 40){
                grade = "D";
                System.out.println("Student " + i + " score is " + studentArray[i] + " and grade is " + grade);
            }
            
            else{
                grade = "F";
                System.out.println("Student " + i + " score is " + studentArray[i] + " and grade is " + grade);
            }
            
        }
    }
}
