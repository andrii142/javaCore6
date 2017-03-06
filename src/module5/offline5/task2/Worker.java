package module5.offline5.task2;

/**
 * Created by citsym on 23.02.17.
 */
public abstract class Worker extends Person {

    private String adress;
    private double salary;

    public Worker(){

    }

    public Worker(int id, String name){
        super(id, name);
    }


    public Worker(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

     public abstract double getMonthSalary();
}
