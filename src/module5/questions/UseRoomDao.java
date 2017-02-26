package module5.questions;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by citsym on 24.02.17.
 */
public class UseRoomDao {
    public static void main(String[] args) {

        System.out.println(new Date());

        SimpleDateFormat format = new SimpleDateFormat("mm:HH dd.MM.yyyy");

        Date newD = new  Date(-40, 0, 13);
        newD.setMonth();

        System.out.println(format.format(newD));

        System.out.println(newD.getTime());

        RoomDAO roomDAO = new RoomDAO();

        for (int i = 1; i < 11; i++) {
            Room room = creatRoom(i - 1, 100 * i, i);
            roomDAO.save(room);
        }

        roomDAO.delete(creatRoom(0, 200, 2));
        roomDAO.delete(creatRoom(0, 700, 7));


        for (int i = 0; i < 10; i++) {
            Room room = roomDAO.findById(i);
            if (room == null){
                System.out.println("No room with id " + i);
            } else {
                System.out.println("ROOM from DB: " + room.getId() + "price  " + room.getPrice());
            }
        }
    }

    private static Room creatRoom(int id, int price, int person) {
        Room room1 = new Room();
        room1.setId(id);
        room1.setPrice(price);
        room1.setCityName("Kiev");
        room1.setDateAvailableFrom(new Date());
        room1.setHotelName("Some");
        room1.setPersons(person);

        return room1;
    }
}
