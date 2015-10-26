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
public class Order {

    int customerID, quantity;
    int stock = 200;


    public void createOrder(int CustomerID, int Quantity) {
       
        
       this.customerID = CustomerID;
       this.quantity = Quantity;
        


    }
}
