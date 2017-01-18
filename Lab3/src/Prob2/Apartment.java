/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob2;

/**
 *
 * @author 985484
 */
class Apartment {
    private String apartmentName;
    private double rent;

    public Apartment(String apartmentName, double rent) {
        this.apartmentName = apartmentName;
        this.rent = rent;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }
    
    
    
    
}
