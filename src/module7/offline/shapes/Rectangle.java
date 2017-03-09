package module7.offline.shapes;

/**
 * Created by citsym on 09.03.17.
 */
public class Rectangle extends Shape {

    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getArea() {
        return a * b;
    }


}
