package task;
/**
 *
 * @author Zhanbolot Bakytbek uulu
 */
public class ContactsManager {
    Contacts[] mycontacts = new Contacts[100];
    private int ind;
    public void addContact(Contacts info){
        mycontacts[ind] = info;
        ind ++;
    }
    public void searchContact(String srch_name){
        for (int person  = 0;person < ind ; person++){
            if (mycontacts[person].name.equals(srch_name)){
                           System.out.println(mycontacts[person].phoneNumber);
                           return ;
            }
        }
        System.out.println("We Can't find number");
    }
    public void all_my_contacts(){
        for (int person  = 0;person < ind ; person++){
            System.out.println(mycontacts[person].name + " "+ mycontacts[person].phoneNumber);
        }
    } 
}
