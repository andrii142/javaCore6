package module5.offline5.task2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by citsym on 02.03.17.
 */
public class WorkerFixedMonthSalaryTest {
    @Test
    public void getMonthSalary() throws Exception {

        // Prepare data
        double hourRate = 30;
        int expectedResult = 4992;

        // Execute code
        WorkerByHours vasya = new WorkerByHours(1, "Nastya", hourRate);

        Double monthSalary = vasya.getMonthSalary();
        // Compare the result

        int compareResult = Double.compare(monthSalary, expectedResult);


        System.out.println(compareResult == 0 ? "Test passed" : "Test failed" );

        Assert.assertTrue(compareResult == 0);

    }

}