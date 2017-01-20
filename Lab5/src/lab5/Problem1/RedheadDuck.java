package lab5.Problem1;

class RedheadDuck extends Duck {
    RedheadDuck(){
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }

    @Override
    void display() {
        System.out.println("Red head in flock...");
    }
}
