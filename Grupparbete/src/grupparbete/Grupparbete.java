/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupparbete;

import java.io.Console;
import java.util.ArrayList;

/**
 *
 * @author Niclas
 */
//Interface
interface CustomerIF {

    public void addCustomer(String Name, String Address, String Phone);

    public void findCustomer();

    public void deleteCustomer();

}

interface ProductIF {

    public void productList();

}

interface OrderIF {

    public void createOrder();
}

//Slut Interface
class Customer implements CustomerIF {

    int CustomerID;
    String customerName, customerAddress, customerPhone;

    public void addCustomer(String Name, String Address, String Phone) {
        this.customerName = Name;
        this.customerAddress = Address;
        this.customerPhone = Phone;
        //CustomerID
    }

    public void findCustomer() {
    }

    public void deleteCustomer() {
    }

}

class Product implements ProductIF {

    int productID;
    String productName;
    double productPrice;

    public void productList() {

        for (int i = 0; i < 20; i++) {

            System.out.println(i + " Produkt " + i + "\t\tPris");

        }
    }

    public void getProduct() {

    }

}

class Order implements OrderIF {

    int orderID, customerID, productID;

    public void createOrder() {
    }
}

class runProgram {

    private Console console = null;
    private String input;

    public runProgram() {

        Customer c = new Customer();
        Order o = new Order();
        Product p = new Product();

        System.out.println("\n  VÄLKOMMEN!\n");

        console = System.console();
        int menuItem = 1;

        while (menuItem != 0) {

            System.out.println("           VALMENY");
            System.out.println("------------------------------");
            System.out.println("  1. Produktlista");
            System.out.println("  2. Registrera kund");
            System.out.println("  3. ");
            System.out.println("  4. ");
            System.out.println("-------------------------------");
            System.out.println("  0. Avsluta");

            System.out.print("\nVälj:\t");

            try {
                if (console != null) {
                    input = console.readLine();
                    menuItem = Integer.parseInt(input);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            space();
            switch (menuItem) {

                case 1:
                    space();
                    System.out.println("PRODUKTLISTA\n");
                    p.productList();


                    

                    System.out.println("\nTryck Enter för att återgå till startmenyn.");
                    if (console.readLine() == null) {
                        System.out.print("Error.");
                    } else {
                        break;
                    }

                case 2:

                    System.out.println("\nTryck Enter för att återgå till startmenyn.");
                    if (console.readLine() == null) {
                        System.out.print("Error.");
                    } else {
                        break;
                    }

                case 3:

                    System.out.println("\nTryck Enter för att återgå till startmenyn.");
                    if (console.readLine() == null) {
                        System.out.print("Error.");
                    } else {
                        break;
                    }

                case 4:

                    System.out.println("\nTryck Enter för att återgå till startmenyn.");
                    if (console.readLine() == null) {
                        System.out.print("Error.");
                    } else {
                        break;
                    }

                case 0:

                    System.out.println("\nAVSLUTAR.\n");
                    break;

                default:

                    System.out.println("\nOgiltigt val.\n");
                    break;
            }

        }
    }

    private void space() {

        System.out.println("\n\n\n\n\n");
    }

}

public class Grupparbete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        runProgram n = new runProgram();

    }

}
