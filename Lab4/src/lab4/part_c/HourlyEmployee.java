package lab4.part_c;

public class HourlyEmployee extends Employee {
    private double hourlyWage;
    private double hoursPerWeek;

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(int month, int year) {
       return 4 * hoursPerWeek * hourlyWage;
    }
    
}