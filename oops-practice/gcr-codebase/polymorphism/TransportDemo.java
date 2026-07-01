class Vehicle {

    void fuelCost(int km) {
        System.out.println("Fuel Cost");
    }
}

class Car extends Vehicle {

    void fuelCost(int km) {
        System.out.println("Car Cost = " + (km * 8));
    }
}

class Bus extends Vehicle {

    void fuelCost(int km) {
        System.out.println("Bus Cost = " + (km * 15));
    }
}

class Bike extends Vehicle {

    void fuelCost(int km) {
        System.out.println("Bike Cost = " + (km * 3));
    }
}

class ElectricCar extends Vehicle {

    void fuelCost(int km) {
        System.out.println("Electric Car Charging Cost = " + (km * 2));
    }
}

public class TransportDemo {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        for (Vehicle v : vehicles) {

            v.fuelCost(10);

            if (v instanceof Car)
                System.out.println("It is a Car");

            else if (v instanceof Bus)
                System.out.println("It is a Bus");

            else if (v instanceof Bike)
                System.out.println("It is a Bike");

            else if (v instanceof ElectricCar)
                System.out.println("It is an Electric Car");
        }
    }
}