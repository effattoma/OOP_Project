package hmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookRoom implements BookroomInterface {
    private String Room,RoomType,Name,NID,Age,Address,Phone,Status;
    @Override
    public void set_Name(String n){
        Name=n;
    }
    @Override
    public String get_Name(){
        return Name;
    }
    @Override
    public void set_NID(String n){
        NID=n;
    }
    @Override
    public String get_NID(){
        return NID;
    }
    @Override
    public void set_Phone(String n){
        Phone=n;
    }
    @Override
    public String get_Phone(){
        return Phone;
    }
    @Override
    public void set_Address(String n){
        Address=n;
    }
    @Override
    public String get_Address(){
        return Address;
    }
    @Override
    public void set_Age(String n){
        Age=n;
    }
    @Override
    public String get_Age(){
        return Age;
    }
    @Override
    public void set_Room(String n){
        Room=n;
    }
    @Override
    public String get_Room(){
        return Room;
    }
    @Override
    public void set_RoomType(String n){
        RoomType=n;
    }
    @Override
    public String get_RoomType(){
        return RoomType;
    }
    @Override
    public void set_Status(String n){
        Status=n;
    }
    @Override
    public String get_Status(){
        return Status;
    }
    @Override
    public void save_BookRoom(){
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = SQLiteDBConnection.connect();
        String sql = "Update bookroom set Name=?, Age=?,"
                + " Address=?,Phone=?, Status='Not Avaliable' where Room=?;";
        try {
            try (PreparedStatement pst = c.prepareStatement(sql)) {
                pst.setString(1, Name);
                pst.setString(2, Age); 
                pst.setString(3, Address);
                pst.setString(4, Phone);
                pst.setString(5, Room);
                pst.executeUpdate();
                System.out.println("save successfull");
            }
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Records created successfully");
    }
    @Override
    public void cheackout(){
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = SQLiteDBConnection.connect();
        
        String sql = "Update bookroom set Name='', Age='',"
                + " Address='',Phone='', Status='Avaliable' where Room=?;";
        try {
            try (PreparedStatement pst = c.prepareStatement(sql)) {
                pst.setString(1, Room);
                pst.executeUpdate();
                System.out.println("save successfull");
            }
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Records created successfully");
    }
}
