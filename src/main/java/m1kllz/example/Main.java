package m1kllz.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello Sir Please Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter your balance: ");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(name, accountNumber, balance);

        System.out.println("\nWelcome " + account.name + "!");
        System.out.println("Account number: " + account.accountNumber);
        System.out.println("Balance: $" + account.balance);

        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Inquiry");
            System.out.println("4. Calculate Interest");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                }
                case 2 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                }
                case 3 -> account.balanceInquiry();
                case 4 -> account.calculateInterest();
                case 5 -> {
                    System.out.println("Thank you for using our banking system!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
