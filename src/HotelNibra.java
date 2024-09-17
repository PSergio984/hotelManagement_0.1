import java.util.List;

public class HotelNibra {
    // Define a static field to hold the list of rooms
    public static List<Rooms> rooms;
    public static List<User> userList;
    // Method to initialize and return the list of rooms
    public static List<Rooms> getRooms() {
        if (rooms == null) {
            Hotel hotel = new Hotel();
            rooms = hotel.readRoomData("ROOMS.txt");
        }
        return rooms;
    }
      // Method to initialize and return the list of users
    public static List<User> getUsers() {
        if (userList == null) {
            User user = null;
            userList = user.readUserData("users.txt");
        }
        return userList;
    }

    public static void main(String[] args) {
      

        // Retrieve the list of rooms using the static method
        List<Rooms> rooms = HotelNibra.getRooms();
        
         // Retrieve the list of users using the static method
        List<User> userList = getUsers();

       for (User user : HotelNibra.userList) {
            System.out.println(user.toString());
        }
       loadingScreen LoadingScreen = new loadingScreen();
      LoadingScreen.setVisible(true);
    //HomePage HomePage = new HomePage();
     //HomePage.setVisible(true);
      
       
    }
}