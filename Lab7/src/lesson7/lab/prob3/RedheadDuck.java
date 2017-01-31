package lesson7.lab.prob3;

class RedheadDuck extends Duck implements FlyWithWings, Quack {
    
    @Override
    void display() {
        System.out.println("Red head in flock...");
    }

}
