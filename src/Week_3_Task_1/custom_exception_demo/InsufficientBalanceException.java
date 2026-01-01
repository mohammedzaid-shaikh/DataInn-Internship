package Week_3_Task_1.custom_exception_demo;

import java.util.Scanner;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String err) {
        super(err);
    }
}

class DemoBankAccount {
    public static double balance = 10000;
    public static void withdraw(double amount) throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient Funds! Balance Amount: [₹" + balance + "], Withdrawing Amount: [₹" + amount + "]\n");
        } else {
            balance -= amount;
            System.out.println("\nWithdrawn [₹" + amount + "] Successfully. Balance Remaining: [₹" + balance + "]\n");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter Withdraw Amount: ");
            double amt = sc.nextDouble();

            withdraw(amt);
        } catch (InsufficientBalanceException err) {
            System.out.println("\nInsufficientBalanceException: " + err.getMessage());
        }
    }
}