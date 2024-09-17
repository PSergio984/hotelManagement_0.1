import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//importing

public class Hotel {
    
     // Method to read room data from the file and create Room objects
    public static List<Rooms> readRoomData(String filename) {
        List<Rooms> roomsList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] attributes = line.split(",");

                // Parse attributes
                int roomNumber = Integer.parseInt(attributes[0]);
                roomType type = roomType.valueOf(attributes[1]);
                int  price = Integer.parseInt(attributes[2]);
                RoomSize size = RoomSize.valueOf(attributes[3]);
                String checkInDate = attributes[4];
                String checkOutDate = attributes[5];
                String reservationStatus = attributes[6];
                

                // Create room object based on room type
                switch (type) {
                    case ECONOMY:
                        Economy economyRoom = new Economy(roomNumber, type,  price, size, checkInDate, checkOutDate, reservationStatus);
                        roomsList.add(economyRoom);
                        break;
                    case STANDARD:
                        Standard standardRoom = new Standard(roomNumber, type,  price, size, checkInDate, checkOutDate, reservationStatus);
                        roomsList.add(standardRoom);
                        break;
                    case DELUXE:
                        Deluxe deluxeRoom = new Deluxe(roomNumber, type,  price, size, checkInDate, checkOutDate, reservationStatus);
                        roomsList.add(deluxeRoom);
                        break;
                    default:
                        System.out.println("Invalid room type");
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return roomsList;
    }


}
