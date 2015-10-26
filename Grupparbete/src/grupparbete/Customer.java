/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupparbete;

/**
 *
 * @author Niclas
 */
public class Customer {

    int CustomerID;
    String customerName, customerAddress, customerPhone;

    public void addCustomer(String Name, String Address, String Phone) {
        this.customerName = Name;
        this.customerAddress = Address;
        this.customerPhone = Phone;
        this.CustomerID = 100001;
    }

    public void findCustomer(int CustomerID) {
    
        
    }
/*
   public void deleteCustomer() {
    }
*/
    public String getName() {
        return this.customerName;
    }

    public String getAddress() {
        return this.customerAddress;
    }

    public String getPhone() {
        return this.customerPhone;
    }
    
    public int getID() {
        return this.CustomerID;
    }
    
    public void printPerson() {
        System.out.println("\n\nKONTROLL AV UPPGIFTER\n");
        System.out.println("Namn:\t\t\t" + getName());
        System.out.println("Adress:\t\t\t" + getAddress());
        System.out.println("Telefonnummer:\t\t" + getPhone());
        System.out.println("KundID:\t\t\t" + getID());
        
    }

}
    

