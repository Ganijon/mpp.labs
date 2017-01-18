/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob2;

import java.awt.BorderLayout;

/**
 *
 * @author 985484
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Apartment apt1= new Apartment("Apt 1",234);
        Apartment apt2= new Apartment("Apt 2",244);
        Apartment apt3= new Apartment("Apt 3",235);
        Apartment apt4= new Apartment("Apt 4",434);
        Apartment apt5= new Apartment("Apt 5",224);
        Apartment apt6= new Apartment("Apt 6",214);
        
        Building bld1 = new Building("Building 1",apt1,56);
        Building bld2 = new Building("Building 2",apt2,36);
        Building bld3 = new Building("Building 1",apt3,59);
        
        bld1.addApartment(apt6);
        bld2.addApartment(apt4);
        bld1.addApartment(apt5);
        
        LandOwner owner = new LandOwner("Saif",bld1);
        owner.addBuildings(bld2);
        owner.addBuildings(bld3);
        
        System.out.println("Owner: "+owner.getOwnerName()+" has $"+owner.calculateProfit()+" profit.");
        
        
        
    }
    
}
