public class BankMain {

    public static void main(String[] args) {

        SavingsAccount s1 =
                new SavingsAccount("SB101", "Rahul", 50000, 5);

        CurrentAccount c1 =
                new CurrentAccount("CA201", "Amit", 40000, 2);

        s1.deposit(5000);
        s1.withdraw(3000);

        c1.deposit(2000);
        c1.withdraw(1000);

        System.out.println("----- Savings Account -----");
        s1.displayAccountDetails();
        System.out.println("Interest = " + s1.calculateInterest());

        System.out.println();

        System.out.println("----- Current Account -----");
        c1.displayAccountDetails();
        System.out.println("Interest = " + c1.calculateInterest());
    }
}