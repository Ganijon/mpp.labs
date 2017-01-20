package lab5.Problem1;

class RubberDuck extends Duck {
    RubberDuck(){
        setFlyBehaviour(new CannotFly());
        setQuackBehaviour(new Squeak());
    }

    @Override
    void display() {
        System.out.println("Rubber duck in flock...");
    }
}
