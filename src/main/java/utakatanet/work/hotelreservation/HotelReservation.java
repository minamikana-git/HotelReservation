package utakatanet.work.hotelreservation;

import java.util.Date;
import java.util.List;

public class HotelReservation {
    private String playerName;
    private int roomNumber;
    private Date checkInDate;
    private Date checkOutDate;

    public HotelReservation(String playerName, int roomNumber, Date checkInDate, Date checkOutDate) {
        this.playerName = playerName;
        this.roomNumber = roomNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }
}
    public void addReservation() {
       return addReservation;
    }

    public void addRoom() {
       return addRoom;
    }
    public List getReservations() {
       return getReservations;
    }
    public Date isRoomAvailable() {
       return isRoomAvailable;
    }
}
