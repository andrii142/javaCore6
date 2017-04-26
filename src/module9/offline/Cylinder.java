package module9.offline;

import java.io.Serializable;

/**
 * Created by citsym on 03.04.17.
 */
public class Cylinder implements Serializable {

    private String material = "Steal";


    public String getMaterial() {
        return material;
    }


    public void setMaterial(String material) {
        this.material = material;
    }
}
