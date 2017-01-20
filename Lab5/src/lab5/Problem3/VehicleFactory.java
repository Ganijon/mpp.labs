package lab5.Problem3;

public class VehicleFactory {

    private VehicleFactory() {
    }

    public static Vehicle getVehicle(String v) throws ClassNotFoundException {

        switch (v) {
            case "Bus":
                return new Bus();
            case "Truck":
                return new Truck();
            case "Car":
                return new Car();
            case "ElectricCar":
                return new ElectricCar();
            default:
                throw new ClassNotFoundException(v + " vehicle not available");
        }
    }
}
