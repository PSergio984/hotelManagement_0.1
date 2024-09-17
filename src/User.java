
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class User {
    private String name;
    private String phone;
    private String email;
    private String nationality;
    private String cardNo;
    private String cvc;
    private String gender;
    private int roomCheckIn;

    // Constructor when the user didn't check in
    public User(String name, String phone, String email, String nationality, String cardNo, String cvc,String gender) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.nationality = nationality;
        this.cardNo = cardNo;
        this.cvc = cvc;
        this.gender = gender;
    }
    
    //unparameterized constructor to be able to call without parameters
    public User(){
        
    }
    
     public User(String name, String phone, String email, String nationality, String cardNo, String cvc,String gender,int roomCheckIn) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.nationality = nationality;
        this.cardNo = cardNo;
        this.cvc = cvc;
        this.gender = gender;
        this.roomCheckIn = roomCheckIn;
    }
     // Method to retrieve the user associated with a room
    public static User getUserForRoom(int roomNumber) {
        for (User user : HotelNibra.userList) {
            if (user.getroomCheckIn() == roomNumber) {
                return user;
            }
        }
        return null; // No user found for the given room
    }
   
        
      public static List<User> readUserData(String filename) {
        List<User> userList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] attributes = line.split(",");

                // Parse attributes
                String name = attributes[0];
                String phone = attributes[1];
                String email = attributes[2];
                String nationality = attributes[3];
                String cardNo = attributes[4];
                String cvc = attributes[5];
                String gender = attributes[6];
                int roomCheckIn = Integer.parseInt(attributes[7]);
                
                // Create user object
                try{
                     User user = new User(name, phone, email, nationality, cardNo, cvc,gender,roomCheckIn);
                     userList.add(user);
                }catch(Exception e){
                User user = new User(name, phone, email, nationality, cardNo, cvc,gender);
                userList.add(user);
                }
                
               
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return userList;
    }
      
     public String toString() {
    return name + "," + phone + "," + email + "," + nationality + "," +
           cardNo + "," + cvc + "," + gender+","+roomCheckIn;
}

public void updateUsersTextFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true)); // Append mode
            User user = HotelNibra.userList.get(HotelNibra.userList.size() - 1); // Get the last added user
            writer.write(user.toString()); // Append user information to the file
            writer.newLine(); // Add a new line
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

public void updateUsersTextFiles() {
    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt"));
        for (User user : HotelNibra.userList) {
            writer.write(user.toString());
            writer.newLine();
        }
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    // Getters and setters for user properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }
    public int getroomCheckIn() {
        return roomCheckIn;
    }

    public void setroomCheckIn(int roomCheckIn) {
        this.roomCheckIn = roomCheckIn;
    }
    

    
}
