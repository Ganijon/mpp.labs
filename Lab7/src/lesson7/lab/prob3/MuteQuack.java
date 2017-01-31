package lesson7.lab.prob3;

interface MuteQuack extends QuackBehaviour {

    @Override
    default void quack() {
        System.out.println("Mute...");
    }
    
}
