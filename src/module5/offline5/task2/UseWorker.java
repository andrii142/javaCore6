package module5.offline5.task2;

/**
 * Created by citsym on 23.02.17.
 */
public class UseWorker {

    public static void main(String[] args) {

        Worker[] array = new Worker[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Worker(1000000000000d * 1000000000000d);
        }

        double sum = 0;

        for (Worker worker : array) {
            sum += worker.getSalary();
            System.out.println(worker.getSalary());
        }

        System.out.println("SUM: " + sum);

    }
}
