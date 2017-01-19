package lab4.part_c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommissionedEmployee extends Employee {

    private double commission;
    private double baseSalary;
    private List<Order> ordersSold;

    public CommissionedEmployee(int id) {
        super(id);
        ordersSold = new ArrayList<>();
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void takeOrders(Order... orders) {
        ordersSold.addAll(Arrays.asList(orders));
    }

    @Override
    public double calcGrossPay(int month, int year) {
        double ordersAmount = 0;

        for (Order order : ordersSold) {
            if (year == order.getOrderDate().getYear()
                    && month == order.getOrderDate().getMonthValue()) {
                ordersAmount += order.getOrderAmount();
            }
        }
        return baseSalary + ordersAmount * commission / 100;
    }
}
