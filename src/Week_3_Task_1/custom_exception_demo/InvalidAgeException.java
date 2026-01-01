package Week_3_Task_1.custom_exception_demo;

import java.lang.Exception; // Imported Automatically By The Java Compiler
import java.util.Scanner;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(String message) {
        super(message);
    }
}

class RatedRMovie {
    public static Integer ageLimit = 18;
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < ageLimit) { // No hardcoded comparing values, store it in a variable
            throw new InvalidAgeException("18 And Above Are Permitted To The Movie, You Are A Minor, Aged: [" + age + "]\n");
        }
        System.out.println("\nValid Age [18 - 18+], Access Granted.\n");
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter Your Current Age: ");
            int age = sc.nextInt();


            checkAge(age);
        } catch(InvalidAgeException err) {
            System.out.println("\nInvalidAgeException: " + err.getMessage());
        }
    }
}

