package Week_1_Task_4;

class BankAccount {

    private String accNum;
    private String accHolderName;
    private double bal;
    private String accType;
    private String branch;


    public BankAccount(String accNum, String accHolderName,
                       double bal, String accType, String branch) {
        this.accNum = accNum;
        this.accHolderName = accHolderName;
        this.bal = bal;
        this.accType = accType;
        this.branch = branch;
    }


    public String getAccNum() {
        return accNum;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public double getBal() {
        return bal;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            bal += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= bal) {
            bal -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: ₹" + bal);
    }

    @Override
    public String toString() {
        return "\nAccount Details {" +
                "\n\tAccount Number: " + getAccNum() +
                "\n\tAccount Holder: " + getAccHolderName() +
                "\n\tBalance: ₹" + getBal() +
                "\n\tAccount Type: " + getAccType() +
                "\n\tBranch: " + getBranch() + "\n}";
    }
}


public class SimpleBankAccountClass {

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("987654325", "Suresh", 7000.0,
                "Savings", "Pune");

        System.out.println();
        acc.checkBalance();
        acc.deposit(1400);
        acc.checkBalance();
        acc.withdraw(1100);
        acc.checkBalance();


        System.out.println(acc);
    }
}
