package lesson7.lab.prob3;

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
