package lab5.Problem3;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Vehicle> transport = new ArrayList<>();

        try {
            transport.add(VehicleFactory.getVehicle("Bus"));
            transport.add(VehicleFactory.getVehicle("Truck"));
            transport.add(VehicleFactory.getVehicle("Car"));
            transport.add(VehicleFactory.getVehicle("ElectricCar"));
            transport.add(VehicleFactory.getVehicle("SportsCar")); // not available
        
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        for (Vehicle vehicle : transport) {
            vehicle.startEngine();
        }

    }
}
