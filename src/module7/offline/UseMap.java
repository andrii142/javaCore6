package module7.offline;

import java.util.*;

/**
 * Created by citsym on 23.03.17.
 */
public class UseMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        Map treeMap = new TreeMap();

        Map linkedMap = new LinkedHashMap();

        calculateClassRoom(map);

//        linkedMap = map;
    }

    private static void calculateClassRoom(Map<String, Integer> map) {
        String lastName = "Okun";

        map.put("Anopko" , 1 );
        map.put("Voronov" , 2 );
        map.put("Nikopelskaya" , 1 );
        map.put("Marshal" , 3 );
        map.put(lastName , 3 );




        for (String key : map.keySet()) {

            System.out.println(key + " teaching in " + map.get(key) + " class");

        }
    }
}
