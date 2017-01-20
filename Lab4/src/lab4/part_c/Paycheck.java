package lab4.part_c;

public class Paycheck {

    private double grossPay;
    private double fica;
    private double state;
    private double local;
    private double medicare;
    private double socialSecurity;

    public Paycheck(double grossPay, double fica, double state, double local,
            double medicare, double socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = state;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
    }

    public double getNetPay() {
        double deductions = grossPay / 100 * (fica + state + local + medicare + socialSecurity);
        return grossPay - deductions;
    }


    public void print() {
        System.out.print(" Paycheck:\n");
        System.out.printf("  Gross Pay:  $%,.2f\n", grossPay);
        System.out.printf("  Net Pay:    $%,.2f\n", getNetPay());
    }
}
