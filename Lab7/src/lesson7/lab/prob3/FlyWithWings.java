package lesson7.lab.prob3;

interface FlyWithWings extends FlyBehaviour {

    @Override
    default void fly() {
        System.out.println("Fly with wings...");
    }
    
}
