package Week_3_Task_3;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class GenerateLogsInLoop {
    public static void main(String[] args) {

        String[] infoMessages = {"User logged in", "Process completed", "Connection established", "File saved",
                "Task scheduled"};
        String[] warnMessages = {"Low memory", "High CPU usage", "Disk space running low", "Slow network detected",
                "Deprecated API used"};
        String[] errorMessages = {"Null pointer exception", "Array index out of bounds", "Database connection failed",
                "File not found", "Invalid input detected"};

        String fileName = "E:\\AAA-YUNUS_BSc\\TY\\TY-SEM-2\\Data-Inn-Internship\\" +
                "Java-Project-Container\\DataInn_Internship_Tasks\\src\\Week_3_Task_3\\log3.txt";

        Random rand = new Random();


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            bw.write("\n\nStart Log: \n------------------------------------------------------------------------\n");
            for (int i = 0; i < 25; i++) {
                String message = infoMessages[rand.nextInt(infoMessages.length)];
                bw.write(LocalDateTime.now().format(dtf) + " :: INFO :: " + message);
                bw.newLine();
            }
            bw.write("------------------------------------------------------------------------\n");


            for (int i = 0; i < 15; i++) {
                String message = warnMessages[rand.nextInt(warnMessages.length)];
                bw.write(LocalDateTime.now().format(dtf) + " :: WARN :: " + message);
                bw.newLine();
            }
            bw.write("------------------------------------------------------------------------\n");


            for (int i = 0; i < 10; i++) {
                String message = errorMessages[rand.nextInt(errorMessages.length)];
                bw.write(LocalDateTime.now().format(dtf) + " :: ERROR :: " + message);
                bw.newLine();
            }
            bw.write("------------------------------------------------------------------------\n:End Log\n");

            System.out.println("\nLogs Generated Successfully.");

        } catch (FileNotFoundException err) {
            System.out.println("FileNotFoundException: " + err.getMessage());
        } catch (IOException err) {
            System.out.println("IOException: " + err.getMessage());
        }
    }
}
