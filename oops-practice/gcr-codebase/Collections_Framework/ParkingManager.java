import java.util.*;

public class ParkingManager {

    static ArrayList<String> parking = new ArrayList<>();

    static void addVehicle(String vehicle) {
        parking.add(vehicle);
        System.out.println("Vehicle Entered");
    }

    static void removeVehicle(String vehicle) {

        if (parking.contains(vehicle)) {
            parking.remove(vehicle);
            System.out.println("Vehicle Exited");
        } else {
            System.out.println("Vehicle Not Found");
        }
    }

    static void searchVehicle(String vehicle) {

        if (parking.contains(vehicle))
            System.out.println("Vehicle is Parked");
        else
            System.out.println("Vehicle Not Parked");
    }

    static void display() {

        System.out.println("\nParked Vehicles");

        for (String vehicle : parking) {
            System.out.println(vehicle);
        }

        System.out.println("Occupied Slots = " + parking.size());
    }

    public static void main(String[] args) {

        addVehicle("UP32AB1234");
        addVehicle("DL01CD5678");
        addVehicle("HR26EF1111");

        searchVehicle("DL01CD5678");

        removeVehicle("DL01CD5678");

        display();
    }
}