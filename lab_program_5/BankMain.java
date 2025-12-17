import java.util.Scanner;

class Account {
    String name;
    int accNo;
    double balance;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        name = sc.nextLine();
        System.out.print("Enter account number: ");
        accNo = sc.nextInt();
        System.out.print("Enter initial balance: ");
        balance = sc.nextDouble();
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Amount deposited successfully.");
    }

    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

class SavAcct extends Account {

    void computeInterest() {
        double rate = 0.05;   // 5% interest
        double interest = balance * rate;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class CurAcct extends Account {
    final double MIN_BALANCE = 1000;
    final double PENALTY = 100;

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawal successful.");

            if (balance < MIN_BALANCE) {
                balance -= PENALTY;
                System.out.println("Minimum balance not maintained.");
                System.out.println("Penalty imposed: " + PENALTY);
            }
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("0. Exit");
            System.out.print("Enter account type: ");
            choice = sc.nextInt();

            if (choice == 1) {
                SavAcct sa = new SavAcct();
                sa.acceptDetails();
                System.out.print("Enter amount to deposit: ");
                sa.deposit(sc.nextDouble());
                sa.computeInterest();
                System.out.print("Enter amount to withdraw: ");
                sa.withdraw(sc.nextDouble());
                sa.displayBalance();
            } 
            else if (choice == 2) {
                CurAcct ca = new CurAcct();
                ca.acceptDetails();
                System.out.print("Enter amount to deposit: ");
                ca.deposit(sc.nextDouble());
                System.out.print("Enter amount to withdraw: ");
                ca.withdraw(sc.nextDouble());
                ca.displayBalance();
            } 
            else if (choice != 0) {
                System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
        System.out.println("Thank you for using the bank system.");
    }
}

