//package java-IO.Scenario-basedProblem;
import java.io.*;
import java.util.Scanner;

public class ExpenseLogger {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Expense Category: ");
            String category = sc.nextLine();

            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();

            FileWriter fw = new FileWriter("expenses.txt", true);

            fw.write(category + " - " + amount);
            fw.write("\n");

            fw.close();

            System.out.println("Expense Saved Successfully");

        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
}
