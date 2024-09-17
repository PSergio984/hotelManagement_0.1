
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Rooms implements Informations{

  

    //attributes
    int roomNumber;
    private roomType type;
    private int price;
    private RoomSize size;
    private ImageIcon image;
    String checkInDate;
    String checkOutDate;
    String reservationStatus;
    private String special;

    // Constructor
    public Rooms(int roomNumber, roomType type, int price, RoomSize size, String checkInDate, String checkOutDate, String reservationStatus) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.size = size;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.reservationStatus = reservationStatus;
        
    }
    public String toString() {
        return roomNumber + "," + String.valueOf(type) + "," + price + "," + size + "," +
               checkInDate + "," + checkOutDate + "," + reservationStatus;
    }

    // Getters and setters for all attributes
    @Override
    public int getRoomNumber() {
        return roomNumber;
    }
    
     @Override
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    
     @Override
    public roomType getType() {
        return type;
    }
    
     @Override
    public void setType(roomType type) {
        this.type = type;
    }
    
     @Override
    public int getPrice() {
        return price;
    }
    
     @Override
    public void setPrice(int price) {
        this.price = price;
    }
    
     @Override
    public RoomSize getSize() {
        return size;
    }
    
     @Override
    public void setSize(RoomSize size) {
        this.size = size;
    }
    
    
    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
    
     @Override
    public String getCheckInDate() {
        return checkInDate;
    }
    
     @Override
    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }
    
     @Override
    public String getCheckOutDate() {
        return checkOutDate;
    }
    
     @Override
    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
    
     @Override
    public String getReservationStatus() {
        return reservationStatus;
    }
    
     @Override
    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }
    

    public String getSpecial() {
        return special;
    }
    
    public void setSpecial(String special) {
        this.special = special;
    }
    public ImageIcon scaleImageIcon(ImageIcon icon, JLabel label) { //scaling the image icon 
        Icon i = icon;
        ImageIcon imgIcon = (ImageIcon) i;
        Image image = imgIcon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }
    public abstract void displayDescription(checkInUI checkInUI);
}
