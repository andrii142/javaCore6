package module7.offline;

/**
 * Created by citsym on 23.03.17.
 */
public class Egg implements Blendable<Omlet> {

    @Override
    public Omlet blend() {
        return  new Omlet();
    }
}
