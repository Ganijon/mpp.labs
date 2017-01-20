package lab5.Problem1;

class RedheadDuck extends Duck {
    RedheadDuck(){
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }
}
