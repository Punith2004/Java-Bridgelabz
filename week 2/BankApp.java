class BankAccount {
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Balance: $" + balance);
        } else {
            System.out.println("Invalid account object.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(101, "nikhil", 5000.0);
        BankAccount account2 = new BankAccount(102, "punith", 3000.0);

        account1.displayAccountDetails();
        System.out.println();
        account2.displayAccountDetails();

        System.out.println();
        account1.deposit(1000.0);
        account1.withdraw(2000.0);

        System.out.println();
        BankAccount.getTotalAccounts();
    }
}
