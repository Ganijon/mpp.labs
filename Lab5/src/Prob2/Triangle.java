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
public final class Triangle implements Figure {
 
    private final double base;
    private final double hieght;
    
    public Triangle(double base, double hieght) {
        this.base = base;
        this.hieght = hieght;
    }

    @Override
    public final double computeArea() {
    
        return 0.5*base*hieght;
    }

    public double getBase() {
        return base;
    }

    public double getHieght() {
        return hieght;
    }
    
   
    
    
}
