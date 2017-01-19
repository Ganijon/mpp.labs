package lab4.part_c;

import java.time.LocalDate;

public abstract class Employee {

    private int empId;
    
    public Employee(int id) {
        empId = id;
    }
    protected abstract double calcGrossPay(int month, int year);
    
    public void print() {
        LocalDate now = LocalDate.now();
        Paycheck paycheck = calcCompensation(now.getMonthValue(), now.getYear());
        System.out.printf("\nEmployee ID: %s\n%s/%s", empId, now.getMonthValue(), now.getYear());
        paycheck.print();         
    }
    
    private Paycheck calcCompensation(int month, int year) {
        /*
            FICA is 23%
            State tax is 5%
            Local tax is 1%
            Medicare is 3%
            Social Security is 7.5%
        */
        double grossPayAmount = calcGrossPay(month, year);
        
        return new Paycheck(grossPayAmount, 23, 5, 1, 3, 7.5);        
    }
}
