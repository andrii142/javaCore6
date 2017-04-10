package module9.offline;



/**
 * Created by citsym on 30.03.17.
 */
public class Car {

    //    private Startable tail = new Engine(2);
    private Wheel[] weels = new Wheel[4];

    String name;

    private Engine engine = new Engine();

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Car() {
        engine.setValue(2);
    }

    {
        for (int i = 0; i < 4; i++) {
            weels[i] = new Wheel();
        }

    }


    public void fire(Startable startable, int key) {
        startable.start(key);

    }

    public void startACar(int value) {

        fire(
                (int key) -> {
                    System.out.println("Car started with engine " + value + " liters " + name);
                }, 10
        );


    }


    private class Wheel {
        String color = "black";

        public void spin() {

        }
    }

    public void drive() {
        for (Wheel weel : weels) {
            weel.spin();
        }

    }

    ;


    public Wheel[] getWeels() {
        return weels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Engine getEngine() {
        return engine;
    }
}
