package Chapter4;

import java.util.Scanner;

/**
 * Program to collect user input about employees and generate a payroll
 *
 * @author Nathaniel Johnson
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Collect input
        System.out.print("Enter employee's name: ");
        String name = input.next();

        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateRate = input.nextDouble();

        double grossPay = hours * payRate;
        double fedTax = federalRate * grossPay;
        double stateTax = stateRate * grossPay;
        double deductions = stateTax + fedTax;

        //Show input
        System.out.printf("Employee Name: %s\n", name);
        System.out.printf("Hours Worked: %.2f\n", hours);
        System.out.printf("Pay Rate: $%.2f\n", payRate);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);
        System.out.printf("Deductions: \n");
        System.out.printf("\tFederal Withholding (%.2f%%): $%.2f\n", (federalRate * 100), fedTax);
        System.out.printf("\tState Withholding (%.2f%%): $%.2f\n", (stateRate * 100), stateTax);
        System.out.printf("\tTotal Deduction: " + "$%.2f\n", deductions);
        System.out.printf("Net Pay: $%.2f\n", (grossPay - deductions));

    }
}
