package Week_3_Task_1.custom_exception_demo;

// Could be imported as shown below but no requirement as it is in the same package/folder.

//import Week_3_Task_1.custom_exception_demo.InvalidLoginException;
//import Week_3_Task_1.custom_exception_demo.InsufficientBalanceException;
//import Week_3_Task_1.custom_exception_demo.InvalidLoginException;
//import Week_3_Task_1.custom_exception_demo.MarksOutOfRangeException;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------------------------");

        try {
            System.out.print("\nEnter Your Current Age: ");
            int age = sc.nextInt();

            RatedRMovie.checkAge(age);
        } catch(InvalidAgeException err) {
            System.out.println("\nInvalidAgeException: " + err.getMessage());
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        try {
            System.out.print("\nEnter Withdraw Amount: ");
            double amt = sc.nextDouble();
            sc.nextLine();

            DemoBankAccount.withdraw(amt);
        } catch (InsufficientBalanceException err) {
            System.out.println("\nInsufficientBalanceException: " + err.getMessage());
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        try {
            System.out.print("\nEnter Username (admin): ");
            String username = sc.nextLine();

            System.out.print("Enter Password (12345): ");
            String password = sc.nextLine();

            LogInValidation.checkCredentials(username, password);
        } catch (InvalidLoginException info)  {
            System.out.println("\nInvalidLoginException: " + info.getMessage());
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        try {
            System.out.print("\nEnter Your Marks: ");
            float marks = sc.nextFloat();

            MarksRangeCheck.validateMarks(marks);
        } catch(MarksOutOfRangeException err) {
            System.out.println("\nMarksOutOfRangeException: " + err.getMessage());
        }

        sc.close();

        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
