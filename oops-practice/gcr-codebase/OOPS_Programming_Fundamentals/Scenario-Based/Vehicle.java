// package oops-practice.gcr-codebase.OOPS_Programming_Fundamentals.Scenario-Based;
public class Vehicle {

    String vehicleNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayDetails() {
        System.out.println(vehicleNumber + "  " + ownerName + "  " + vehicleType);
    }

    static void displayCars(Vehicle[] vehicles) {

        System.out.println("Cars:");

        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Car")) {
                v.displayDetails();
            }
        }
    }

    static void displayBikes(Vehicle[] vehicles) {

        System.out.println("\nBikes:");

        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                v.displayDetails();
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("UP81AA1111", "Rahul", "Car");
        vehicles[1] = new Vehicle("UP81BB2222", "Amit", "Bike");
        vehicles[2] = new Vehicle("UP81CC3333", "Riya", "Car");
        vehicles[3] = new Vehicle("UP81DD4444", "Neha", "Bike");
        vehicles[4] = new Vehicle("UP81EE5555", "Karan", "Car");
        vehicles[5] = new Vehicle("UP81FF6666", "Rohan", "Bike");
        vehicles[6] = new Vehicle("UP81GG7777", "Priya", "Car");
        vehicles[7] = new Vehicle("UP81HH8888", "Vikas", "Bike");
        vehicles[8] = new Vehicle("UP81II9999", "Ankit", "Car");
        vehicles[9] = new Vehicle("UP81JJ1010", "Simran", "Bike");

        displayCars(vehicles);

        displayBikes(vehicles);
    }
}