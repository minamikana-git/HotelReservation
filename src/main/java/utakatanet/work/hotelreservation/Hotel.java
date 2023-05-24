package utakatanet.work.hotelreservation;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import utakatanet.work.hotelreservation.HotelReservation;
public class Hotel {
    private List<HotelReservation> reservations;
    private List<HotelRoom> rooms;

    public Hotel() {
        reservations = new ArrayList<>();
        rooms = new ArrayList<>();
    }

    public void addReservation(HotelReservation reservation) {
        reservations.add(reservation);
    }

    public void addRoom(HotelRoom room) {
        rooms.add(room);
    }

    public List<HotelReservation> getReservations() {
        return reservations;
    }

    public List<HotelRoom> getRooms() {
        return rooms;
    }

    public boolean isRoomAvailable(int roomNumber, Date checkInDate, Date checkOutDate) {
        for (HotelReservation reservation : reservations) {
            if (reservation.getRoomNumber() == roomNumber) {
                if ((checkInDate.after(reservation.getCheckInDate()) && checkInDate.before(reservation.getCheckOutDate())) ||
                        (checkOutDate.after(reservation.getCheckInDate())
                                && checkOutDate.before(reservation.getCheckOutDate()))) {
                    return false;
                }
            }
        }
        for (HotelRoom room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room.isAvailable();
            }
        }
        return false;
    }
}

