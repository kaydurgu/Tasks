/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

/**
 *
 * @author Zhanbolot Bakytbek uulu
 */

public class Task {

    public static void main(String[] args) {
         //Creating contacts
         Contacts Zhan = new Contacts("Zhanbolot" , "+996222964252");
         Contacts Ruslan_agay = new Contacts("Ruslan Agay" , "+999700000000");
           
         //Checking Setters    
         Contacts Zheenbekov = new Contacts();
            Zheenbekov.setName("Sooronbay");
            Zheenbekov.setPhoneNumber("+996700111111");
            
         //Creating my ContactsManager
         ContactsManager my  = new ContactsManager();
         
         //Adding Contacts to my ContactsManager  
         my.addContact(Zhan);
         my.addContact(Ruslan_agay);
         my.addContact(Zheenbekov);
         //searching Contacts in my ContactsManager
         my.searchContact("Zhanbolot");
         my.searchContact("Mr President");
         
         //List of all contacts 
         my.all_my_contacts();
    }
}
