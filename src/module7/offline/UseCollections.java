package module7.offline;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by citsym on 09.03.17.
 */
public class UseCollections {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add(new String("Some"));
        linkedList.add("Some");
        linkedList.add("Some1");
        linkedList.add("Some");

        linkedList.set(1, null);

        List arrayList = new ArrayList(linkedList);

        linkedList.set(0, "Other");


        for (Object o : arrayList) {
            if (o!=null) {
                System.out.println(o.getClass());
            }
        }



    }
}
