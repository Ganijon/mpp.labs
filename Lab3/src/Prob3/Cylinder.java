/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob3;

/**
 *
 * @author 985484
 */
public class Cylinder {
    private Circle circle;
    private double hieght;

    public Cylinder() {
      
        this.hieght = 1.0;    
    }

    public Cylinder(double radius) {
        circle = new Circle(radius);
        this.hieght = 1.0;
    }
    public Cylinder(double radius, double hieght) {
        this.circle = new Circle(radius);
        this.hieght = hieght;
    }

    public double getHieght() {
        return hieght;
    }

    public double getVolume() {
       
       return circle.getArea()*hieght;
    }
    
    
}
