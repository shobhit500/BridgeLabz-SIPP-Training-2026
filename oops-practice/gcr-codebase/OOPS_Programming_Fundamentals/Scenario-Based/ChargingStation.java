// package oops-practice.gcr-codebase.OOPS_Programming_Fundamentals.Scenario-Based;
public class ChargingStation {

    static int totalStations = 0;
    static double electricityRate = 8.5;

    int stationId;
    double unitsConsumed;

    ChargingStation(int stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    void calculateBill() {
        double bill = unitsConsumed * electricityRate;
        System.out.println("Bill = " + bill);
    }

    void displayStationDetails() {
        System.out.println("Station ID : " + stationId);
        System.out.println("Units Consumed : " + unitsConsumed);
        System.out.println("Electricity Rate : " + electricityRate);
        calculateBill();
        System.out.println();
    }

    public static void main(String[] args) {

        ChargingStation s1 = new ChargingStation(101, 120);
        ChargingStation s2 = new ChargingStation(102, 95);
        ChargingStation s3 = new ChargingStation(103, 150);
        ChargingStation s4 = new ChargingStation(104, 80);
        ChargingStation s5 = new ChargingStation(105, 110);

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations = " + totalStations);

        System.out.println("\nChanging Electricity Rate...\n");

        electricityRate = 10;

        s1.displayStationDetails();
        s2.displayStationDetails();
    }
}