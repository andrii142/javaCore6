package module5.questions;

/**
 * Created by citsym on 24.02.17.
 */
public class RoomDAO {

    Room[] roomDB = new Room[10];


    Room save(Room room) {

        int count = getRoomsCount(roomDB);

        roomDB[count] = room;

        return room;
    }

    private int getRoomsCount(Room[] roomDB) {

        int count = 0;

        for (Room room : roomDB) {
            if (room != null) {
                count++;
            }
        }

        return count;
    }

    boolean delete(Room room) {

        for (int i = 0; i < roomDB.length; i++) {
            Room roomInDb = roomDB[i];

            if (room.equals(roomInDb)) {

                System.arraycopy(roomDB, i + 1, roomDB, i, roomDB.length - i - 1);

                roomDB[roomDB.length - 1] = null;
//
//                1 2 3 5 6 7 8 9 10 10
//
//                1 2 3 4 5 6 8 9 null null

            }

        }

    return true;
}

    Room update(Room room) {
        return null;
    }

    Room findById(long id) {

        for (Room room : roomDB) {
            if (room!=null && room.getId() == id ){
                return room;
            }
        }

        return null;
    }


}
