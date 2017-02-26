package module5.offline5.task2;

/**
 * Created by citsym on 23.02.17.
 */
public class Worker extends Person {

    private String adress;
    private double salary;

    public Worker(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
