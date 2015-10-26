/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupparbete;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Niclas
 */
public class runProgram {

    private Console console = null;
    private String input;

    public runProgram() {

        Customer c = new Customer();
        Order o = new Order();
        File f = new File();
        Product p = new Product();

        space();
        System.out.println("           VÄLKOMMEN!\n");

        console = System.console();
        int menuItem = 1;

        while (menuItem != 0) {
            space();
            System.out.println("           VALMENY");
            System.out.println("------------------------------");
            System.out.println("  1. Köp produkt");
            System.out.println("  2. Kundregister");
            System.out.println("  3. Registrera kund");
            System.out.println("  4. Avregistrera kund");
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
                    System.out.println("KÖP PRODUKT\n");
                    
                  
                    
                    System.out.println(p.getProductID() + " - " + p.getProductName() + "\t" + p.getProducPrice() + " :-\n\n");
                    
                    System.out.println("Ange ditt kund-ID. Om du inte har ett kund-ID måste du först registrera dig som kund.");

                    int CustomerID, Quantity;

                    System.out.print("Kund-ID:\t");
                    CustomerID = Integer.valueOf(console.readLine());
                    System.out.print("Välj antal:\t");
                    Quantity = Integer.valueOf(console.readLine());
                    o.createOrder(CustomerID, Quantity);
                    
                    System.out.println("Kostnad:\t" + Quantity*p.getProducPrice());

                    System.out.println("\nTryck Enter för att återgå till startmenyn.");
                    if (console.readLine() == null) {
                        System.out.print("Error.");
                    } else {
                        break;
                    }

                case 2:

                    space();
                    System.out.println("KUNDREGISTER\n");

                    try {

                        InputStream strFil = new FileInputStream("Kundregister.txt");
                        BufferedReader br = new BufferedReader(new InputStreamReader(strFil));
                        while ((input = br.readLine()) != null) {
                            System.out.println(input);
                        }
                    } catch (Exception e) {
                        System.out.println("Hittar inga uppgifter som matchar inmatningen.");
                    }

                    System.out.println("\nTryck Enter för att återgå till startmenyn.");
                    if (console.readLine() == null) {
                        System.out.print("Error.");
                    } else {
                        break;
                    }

                case 3:
                    space();
                    System.out.println("REGISTRERA KUND\n");

                    String Name,
                     Address,
                     Phone;

                    System.out.print("Namn:\t\t");
                    Name = console.readLine();
                    System.out.print("Adress:\t\t");
                    Address = console.readLine();
                    System.out.print("Telefonnummer:\t");
                    Phone = console.readLine();

                    c.addCustomer(Name, Address, Phone);
                    c.printPerson();

                    int menuItem2 = 1;

                    while (menuItem2 != 2) {

                        System.out.println("\n   Stämmer uppgifterna?");
                        System.out.println("  1. Ja (Sparar uppgifter)");
                        System.out.println("  2. Nej (Börja om)");
                        System.out.print("\nVälj: ");

                        try {
                            if (console != null) {
                                input = console.readLine();
                                menuItem2 = Integer.parseInt(input);
                            }
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }

                        switch (menuItem2) {

                            case 1:

                                try (
                                        BufferedWriter out = new BufferedWriter(new FileWriter("Kundregister.txt", true))) {
                                    out.write("Namn:\t\t\t" + Name);
                                    out.write(System.lineSeparator());
                                    out.write("Adress:\t\t\t" + Address);
                                    out.write(System.lineSeparator());
                                    out.write("Telefonnummer:\t\t" + Phone);
                                    out.write(System.lineSeparator());
                                    out.write(System.lineSeparator());
                                    out.close();

                                } catch (IOException x) {
                                    System.err.format("IOException: %s%n", x);
                                }

                                System.out.println("\n\nKund tillagd.");

                                menuItem2 = 2;
                                break;

                            case 2:

                                break;

                            default:
                                System.out.println("\nOgiltigt val.\n");
                                break;
                        }

                    }

                    System.out.println("\nTryck Enter för att återgå till startmenyn.");
                    if (console.readLine() == null) {
                        System.out.print("Error.");
                    } else {
                        break;
                    }

                case 4:
                    space();
                    System.out.println("AVREGISTRERA KUND\n");

                    System.out.println("Kommer snart.");

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
