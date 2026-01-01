package Week_3_Task_3;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class JavaTemp1 {
    public static void main(String[] args) {
//
//        try (FileWriter fw = new FileWriter("E:\\AAA-YUNUS_BSc\\TY\\TY-SEM-2\\Data-Inn-Internship\\" +
//                "Java-Project-Container\\DataInn_Internship_Tasks\\src\\Week_3_Task_3\\log.txt", true)) {
//
//            fw.write("Hello, my name is Yunus Bagewadi, and I am learning Advance Java.\n");
//            fw.write("Life is a journey of learning from out mistakes more, than our successes.\n");
//            fw.append("Life is a journey of learning from out mistakes more, than our successes.");
//
//            System.out.println("File Writing Done!");
//
//        } catch (IOException err) {
//            err.printStackTrace();
//        }

//        LocalDateTime now = LocalDateTime.now();
//        String timestamp = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//
//        System.out.println(timestamp);

//        String fileName = "E:\\AAA-YUNUS_BSc\\TY\\TY-SEM-2\\Data-Inn-Internship\\" +
//                "Java-Project-Container\\DataInn_Internship_Tasks\\src\\Week_3_Task_3\\log.txt";
//
//        String username = "hehe";
//        String password  = "1234";
//
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true)); Scanner sc = new Scanner(System.in)) {
//
//            LocalDateTime now = LocalDateTime.now();
//            String timestamp = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//
//            String logStart = "START", logError = "ERROR", logSuccess = "SUCCESS", logEnd = "END-OF-LINE";
//
//            bw.newLine();
//            bw.write("-----------------------------------------------------------------------\n");
//            bw.write(timestamp + " :: " + logStart + " :: " + "Program Execution Initiated.\n");
//
//            System.out.print("\nEnter Your Username: ");
//            String checkUser = sc.nextLine();
//
//            System.out.print("Enter Your Password: ");
//            String checkPass = sc.nextLine();
//
//            if (!Objects.equals(username, checkUser) || !Objects.equals(password, checkPass)) {
//                bw.write(timestamp + " :: " + logError + " :: " + "Wrong Credentials Entered.\n");
//                System.out.println("Wrong Credentials Entered.");
//            } else {
//                bw.write(timestamp + " :: " + logSuccess + " :: " + "Access Granted!\n");
//                System.out.println("Access Granted!");
//            }
//
//            bw.write(timestamp + " :: " + logEnd + " :: " + "Program Execution Terminated.\n");
//            bw.write("-----------------------------------------------------------------------");
//            bw.newLine();
//
//        } catch (FileNotFoundException err) {
//            System.out.println("FileNotFoundException: " + err.getMessage());
//        } catch (IOException err) {
//            System.out.println("IOException: " + err.getMessage());
//        }

//        String[] infoMessages = {"User logged in", "Process completed", "Connection established", "File saved",
//                "Task scheduled"};
//        String[] warnMessages = {"Low memory", "High CPU usage", "Disk space running low", "Slow network detected",
//                "Deprecated API used"};
//        String[] errorMessages = {"Null pointer exception", "Array index out of bounds", "Database connection failed",
//                "File not found", "Invalid input detected"};
//
//        String fileName = "E:\\AAA-YUNUS_BSc\\TY\\TY-SEM-2\\Data-Inn-Internship\\" +
//                "Java-Project-Container\\DataInn_Internship_Tasks\\src\\Week_3_Task_3\\log3.txt";
////
//        Random rand = new Random();
//
//
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
//             Scanner sc = new Scanner(System.in)) {
//
//            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//
//            bw.write("\n\nStart Log: \n------------------------------------------------------------------------\n");
//            for (int i = 0; i < 25; i++) {
//                String message = infoMessages[rand.nextInt(infoMessages.length)];
//                bw.write(LocalDateTime.now().format(dtf) + " ::  INFO :: " + message);
//                bw.newLine();
//            }
//            bw.write("------------------------------------------------------------------------\n");
//
//
//            for (int i = 0; i < 15; i++) {
//                String message = warnMessages[rand.nextInt(warnMessages.length)];
//                bw.write(LocalDateTime.now().format(dtf) + " ::  WARN :: " + message);
//                bw.newLine();
//            }
//            bw.write("------------------------------------------------------------------------\n");
//
//
//            for (int i = 0; i < 10; i++) {
//                String message = errorMessages[rand.nextInt(errorMessages.length)];
//                bw.write(LocalDateTime.now().format(dtf) + " ::  ERROR :: " + message);
//                bw.newLine();
//            }
//            bw.write("------------------------------------------------------------------------\n:End Log\n");
//
//            System.out.println("Logs Generated Successfully.");
//
//        } catch (FileNotFoundException err) {
//            System.out.println("FileNotFoundException: " + err.getMessage());
//        } catch (IOException err) {
//            System.out.println("IOException: " + err.getMessage());
//        }

        String line = "2025-12-05 03:15:39 :: INFO :: Task scheduled";
        System.out.println(line.substring(0, 19));

    }
}


































