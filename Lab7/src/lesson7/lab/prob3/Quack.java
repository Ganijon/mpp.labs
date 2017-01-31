package lesson7.lab.prob3;

interface Quack extends QuackBehaviour {

    @Override
    default void quack() {
        System.out.println("Quack...");
    }

}
