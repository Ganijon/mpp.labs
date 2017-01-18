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
public class Circle {
    
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = new String("red");
    }
    
    public Circle(double radius) {
        this.radius = radius;
        this.color = new String("red");
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        
        return Math.PI*Math.pow(radius,2);
    }
    
    
}
