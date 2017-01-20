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
class RubberDuck extends Duck{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
		System.out.println("Cannot Flying");
	}
	
        @Override
    public void display(){
		
		System.out.println("displaying");
	}
    
    
	@Override
	public void quack() {
	// TODO Auto-generated method stub
		System.out.println("Squeaking");
	}
	
}

