package module6.offline;

import module5.offline5.task2.WorkerByHours;
import module5.offline5.task2.WorkerFixedMonthSalary;

/**
 * Created by citsym on 02.03.17.
 */
public class UseWorkers {

    public static void main(String[] args) {

        // Prepare data
        double hourRate = 30;
        int expectedResult = 4992;

        // Execute code
        WorkerByHours vasya = new WorkerByHours(1, "Nastya" , hourRate);

        Double monthSalary = vasya.getMonthSalary();
        // Compare the result

        int compareResult = Double.compare(monthSalary, expectedResult);


        System.out.println(compareResult == 0 ? "Test passed" : "Test failed" );





        // Prepare data
        double salaryMonth = 2000;
        int expectedResult2 = 2000;

        // Execute code
        WorkerFixedMonthSalary petya = new WorkerFixedMonthSalary(salaryMonth);

        Double monthSalary2 = petya.getMonthSalary();
        // Compare the result

        int compareResult2 = Double.compare(monthSalary2, expectedResult2);


        System.out.println(compareResult2 == 0 ? "Test passed" : "Test failed" );
/////////////




    }
}
