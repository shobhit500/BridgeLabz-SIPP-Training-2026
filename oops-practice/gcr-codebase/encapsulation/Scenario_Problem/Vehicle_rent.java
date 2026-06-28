abstract class Vehicle {
    private String vehicleNumber;
    private String vehicleType;
    Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }
    String getVehicleNumber() {
        return vehicleNumber;
    }
    String getVehicleType() {
        return vehicleType;
    }
    void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    abstract double calculateRentalCost(int days);
    void displayVehicleInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

class Car extends Vehicle {

    private double dailyRate;

    Car(String vehicleNumber, String vehicleType, double dailyRate) {
        super(vehicleNumber, vehicleType);
        this.dailyRate = dailyRate;
    }

    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Bike extends Vehicle {

    private double dailyRate;

     Bike(String vehicleNumber, String vehicleType, double dailyRate) {
        super(vehicleNumber, vehicleType);
        this.dailyRate = dailyRate;
    }

    final double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Truck extends Vehicle {

    private double dailyRate;
    private double loadingCharge;

    Truck(String vehicleNumber, String vehicleType, double dailyRate, double loadingCharge) {
        super(vehicleNumber, vehicleType);
        this.dailyRate = dailyRate;
        this.loadingCharge = loadingCharge;
    }

    double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}

public class Vehicle_rent {
    public static void main(String[] args) {

        Car c = new Car("UP81AB1234", "Car", 2000);
        Bike b = new Bike("UP81XY5678", "Bike", 500);
        Truck t = new Truck("UP81TR9999", "Truck", 4000, 1500);

        int days = 3;

        c.displayVehicleInfo();
        System.out.println("Rental Cost = " + c.calculateRentalCost(days));

        b.displayVehicleInfo();
        System.out.println("Rental Cost = " + b.calculateRentalCost(days));

        t.displayVehicleInfo();
        System.out.println("Rental Cost = " + t.calculateRentalCost(days));
    }
}