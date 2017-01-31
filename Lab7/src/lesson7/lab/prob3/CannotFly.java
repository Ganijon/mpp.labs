package lesson7.lab.prob3;

class CannotFly implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Can't fly...");
    }
    
}
