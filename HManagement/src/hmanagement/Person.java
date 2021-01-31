package hmanagement;
public class Person {
    private String Name,NID,Phone,Address;
    private String Age;
    protected void set_Name(String n){
        Name=n;
    }
    protected String get_Name(){
        return Name;
    }
    protected void set_NID(String n){
        NID=n;
    }
    protected String get_NID(){
        return NID;
    }
    protected void set_Phone(String n){
        Phone=n;
    }
    protected String get_Phone(){
        return Phone;
    }
    protected void set_Address(String n){
        Address=n;
    }
    protected String get_Address(){
        return Address;
    }
    protected void set_Age(String n){
        Age=n;
    }
    protected String get_Age(){
        return Age;
    }
}
