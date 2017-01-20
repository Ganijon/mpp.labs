package lab4.part_c;

public class Application {

    public static void main(String[] args) {

        Hourly hourly = new Hourly(102);
        hourly.setHourlyWage(20.0);
        hourly.setHoursPerWeek(40);
        
        Salaried salaried = new Salaried(101);
        salaried.setSalary(5000.0);
        
        Commissioned commissioned = new Commissioned(103);
        commissioned.setBaseSalary(1000.0);
        commissioned.setCommission(5);
        commissioned.takeOrders(
                new Order(12000.0),
                new Order(15000.0),
                new Order(12200.0),
                new Order(10050.0));
        
        // sequence diagram
        hourly.print(1, 2017);
        salaried.print(1, 2017);
        commissioned.print(1, 2017);
    }
}
