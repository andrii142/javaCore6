package module5.questions;

import java.util.Date;

/**
 * Created by citsym on 24.02.17.
 */
public class Room {

    long id;
    int price;
    int persons;
    Date dateAvailableFrom;
    String hotelName;
    String cityName;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (getPrice() != room.getPrice()) return false;
        if (getPersons() != room.getPersons()) return false;
        return !(getCityName() != null ? !getCityName().equals(room.getCityName()) : room.getCityName() != null);

    }

    @Override
    public int hashCode() {
        int result = getPrice();
        result = 31 * result + getPersons();
        result = 31 * result + (getCityName() != null ? getCityName().hashCode() : 0);
        return result;
    }
}
