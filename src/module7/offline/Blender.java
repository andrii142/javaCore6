package module7.offline;

/**
 * Created by citsym on 23.03.17.
 */
public class Blender<T> {

     T makeCoctail(Blendable<T> blendable){
        return blendable.blend();
    }
}
