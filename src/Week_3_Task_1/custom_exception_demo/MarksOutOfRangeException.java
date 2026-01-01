package Week_3_Task_1.custom_exception_demo;

import java.util.Scanner;

public class MarksOutOfRangeException extends Exception {
    public MarksOutOfRangeException(String message) {
        super(message);
    }
}

class MarksRangeCheck {
    public static void validateMarks(float marks) throws MarksOutOfRangeException {
        if (marks < 0 || marks > 100) {
            throw new MarksOutOfRangeException("Marks Must Be Entered Within The Range 0 To 100\n");
        } else {
            System.out.println("\nI'm Deeply Sorry, You Failed Mate.\n");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter Your Marks: ");
            float marks = sc.nextFloat();

            validateMarks(marks);
        } catch(MarksOutOfRangeException err) {
            System.out.println("\nMarksOutOfRangeException: " + err.getMessage());
        }
    }
}
