package lab5.Problem1;

class MullardDuck extends Duck {
    MullardDuck(){
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }
}
