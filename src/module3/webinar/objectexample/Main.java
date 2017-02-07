package module3.webinar.objectexample;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"ddd", "dddddd", "kkkk"};


        personExample();

        //int, byte, .. .. . .. . .


    }

    static void personExample() {
        //object was created here
        Person person1 = new Person(1001, "Jack", 50, "Google");

        Person person2;
        person2 = new Person(1002, "Ann", 50, "Google");

        Person person3 = new Person();

        Person person4 = new Person(4444);

        //does not work when filed is private
        //System.out.println(person1.age);
        //System.out.println(person1.id);
        //System.out.println(person1.name);
        //System.out.println(person1.companyName);


        System.out.println(person1.getAge());
        System.out.println(person1.getId());
        System.out.println(person1.getName());
        System.out.println(person1.getCompanyName());

        //person array example
        Person[] peopleArr = {person1, person2, person3, person4};


        //person1.id = 1002;

        //System.out.println(person1.id);
    }



    /*static void testUser() {
        int a;
        a = 10;

        //декларация
        User user;
        //инициализация
        user = new User();


        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getCompany());

        System.out.println();

        user.speak();
    }

    static void testUser1() {
        User user1 = new User(1001, "Denis", 10, "module1.module10.webinar.FileWriterExample");
        User user2 = new User(1000, "DenisTest", 10, "module1.module10.webinar.FileWriterExample");

        System.out.println(user1);

        System.out.println(user1.getName());
        System.out.println(user1.getAge());
        System.out.println(user1.getCompany());

        user1.setName("MyName");
        long userId = user1.getId();


        System.out.println(user1.getName());
    }*/
}
