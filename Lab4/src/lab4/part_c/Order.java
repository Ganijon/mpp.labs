package lab4.part_c;

import java.time.LocalDate;
import java.util.Random;

public class Order {

    private int orderNo;
    private LocalDate orderDate;
    private double orderAmount;

    public Order(double orderAmount) {
        orderNo = new Random().nextInt(1000);
        orderDate = LocalDate.now();
        this.orderAmount = orderAmount;
    }
    public int getOrderNo() {
        return orderNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}
