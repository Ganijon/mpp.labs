package lab4.part_c;

public class Main {

    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        SalariedEmployee emp1 = new SalariedEmployee(101);
        emp1.setSalary(5000.0);
        staff[0] = emp1;

        HourlyEmployee emp2 = new HourlyEmployee(102);
        emp2.setHourlyWage(20.0);
        emp2.setHoursPerWeek(40);
        staff[1] = emp2;

        CommissionedEmployee emp3 = new CommissionedEmployee(103);
        emp3.setBaseSalary(1000.0);
        emp3.setCommission(5);
        emp3.takeOrders(new Order(12000.0), new Order(15000.0),
                new Order(12200.0), new Order(10050.0));
        staff[2] = emp3;

        //
        for (Employee emp : staff) {
            emp.print();
        }
    }
}
