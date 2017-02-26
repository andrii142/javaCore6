package module5.offline5.initOrder;

/**
 * Created by citsym on 23.02.17.
 */
public class SomeChild extends SomeParent {

    protected String className = "[" + getClass().getSimpleName() + "]";
    private String name = "Pasha";
    private String secondName;
    private int years = calculate();
    private int calculate() {

        System.out.println(className + " Calculate method");

        return 17;
    }

    {
        System.out.println(className + " init block" );
        System.out.println(className + " secondName: " + secondName);

        secondName = name + years;

        System.out.println(className + " secondName: " + secondName);
    }


    public SomeChild(int years) {
        System.out.println(className + " constructor" );
    }

}
