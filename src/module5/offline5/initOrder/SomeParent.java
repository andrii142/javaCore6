package module5.offline5.initOrder;

/**
 * Created by citsym on 23.02.17.
 */
public class SomeParent {

    protected String classNameParent = "[ Parent ]";
    private int yearsParent = calculateParentYears();

    private int calculateParentYears() {
        System.out.println(classNameParent + " Calculate parent years method");
        return 100;
    }


    {
        System.out.println(classNameParent + "init block");
    }




    public SomeParent() {
        System.out.println(classNameParent + "constructor");
    }
}
