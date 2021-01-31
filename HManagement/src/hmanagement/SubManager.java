package hmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SubManager  extends Person implements ManagerInterface {
    private String UserName,Password;
    protected SubManager(){
        super();
    }
    @Override
    public void set_UserName(String n){
        UserName=n;
    }
    @Override
    public String get_UserName(){
        return UserName;
    }
    @Override
    public void set_Password(String n){
        Password=n;
    }
    @Override
    public String get_Password(){
        return Password;
    }
    @Override
    public void save_Manager(){
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = SQLiteDBConnection.connect();
        String sql = "Insert Into Manager (Name,NID,Phone,Age,Address,UserName,Password)Values(?,?,?,?,?,?,?);";
        try {
            try (PreparedStatement pst = c.prepareStatement(sql)) {
                pst.setString(1, get_Name());
                pst.setString(2, get_NID()); 
                pst.setString(3, get_Phone());
                pst.setString(4, get_Age());
                pst.setString(5, get_Address());
                pst.setString(6, get_UserName());
                pst.setString(7,get_Password());
                pst.executeUpdate();
                System.out.println("save successfull");
            }
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Records created successfully");
    }
}
