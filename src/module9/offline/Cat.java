package module9.offline;

/**
 * Created by citsym on 30.03.17.
 */
public class Cat {

    private Shakable tail = new Tail();

    void shakeATail(){
        tail.shake();
    }

    private class Tail implements Shakable{

        @Override
        public void shake() {
            System.out.println("Cat shake the tail");
        }
    }


}
