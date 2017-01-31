package lesson7.lab.prob3;

class RubberDuck extends Duck implements CannotFly, Squeak {

    @Override
    void display() {
        System.out.println("Rubber duck in flock...");
    }
}
