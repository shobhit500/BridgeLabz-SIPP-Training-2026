import java.util.Scanner;

public class EmployeeAttendanceRanking {

    public static void sort(int ids[], int attendance[]) {

        int n = ids.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (attendance[j] < attendance[j + 1] ||
                   (attendance[j] == attendance[j + 1] && ids[j] > ids[j + 1])) {

                    int temp = attendance[j];
                    attendance[j] = attendance[j + 1];
                    attendance[j + 1] = temp;

                    temp = ids[j];
                    ids[j] = ids[j + 1];
                    ids[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Employees: ");
        int n = sc.nextInt();

        int ids[] = new int[n];
        int attendance[] = new int[n];

        System.out.println("Enter Employee IDs:");

        for (int i = 0; i < n; i++)
            ids[i] = sc.nextInt();

        System.out.println("Enter Attendance:");

        for (int i = 0; i < n; i++)
            attendance[i] = sc.nextInt();

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        sort(ids, attendance);

        System.out.println("Top " + k + " Employees:");

        for (int i = 0; i < k; i++)
            System.out.print(ids[i] + " ");
    }
}