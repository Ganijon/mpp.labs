package lab5.Problem1;

class MullardDuck extends Duck {
    MullardDuck(){
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }

    @Override
    void display() {
        System.out.println("Mullard duck in flock...");
    }
}
