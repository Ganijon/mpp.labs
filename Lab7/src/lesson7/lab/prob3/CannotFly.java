package lesson7.lab.prob3;

interface CannotFly extends FlyBehaviour {

    @Override
    default void fly() {
        System.out.println("Can't fly...");
    }
    
}
