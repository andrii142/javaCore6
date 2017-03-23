package module7.offline;

/**
 * Created by citsym on 23.03.17.
 */
public class Grass implements Blendable<GreenCoctail> {

    @Override
    public GreenCoctail blend() {
        return new GreenCoctail();
    }
}
