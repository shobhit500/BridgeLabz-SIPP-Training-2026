import java.util.*;

public class hospital_er {

    static class Patient {
        int priority;
        String name;

        Patient(int priority, String name) {
            this.priority = priority;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Patient> triageQueue =
                new PriorityQueue<>((a, b) -> a.priority - b.priority);

        triageQueue.offer(new Patient(3, "Rahul"));
        triageQueue.offer(new Patient(1, "Aman"));
        triageQueue.offer(new Patient(5, "Priya"));
        triageQueue.offer(new Patient(2, "Rohit"));

        System.out.println("Patients Called:");

        while (!triageQueue.isEmpty()) {
            Patient p = triageQueue.poll();
            System.out.println(p.name + " Priority: " + p.priority);
        }
    }
}