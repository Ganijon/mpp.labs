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

    public void print() {

    }

    public void getNetPay() {

    }
}
