package module5.offline5.task2;

/**
 * Created by citsym on 23.02.17.
 */
public class Person {

    private int id;
    private String name;
    private String lastName;
    private int age;
    private Gender gender;


    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
