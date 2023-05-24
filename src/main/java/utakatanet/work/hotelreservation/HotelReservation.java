package utakatanet.work.hotelreservation;

import java.util.Date;

public class HotelReservation {
    private String playerName;
    private int roomNumber;
    private Date checkInDate;
    private Date checkOutDate;
    // コンストラクタとその他のメソッド

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

    public HotelReservation(String playerName, int roomNumber, Date checkInDate, Date checkOutDate) {
        this.playerName = playerName;
        this.roomNumber = roomNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
}
    // getter and setter methods
;