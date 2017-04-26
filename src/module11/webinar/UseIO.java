package module11.webinar;

import module9.offline.Car;
import module9.offline.Engine;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by citsym on 26.04.17.
 */
public class UseIO {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        OutputStream out = new FileOutputStream("test.txt");
//
//        InputStream in = System.in;
//        int byteValue1;
//        while ((byteValue1 = in.read())!=-1) {
//            out.write( byteValue1);
//
//            if ((char)byteValue1 == 'q') {
//                break;
//            }
//        }
//        out.close();
//        in.close();
//
//        FileReader fileReader = new FileReader("test.txt");
//
//        int byteValue2;
//        while ((byteValue2 = fileReader.read())!=-1) {
//            System.out.print((char)byteValue2);
//        }


        // console read/ write symbols not bytes
//
//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//
//        int byteValue2;
//        while ((byteValue2 = inputStreamReader.read())!=-1) {
//            System.out.print((char)byteValue2);
//        }

//        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test.txt")));
//             BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));) {
//
//            String line = bf.readLine();
//            while (!line.equals("exit")) {
//                System.out.println(line);
//
//                bufferedWriter.write(line);
//                bufferedWriter.newLine();
////            bufferedWriter.flush();
//
//                line = bf.readLine();
//            }
//
////        bufferedWriter.close();
//        }

//        try (RandomAccessFile fileProcessor = new RandomAccessFile("test.txt", "rw")) {
//            fileProcessor.write("Test line 1".getBytes());
//            fileProcessor.write(10);
//            fileProcessor.write("Test line 2".getBytes());
//            fileProcessor.seek(0);
//            fileProcessor.write("на русском".getBytes());
//
//            fileProcessor.seek(0);
//
//
//        }


        Car myCar = new Car();
        myCar.setName("Моя машина");

        Engine engine = new Engine();
        engine.setValue(10);
        Car yourCar = new Car(engine);
        yourCar.setName("Твоя машина");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.txt"))) {
            out.writeObject(myCar);
            out.writeObject(yourCar);
        }


        try (ObjectInputStream out = new ObjectInputStream(new FileInputStream("test.txt"))) {
            Car myCarCopy = (Car) out.readObject();
            Car yourCarCopy = (Car) out.readObject();

            System.out.println(myCarCopy.getName());
            System.out.println(yourCarCopy.getName());
            System.out.println(yourCarCopy.getEngine().getValue());
        }

    }
}
