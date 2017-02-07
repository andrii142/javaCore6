package module3.webinar;


import module3.webinar.phones.IPhone;
import module3.webinar.phones.Phone;

public class Main {


    public static void main(String[] args) {
        //User user = new User();



        int a = 5;


        Car honda1 = new Car("civik", 2009);
        Car honda2 = new Car(2010, "civik2", 10000, "Jack");


 //       honda1.printYear();
 //       honda2.printYear();


        Phone phone = new Phone(1000, "5S", "Chine");
        phone.setOperatingSystem("ios9");

        //logic

        System.out.println(phone.getCost());

        IPhone iPhone = new IPhone(1000, "5S", "Chine");

    }
}
