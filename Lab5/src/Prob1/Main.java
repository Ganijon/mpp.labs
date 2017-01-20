/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob1;

/**
 *
 * @author 985484
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Duck[] ducks = {new MallardDuck(),new RedheadDuck(),new DecoyDuck(),new RubberDuck()} ;
        
        for(Duck d : ducks){
            System.out.println( d.getClass().getSimpleName()+":"   );
            d.display();
            d.fly();
            d.quack();
            d.Swim();
        }
    
    }
}
