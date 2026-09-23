class Account {

    int accountNumber;
    String accountHolderName;
    double balance;
    String accountType;

    Account(int no, String name, double balance, String type) {
        accountNumber = no;
        accountHolderName = name;
        this.balance = balance;
        accountType = type;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void transfer(Account a, double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            a.balance = a.balance + amount;
            System.out.println("Transferred: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}


class SavingsAccount extends Account {

    double interestRate;

    SavingsAccount(int no, String name, double balance, double rate) {
        super(no, name, balance, "Savings");
        interestRate = rate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance = balance + interest;
        System.out.println("Interest: " + interest);
    }
}


class CurrentAccount extends Account {

    double overdraftLimit;

    CurrentAccount(int no, String name, double balance, double limit) {
        super(no, name, balance, "Current");
        overdraftLimit = limit;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft Limit Exceeded");
        }
    }
}


public class BankManagementSystem {

    public static void main(String[] args) {

        SavingsAccount s =
            new SavingsAccount(101, "Ravi", 10000, 5);

        CurrentAccount c =
            new CurrentAccount(102, "Suresh", 5000, 3000);

        System.out.println("Before Transactions:");
        s.displayAccountDetails();
        c.displayAccountDetails();

        System.out.println("\nTransactions:");

        s.deposit(2000);
        s.withdraw(1000);
        s.calculateInterest();

        c.deposit(1000);
        c.withdraw(7000);

        s.transfer(c, 2000);

        System.out.println("\nAfter Transactions:");
        s.displayAccountDetails();
        c.displayAccountDetails();

        System.out.println("\nFinal Balance:");
        System.out.println("Savings: " + s.balance);
        System.out.println("Current: " + c.balance);
    }
}