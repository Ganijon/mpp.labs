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
public final class Circle implements Figure {

    private final double radius;

    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    
    @Override
    public final double computeArea() {
    
        return Math.PI*Math.pow(radius, 2);
    }
    
}
