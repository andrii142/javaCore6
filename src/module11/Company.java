package module11;

import java.util.List;

/**
 * Created by citsym on 20.04.17.
 */
public class Company {
    private List<Division> listDivision;

    public Company(List<Division> listDivision) {

        this.listDivision = listDivision;
    }

    public List<Division> getListDivision() {
        return listDivision;
    }
}
