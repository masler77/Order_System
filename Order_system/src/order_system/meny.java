/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order_system;


class meny{
    
    public meny(){
//Print menu
    System.out.println("Order menue  \n-----------");
    
    System.out.println("   1. Customer");
    System.out.println("   2. Product search");
    System.out.println("   3. New order");
    
    System.out.println("   0. Quit");
    
    boolean quit = false;
    int menuItem = 0;
   
    
    while(menuItem != 0){
    
    System.out.println("Choosen menu item:");
    
    
        switch (menuItem) {

                case 1:
                    System.out.println("Customer ID");
                    
                    break;
                case 2:
                    System.out.println("Product search");
                    // Kommandon fˆr meny
                    break;
                case 3:
                    System.out.println("Order");
                    // Kommandon fˆr meny
                    break;
                case 0:

                    quit = true;
                    System.out.println("\n Bye Bye");

                    break;

                default:

                    System.out.println("Invalid choice."); 
             }
        }
    }
}   