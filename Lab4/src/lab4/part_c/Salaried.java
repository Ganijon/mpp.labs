package lab4.part_c;

public class Salaried extends Employee {

    private double salary;

    public Salaried(int id){
        super(id);
    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    protected double calcGrossPay(int month, int year) {
        return salary;
    }
}
