package Week_3_Task_3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedLogAnalyzer {
    public static void main(String[] args) {

        String fileName = "E:\\AAA-YUNUS_BSc\\TY\\TY-SEM-2\\Data-Inn-Internship\\" +
                "Java-Project-Container\\DataInn_Internship_Tasks\\src\\Week_3_Task_3\\log3.txt";

        int logLines = 0, infoLog = 0, errLog = 0, warnLog = 0;
        String longestLog = "", firstTimestamp = null, lastTimestamp = null;


        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {

                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }

                if (line.matches("^\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}:\\d{2} :: .*? :: .*")) {
                    System.out.println(line);
                    logLines++;
                    if (line.length() > longestLog.length()) {
                        longestLog = line;
                    }
                    if (firstTimestamp == null) {
                        firstTimestamp = line.substring(0, 19);
                    }
                    lastTimestamp = line.substring(0, 19);
                }

                if (line.contains(":: INFO ::")) {
                    infoLog++;
                }

                if (line.contains(":: WARN ::")) {
                    warnLog++;
                }

                if (line.contains(":: ERROR ::")) {
                    errLog++;
                }
            }

            System.out.println("\nTotal Log Lines: " + logLines);
            System.out.println("Total Info Logs: " + infoLog);
            System.out.println("Total Warn Logs: " + warnLog);
            System.out.println("Total Error Logs: " + errLog);
            System.out.println("Longest Log Line: " + longestLog);
            System.out.println("First Time Stamp: " + firstTimestamp);
            System.out.println("Last Time Stamp: " + lastTimestamp);


        } catch (FileNotFoundException err) {
            System.out.println("FileNotFoundException: " + err.getMessage());
        } catch (IOException err) {
            System.out.println("IOException: " + err.getMessage());
        }

    }
}
