package module6.questions;

import module5.offline5.task2.Worker;
import module5.offline5.task2.WorkerFixedMonthSalary;

/**
 * Created by citsym on 06.03.17.
 */
public class UseInnerClasses {

    public static void main(String[] args) {

        Chart myChart = new Chart();
        myChart.init();
        myChart.drawChart();


        System.out.println(myChart.calculateWidthOfChart());


        Worker.WorkerFactory factory = new Worker.WorkerFactory();

        Worker worker = factory.createWorker(Worker.WorkerType.FIXED_MONTH_SALARY_RATE);

        if (worker instanceof WorkerFixedMonthSalary){
            ((WorkerFixedMonthSalary) worker).incrementSalary(20);
        }

        System.out.println(worker.getWorkerType());




    }
}
