abstract class Employee {

    private int employeeId;
    private String employeeName;

    Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    int getEmployeeId() {
        return employeeId;
    }

    String getEmployeeName() {
        return employeeName;
    }

    void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    abstract double calculateSalary();

    void displayEmployeeInfo() {
        System.out.println(employeeId + " " + employeeName);
    }
}

class FullTimeEmployee extends Employee {

    private double monthlySalary;

    FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
public class Employee_payroll {
    public static void main(String[] args) {

        FullTimeEmployee e1 = new FullTimeEmployee(101, "Shobhit", 50000);

        PartTimeEmployee e2 = new PartTimeEmployee(102, "Rahul", 40, 300);

        e1.displayEmployeeInfo();
        System.out.println("Salary = " + e1.calculateSalary());

        e2.displayEmployeeInfo();
        System.out.println("Salary = " + e2.calculateSalary());
    }
}