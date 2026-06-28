public class ATMMain {

    public static void main(String[] args) throws InsufficientBalanceException {

        BankAccount account = new BankAccount("Rahul", 12345, 10000);

        account.displayBalance();

        account.deposit(2000);

        account.withdraw(5000);

        account.displayBalance();
    }

    static class BankAccount {
        private String owner;
        private int accountNumber;
        private double balance;

        BankAccount(String owner, int accountNumber, double balance) {
            this.owner = owner;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            }
        }

        void withdraw(double amount) throws InsufficientBalanceException {
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance for withdrawal");
            }
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }

        void displayBalance() {
            System.out.println("Account holder: " + owner);
            System.out.println("Account number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }

    static class InsufficientBalanceException extends Exception {
        InsufficientBalanceException(String message) {
            super(message);
        }
    }
}