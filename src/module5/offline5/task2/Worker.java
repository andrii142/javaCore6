package module5.offline5.task2;

/**
 * Created by citsym on 23.02.17.
 */
public abstract class Worker extends Person {

    private String adress;
    private double salary;
    private static int factoryWorkersAmount;

    public Worker() {

    }

    public Worker(int id, String name) {
        super(id, name);
    }


    public Worker(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public abstract double getMonthSalary();


    public abstract WorkerType getWorkerType();

    public enum WorkerType {
        HOUR_RATE, FIXED_MONTH_SALARY_RATE;
    }

    public static class WorkerFactory {
        public Worker createWorker(WorkerType workerType) {
            switch (workerType) {
                case HOUR_RATE:
                    factoryWorkersAmount++;
                    return new WorkerByHours();
                case FIXED_MONTH_SALARY_RATE:
                    factoryWorkersAmount++;
                    return new WorkerFixedMonthSalary();
                default:
                    factoryWorkersAmount++;
                    return new WorkerFixedMonthSalary();
            }
        }
    }


    public static class WorkerByHours extends Worker {
        private double hourRate;

        private WorkerByHours(){

        }

        private WorkerByHours(int id, String name, double hourRate) {
//        super(id, name);
            setId(id);
            setName(name);
            this.hourRate = hourRate;
        }

        public double getMonthSalary() {
            return 20.8 * 8 * hourRate;
        }

        @Override
        public WorkerType getWorkerType() {
            return WorkerType.HOUR_RATE;
        }
    }
}
