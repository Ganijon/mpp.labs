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
public class Main {
    
    public static void main(String args[]){

        Triangle t = new Triangle(4,9);
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4,8);
        
        Diagram d= new Diagram(t,c,r);
        
        System.out.println("Sum of Area is: " +d.sumArea() );
    }
    
}
