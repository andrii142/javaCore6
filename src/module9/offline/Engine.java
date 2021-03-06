package module9.offline;

import java.io.Serializable;

/**
 * Created by citsym on 03.04.17.
 */
public class Engine implements Serializable {

    private transient double value;

    private Cylinder[] cilinders = new Cylinder[8];

    {
        for (int i = 0; i < getCylinders().length; i++) {
            cilinders[i] = new Cylinder();

            if (i == 5) {
                cilinders[i].setMaterial("Wood");
            }
        }
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }


    public Cylinder[] getCylinders() {
        return cilinders;
    }
}
