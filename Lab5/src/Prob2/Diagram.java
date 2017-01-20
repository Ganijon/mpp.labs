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
public class Diagram {
    Triangle t;
    Circle c;
    Rectangle r;

    public Diagram(Triangle t, Circle c, Rectangle r) {
        this.t = t;
        this.c = c;
        this.r = r;
    }
    
    public double sumArea(){
        return t.computeArea()+c.computeArea()+r.computeArea();
    }
}
