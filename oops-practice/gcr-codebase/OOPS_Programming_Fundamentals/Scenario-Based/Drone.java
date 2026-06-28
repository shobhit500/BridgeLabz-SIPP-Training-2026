package practice.gcr_codebase.OOPS_Programming_Fundamentals.Scenario_Based;
public class Drone {

    String droneId;
    int batteryPercentage;

    static String companyName = "SkyLogistics";

    Drone(String droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    void startDelivery() {
        if (batteryPercentage >= 20) {
            System.out.println(droneId + " Delivery Started");
        } else {
            System.out.println(droneId + " Low Battery");
        }
    }

    void displayStatus() {
        System.out.println(companyName + " " + droneId + " " + batteryPercentage + "%");
    }

    public static void main(String[] args) {

        Drone d1 = new Drone("D101", 80);
        Drone d2 = new Drone("D102", 60);
        Drone d3 = new Drone("D103", 15);

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }
} 
