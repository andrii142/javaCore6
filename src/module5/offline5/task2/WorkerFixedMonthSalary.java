package module5.offline5.task2;

/**
 * Created by citsym on 02.03.17.
 */
public class WorkerFixedMonthSalary extends Worker {

    private double salary;

    public WorkerFixedMonthSalary(double salary) {

        this.salary = salary;
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }
}
