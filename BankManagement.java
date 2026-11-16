
class Account {
    int accountNumber;
    String accountHolderName;
    double balance;

    // Parent class constructor
    Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

// Child Class 1
class SavingsAccount extends Account {
    double interestRate = 5.0;

    SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName , balance);
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Annual Interest: " + interest);
    }

    @Override
    void displayAccountDetails() {
        System.out.println("\n--- Savings Account ---");
        super.displayAccountDetails();
        calculateInterest();
    }
}

// Child Class 2
class CurrentAccount extends Account {
    double overdraftLimit = 10000;

    CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft Limit Exceeded!");
        }
    }

    void checkOverdraft() {
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("Available Balance: " +
                           (balance + overdraftLimit));
    }

    @Override
    void displayAccountDetails() {
        System.out.println("\n--- Current Account ---");
        super.displayAccountDetails();
        checkOverdraft();
    }
}

// Main Class
public class BankManagement {
    public static void main(String[] args) {

        SavingsAccount s1 =
            new SavingsAccount(101, "Mayank", 20000);

        CurrentAccount c1 =
            new CurrentAccount(102, "Rahul", 15000);

        // Savings Account Operations
        s1.deposit(5000);
        s1.withdraw(2000);
        s1.displayAccountDetails();

        // Current Account Operations
        c1.deposit(3000);
        c1.withdraw(25000);
        c1.displayAccountDetails();
    }
}
