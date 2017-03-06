package module5.offline5.task2;

/**
 * Created by citsym on 02.03.17.
 */
public class WorkerByHours extends Worker {
    private double hourRate;

    public WorkerByHours(int id, String name, double hourRate) {
//        super(id, name);
        setId(id);
        setName(name);
        this.hourRate = hourRate;
    }

    public double getMonthSalary() {
        return 20.8 * 8 * hourRate;
    }
}
