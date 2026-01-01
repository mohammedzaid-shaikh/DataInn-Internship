package Week_3_Task_1.custom_exception_demo;

import java.util.Objects;
import java.util.Scanner;

public class InvalidLoginException extends Exception {
    public InvalidLoginException(String info) {
        super(info);
    }
}

class LogInValidation {
    public static void checkCredentials(String checkUser, String checkPass) throws InvalidLoginException {
        String username = "admin";
        String password = "12345";

        if (!Objects.equals(checkUser, username) || !Objects.equals(checkPass, password)) {
            throw new InvalidLoginException("Username Or Password Is Incorrect, Please Enter Valid Credentials.\n");
        }
        else {
            System.out.println("\nLogin Credentials Correct! Access Granted.\n");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter Username (admin): ");
            String username = sc.nextLine();

            System.out.print("Enter Password (12345): ");
            String password = sc.nextLine();

            checkCredentials(username, password);
        } catch (InvalidLoginException info)  {
            System.out.println("\nInvalidLoginException: " + info.getMessage());
        }
    }
}
