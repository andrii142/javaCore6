package module10.webinare;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by citsym on 10.04.17.
 */
public class UseResources {
    public static void main(String[] args) throws IOException {

        try (FileInputStream fs = new FileInputStream("resources/ourProperties.properties"); BufferedReader bf = new BufferedReader(new FileReader("resources/ourProperties.properties"))) {

//        int k;
//        char symbol;
//
//        while ((k = fs.read()) != -1) {
//
//            symbol = (char) k;
//
//            System.out.print(symbol);
//
//        }

            Properties properties = new Properties();
            properties.load(fs);

            System.out.println(properties.getProperty("userName", "default"));


            ////            bf.lines().forEach(System.out::println);

            String readLine = "";
            while (readLine != null) {
                readLine = bf.readLine();
                System.out.println(readLine);

            }

//        fs.close();
        }

//        try (BufferedReader bf = new BufferedReader(new FileReader("resources/ourProperties.properties"))) {
//

//
//
//        }


    }


}
