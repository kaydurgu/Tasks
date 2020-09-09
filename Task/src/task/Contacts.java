package task;
/**
 *
 * @author Zhanbolot
 */
public class Contacts {
   String name;
   String phoneNumber;
    public Contacts(String name , String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public Contacts() {  
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}
