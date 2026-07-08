import java.util.*;

public class AttendanceTracker {

    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    static void markAttendance(String subject, String student) {

        if (!attendance.containsKey(subject)) {
            attendance.put(subject, new ArrayList<>());
        }

        ArrayList<String> list = attendance.get(subject);

        if (!list.contains(student)) {
            list.add(student);
            System.out.println(student + " Present in " + subject);
        } else {
            System.out.println("Attendance Already Marked");
        }
    }

    static void display() {

        for (String subject : attendance.keySet()) {

            System.out.println("\nSubject : " + subject);

            ArrayList<String> list = attendance.get(subject);

            for (String student : list) {
                System.out.println(student);
            }

            System.out.println("Total Students = " + list.size());
        }
    }

    public static void main(String[] args) {

        markAttendance("Java", "Shobhit");
        markAttendance("Java", "Aman");
        markAttendance("Java", "Shobhit");

        markAttendance("Python", "Rahul");
        markAttendance("Python", "Aman");

        display();
    }
}