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
abstract class Duck implements FlyBehaviour, QuackBehavior{
	
    abstract public void display();  
    @Override
    abstract public void quack();
    public void Swim(){
		
		System.out.println("Swim");
	}
    


	
	
}
