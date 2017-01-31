package lesson7.lab.prob3;

interface Squeak extends QuackBehaviour {

    @Override
    default void quack() {
        System.out.println("Squeak...");
    }
    
}
