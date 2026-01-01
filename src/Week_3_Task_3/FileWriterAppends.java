package Week_3_Task_3;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterAppends {
    public static void main(String[] args) {
        String fileName = "E:\\AAA-YUNUS_BSc\\TY\\TY-SEM-2\\Data-Inn-Internship\\" +
                "Java-Project-Container\\DataInn_Internship_Tasks\\src\\Week_3_Task_3\\log1.txt"; // log.txt


        try (FileWriter fw = new FileWriter(fileName, true); Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter Your Log Message: \n->\t");
            String userContent = sc.nextLine();

            fw.write(userContent + "\n");

            System.out.println("\nLog Message Written Into File Successfully.\n");

        } catch (FileNotFoundException err) { // Missing folder paths / non-existent drive, etc.
            System.out.println("Error In Specified File Directory: " + err.getMessage());
        } catch (IOException err) { // Writing into a read-only file / protected directory / disk full, etc.
            System.out.println("Error In File Writing Process: " + err.getMessage());
        }

        System.out.println("\nProgram Execution Completed.\n");
    }
}
