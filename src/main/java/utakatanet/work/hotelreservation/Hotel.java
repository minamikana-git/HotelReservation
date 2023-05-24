package utakatanet.work.hotelreservation;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

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

    public boolean isRoomAvailable(int roomNumber, LocalDate checkInDate, LocalDate checkOutDate) {
        for (HotelReservation reservation : reservations) {
            if (reservation.getRoomNumber() == roomNumber) {
                LocalDate reservationCheckInDate = convertToLocalDate(reservation.getCheckInDate());
                LocalDate reservationCheckOutDate = convertToLocalDate(reservation.getCheckOutDate());

                if ((checkInDate.isAfter(reservationCheckInDate) && checkInDate.isBefore(reservationCheckOutDate)) ||
                        (checkOutDate.isAfter(reservationCheckInDate) && checkOutDate.isBefore(reservationCheckOutDate)) ||
                        (checkInDate.isBefore(reservationCheckInDate) && checkOutDate.isAfter(reservationCheckOutDate))) {
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

    private LocalDate convertToLocalDate(java.util.Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        List<HotelReservation> reservations = hotel.getReservations();
        List<HotelRoom> rooms = hotel.getRooms();

        // 以下に必要な処理を追加してください
    }
}
