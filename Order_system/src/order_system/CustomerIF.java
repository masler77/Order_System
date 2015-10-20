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
public interface CustomerIF {
    
    public void addCustomer(String Name, String Address, String Phone);
    public void findCustomer();
    public void deleteCustomer();
    
}
