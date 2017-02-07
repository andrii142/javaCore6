package module3.webinar.objectexample;

public class Person {
    //private, public, protected, default
    private long id;
    private String name;
    private int age;
    private String companyName;

    public Person() {

    }

    public Person(long id, String name, int age, String companyName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.companyName = companyName;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(long id) {
        this.id = id;
    }

    public void changeCompanyName(String newCompany) {
        companyName = newCompany;
    }

    private void checkPersonCompany() {
        if (this.companyName == "Facebook") {
            //send email to HR
        }
    }

    public void setName(String name) {
        if (name == null)
            return;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        //some logic can be added
        if (name == null) return "";
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCompanyName() {
        return companyName;
    }

    //


    //

    //

    //

    //

}
