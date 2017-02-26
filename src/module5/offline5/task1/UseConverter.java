package module5.offline5.task1;

/**
 * Created by citsym on 23.02.17.
 */
public class UseConverter {

    public static void main(String[] args) {

        Converter converter = new Converter(27.1);

        System.out.println("USD: " + converter.convert(3000));
        System.out.println("USD: " + converter.convert(10000));
        System.out.println("USD: " + converter.convert(100_000));


    }
}
