package module11;

/**
 * Created by citsym on 20.04.17.
 */
public class Person {
    private final String name;
    private final String lastName;

    public Person(String name, String lastName) {

        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
