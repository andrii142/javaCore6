package module3.webinar;

/**
 * Created by citsym on 27.03.17.
 */
public class Vehicle {

    public Vehicle() {
    }

    public Vehicle(int price) {
        this.price = price;
    }

    private int price;

    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                '}';
    }
}
