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


class Product implements ProductIF { 
   String cykel,bil,motorcykel;
   //set för produkter
   public void setCykel     (String cyklar)       {  cykel      = cyklar;      } 
   public void setBil       (String bilar)        {  bil        = bilar;       }
   public void setMotorcykel(String motorcyklar)  {  motorcykel = motorcyklar; }
   //get för produkter
   public String getCykel()       { return cykel;      }
   public String getBil()         { return bil;        }
   public String getMotorcykel()  { return motorcykel; }         
   
   public void printprodukter(){System.out.println("??");}
}



