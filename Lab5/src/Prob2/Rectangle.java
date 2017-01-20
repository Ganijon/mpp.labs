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
public final class Rectangle implements Figure{

    private final double Length;
    private final double Width;

    public Rectangle(double Length, double Width) {
        this.Length = Length;
        this.Width = Width;
    }

    public double getLength() {
        return Length;
    }

    public double getWidth() {
        return Width;
    }
    
    
    
    @Override
    public final double computeArea() {
        return Length*Width;
    }
    
}
