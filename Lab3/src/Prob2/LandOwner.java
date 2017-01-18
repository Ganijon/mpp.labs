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
public class LandOwner {
    
    private String ownerName;
    private ArrayList<Building> buildings;
    

    public LandOwner(String name,Building obj) {
       
        this.ownerName = name;
        this.buildings = new ArrayList<>() ;
        buildings.add(obj);
        
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void addBuildings(Building building) {
        this.buildings.add(building);
    }

    public String getOwnerName() {
        return ownerName;
    }

    

   

    public double calculateProfit() {
        
        double profit=0;
        
        for(int i = 0; i< buildings.size();i++){
            
            for(int j = 0 ; j<buildings.get(i).getApartments().size();j++){
                profit = profit+buildings.get(i).getApartments().get(j).getRent();
            }
            
            profit = profit - buildings.get(i).getMaintainanceCost();
        }
        
        return profit;
    }
    
    
    
    
}
