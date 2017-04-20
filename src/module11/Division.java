package module11;

import java.util.List;

/**
 * Created by citsym on 20.04.17.
 */
public class Division {

    private String divisionName;
    private List<Person> listPerson;

    public Division(String divisionName, List<Person> listPerson) {
        this.divisionName = divisionName;
        this.listPerson = listPerson;
    }

    public List<Person> getListPerson() {
        return listPerson;
    }

    public String getDivisionName() {
        return divisionName;
    }
}
