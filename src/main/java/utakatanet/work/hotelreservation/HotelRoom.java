package utakatanet.work.hotelreservation;

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

    public boolean isAvailable() {
        return isAvailable;
    }
}

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    private int roomNumber;
    private boolean isAvailable;

    // コンストラクタとその他のメソッド

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    // getter and setter methods
}