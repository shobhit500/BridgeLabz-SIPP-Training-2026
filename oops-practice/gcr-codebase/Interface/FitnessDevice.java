public class FitnessDevice implements Trackable, Reportable, Notifiable {

    public void logActivity() {
        System.out.println("Activity Logged.");
    }

    public void generateReport() {
        System.out.println("Weekly Fitness Report Generated.");
    }

    public void sendAlert() {
        System.out.println("Time to Drink Water!");
    }

    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();
    }
}