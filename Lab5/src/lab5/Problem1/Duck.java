package lab5.Problem1;

abstract class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }
    
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
    
    public void quack() {
        quackBehaviour.quack();
    }
    
    public void swim() {
        System.out.println("Swim...");
    }
    
    public void display() {
        System.out.printf("\n[%s]\n", this.getClass().getSimpleName());
        flyBehaviour.fly();
        quack();
        swim();
    }
}
