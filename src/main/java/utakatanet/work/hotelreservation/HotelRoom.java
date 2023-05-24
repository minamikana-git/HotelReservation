package utakatanet.work.hotelreservation;

import java.time.LocalDate;

public class HotelRoom {
    private int roomNumber;
    private int price;
    private boolean isAvailable;

    public HotelRoom(int roomNumber, int price, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        HotelRoom room = new HotelRoom(123, 100, true);
        hotel.addRoom(room);

        boolean isAvailable = hotel.isRoomAvailable(room.getRoomNumber(), LocalDate.now(), LocalDate.now().plusDays(7));
        System.out.println("Is room available: " + isAvailable);
    }
}

