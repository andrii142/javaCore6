package module7.offline.shapes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/**
 * Created by citsym on 09.03.17.
 */
public class Group {

    private List<Shape> list = new ArrayList<>();


    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(Shape shape) {
         list.add(shape);
    }

    public boolean remove(Shape shape) {
        return list.remove(shape);
    }

    public Shape remove(int indx) {
        return list.remove(indx);
    }

    public boolean addAll(Group group) {

        // TODO implement later

        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public boolean removeAll(Collection c) {
        return false;
    }


    public double getSumAreas(){
        double sum = 0;

        for (Shape shape : list) {
            sum +=shape.getArea();
        }

        return sum;
    }
}
