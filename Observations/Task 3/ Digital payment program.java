import java.util.Scanner;

public class DigitalPayment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Payment Amount: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance = balance - amount;

            System.out.println("\n--- Payment Details ---");
            System.out.println("Customer Name: " + name);
            System.out.println("Payment Successful");
            System.out.println("Paid Amount: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Payment Failed");
            System.out.println("Insufficient Balance");
        }

        sc.close();
    }
}