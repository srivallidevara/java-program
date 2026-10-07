import java.util.Scanner;

public class BankManagementSystem {

    static double balance = 5000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== BANK MANAGEMENT SYSTEM =====");

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.println("\nWelcome " + name);

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Current Balance: " + balance);
        }

        else if (choice == 2) {
            System.out.print("Enter Deposit Amount: ");
            double amount = sc.nextDouble();

            balance = balance + amount;

            System.out.println("Money Deposited Successfully");
            System.out.println("Current Balance: " + balance);
        }

        else if (choice == 3) {
            System.out.print("Enter Withdraw Amount: ");
            double amount = sc.nextDouble();

            if (amount <= balance) {
                balance = balance - amount;

                System.out.println("Money Withdrawn Successfully");
                System.out.println("Current Balance: " + balance);
            }
            else {
                System.out.println("Insufficient Balance");
            }
        }

        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}