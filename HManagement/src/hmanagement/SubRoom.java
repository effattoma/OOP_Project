package hmanagement;
public class SubRoom extends Person {
    private String Room,Type,Status;
    protected SubRoom(){
        super();
    }
    protected void set_Room(String n){
        Room=n;
    }
    protected String get_Room(){
        return Room;
    }
    protected void set_Type(String n){
        Type=n;
    }
    protected String get_Type(){
        return Type;
    }
    protected void set_Status(String n){
        Status=n;
    }
    protected String get_Status(){
        return Status;
    }
}
