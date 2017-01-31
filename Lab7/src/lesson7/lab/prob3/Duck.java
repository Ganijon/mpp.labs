package lesson7.lab.prob3;

abstract class Duck implements FlyBehaviour, QuackBehaviour {

    public void swim() {
        System.out.println("Swim...");
    }

    abstract void display();
}
