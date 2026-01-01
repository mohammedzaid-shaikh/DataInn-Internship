package Week_3_Task_3;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Scanner;


public class BufferedWriterLogs {
    public static void main(String[] args) {
        String fileName = "E:\\AAA-YUNUS_BSc\\TY\\TY-SEM-2\\Data-Inn-Internship\\" +
                "Java-Project-Container\\DataInn_Internship_Tasks\\src\\Week_3_Task_3\\log2.txt";

        String username = "hehe";
        String password  = "1234";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
             Scanner sc = new Scanner(System.in)) {

            String logStart = "START", logError = "ERROR", logSuccess = "SUCCESS", logEnd = "END-OF-LINE";
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            bw.newLine();
            bw.write("-----------------------------------------------------------------------\n");
            bw.write(LocalDateTime.now().format(dtf) +
                    " :: " + logStart + " :: " + "Program Execution Initiated.\n");

            System.out.print("\nEnter Your Username: ");
            String checkUser = sc.nextLine();

            System.out.print("Enter Your Password: ");
            String checkPass = sc.nextLine();

            if (!Objects.equals(username, checkUser) || !Objects.equals(password, checkPass)) {
                bw.write(LocalDateTime.now().format(dtf) +
                        " :: " + logError + " :: " + "Wrong Credentials Entered.\n");
                System.out.println("Wrong Credentials Entered.");
            } else {
                bw.write(LocalDateTime.now().format(dtf) +
                        " :: " + logSuccess + " :: " + "Access Granted!\n");
                System.out.println("Access Granted!");
            }

            bw.write(LocalDateTime.now().format(dtf) +
                    " :: " + logEnd + " :: " + "Program Execution Terminated.\n");
            bw.write("-----------------------------------------------------------------------");
            bw.newLine();

        } catch (FileNotFoundException err) {
            System.out.println("FileNotFoundException: " + err.getMessage());
        } catch (IOException err) {
            System.out.println("IOException: " + err.getMessage());
        }

    }
}
