/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob2;

import java.util.ArrayList;

/**
 *
 * @author 985484
 */
class Building {
    
    private String buildingName;
    private ArrayList<Apartment> apartments;
    private double maintainanceCost;

    public Building(String buildingName, Apartment apartment, double maintainanceCost) {
        this.buildingName = buildingName;
        this.apartments = new ArrayList<>();
        apartments.add(apartment);
        this.maintainanceCost = maintainanceCost;
    }

    public String getBuildingName() {
        return buildingName;
    }

   

    public ArrayList<Apartment> getApartments() {
        return apartments;
    }

    public void addApartment(Apartment apartment) {
        this.apartments.add(apartment);
    }

    public double getMaintainanceCost() {
        return maintainanceCost;
    }

    public void setMaintainanceCost(double maintainanceCost) {
        this.maintainanceCost = maintainanceCost;
    }
    
    
}
