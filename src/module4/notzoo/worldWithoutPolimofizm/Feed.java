package module4.notzoo.worldWithoutPolimofizm;

/**
 * Created by citsym on 16.02.17.
 */
public class Feed {

    public static void main(String[] args) {




        Object[] array = new Object[3];

        array[0] = new Cat();

        array[1] =  new Dog();

        array[2] =  new Dragon();

        feedAll(array);



    }

    private static void feedAll(Object[] array) {
        for (Object o : array) {
            if (o instanceof Dog){
                Dog dog = (Dog)o;
                dog.nyamNyam();
            }

            if (o instanceof Cat){
                Dog dog = (Dog)o;
                dog.nyamNyam();
            }

            if (o instanceof Dog){
                Dog dog = (Dog)o;
                dog.nyamNyam();
            }

        }
    }

}
