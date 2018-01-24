package Chapter8;

/**
 * Program to print an array of employee hours to the console
 *
 * @author Nathaniel Johnson
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int[][] employeeSchedule = {
            {0, 2, 4, 3, 4, 5, 8, 8,},
            {1, 7, 3, 4, 3, 3, 4, 4,},
            {2, 3, 3, 4, 3, 3, 2, 2,},
            {3, 9, 3, 4, 7, 3, 4, 1,},
            {4, 3, 5, 4, 3, 6, 3, 8,},
            {5, 3, 4, 4, 6, 3, 4, 4,},
            {6, 3, 7, 4, 8, 3, 8, 4,},
            {7, 6, 3, 5, 9, 2, 7, 9,}};

        System.out.println("            Su M  T  W  Th F  Sa Total");

        //Employee0
        int emp0Total = 0;
        for (int column = 1; column < employeeSchedule[0].length; column++) {
            emp0Total += employeeSchedule[0][column];
        }

        //Employee1
        int emp1Total = 0;
        for (int column = 1; column < employeeSchedule[1].length; column++) {
            emp1Total += employeeSchedule[1][column];
        }

        //Employee2
        int emp2Total = 0;
        for (int column = 1; column < employeeSchedule[2].length; column++) {
            emp2Total += employeeSchedule[2][column];
        }

        //Employee3
        int emp3Total = 0;
        for (int column = 1; column < employeeSchedule[3].length; column++) {
            emp3Total += employeeSchedule[3][column];
        }

        //Employee4
        int emp4Total = 0;
        for (int column = 1; column < employeeSchedule[4].length; column++) {
            emp4Total += employeeSchedule[4][column];
        }

        //Employee5
        int emp5Total = 0;
        for (int column = 1; column < employeeSchedule[5].length; column++) {
            emp5Total += employeeSchedule[5][column];
        }

        //Employee6
        int emp6Total = 0;
        for (int column = 1; column < employeeSchedule[6].length; column++) {
            emp6Total += employeeSchedule[6][column];
        }

        //Employee7
        int emp7Total = 0;
        for (int column = 1; column < employeeSchedule[7].length; column++) {
            emp7Total += employeeSchedule[7][column];
        }

        int[][] employeeSchedule2 = {
            {0, 2, 4, 3, 4, 5, 8, 8, emp0Total},
            {1, 7, 3, 4, 3, 3, 4, 4, emp1Total},
            {2, 3, 3, 4, 3, 3, 2, 2, emp2Total},
            {3, 9, 3, 4, 7, 3, 4, 1, emp3Total},
            {4, 3, 5, 4, 3, 6, 3, 8, emp4Total},
            {5, 3, 4, 4, 6, 3, 4, 4, emp5Total},
            {6, 3, 7, 4, 8, 3, 8, 4, emp6Total},
            {7, 6, 3, 5, 9, 2, 7, 9, emp7Total}};

        //Display employeeSchedule2[][]
        for (int row = 0; row < employeeSchedule2.length; row++) {
            System.out.print("Employee");
            System.out.print(employeeSchedule2[row][0]);
            System.out.print("   ");
            for (int column = 1; column < employeeSchedule2[row].length; column++) {
                System.out.print(employeeSchedule2[row][column] + "  ");
            }
            System.out.println("");
        }
    }
}
