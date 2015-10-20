/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order_system;

/**
 *
 * @author macbook
 */
public class Customer implements CustomerIF {
    int CustomerID;
    String customerName, customerAddress, customerPhone;
    
    public void addCustomer(String Name, String Address, String Phone) {
        this.customerName = Name;
        this.customerAddress = Address;
        this.customerPhone = Phone;
        //CustomerID
    }
        
    public void findCustomer(){}
    
    public void deleteCustomer(){}
        
    
}
