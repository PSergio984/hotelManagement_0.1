
/**
 *
 * @author Eric
 */
public interface Informations {

    int getRoomNumber();

    void setRoomNumber(int roomNumber);

    roomType getType();

    void setType(roomType type);

    int getPrice();

    void setPrice(int price);

    RoomSize getSize();

    void setSize(RoomSize size);

    String getCheckInDate();

    void setCheckInDate(String checkInDate);

    String getCheckOutDate();

    void setCheckOutDate(String checkOutDate);

    String getReservationStatus();

    void setReservationStatus(String reservationStatus);
    
    public void setImage(checkInUI checkInUI);

}
