// Manage print queue jobs

package Week_2_Task_4;

import java.util.LinkedList;

public class PrinterQueue {
    public static void main(String[] args) {
        LinkedList<String> printQueue = new LinkedList<>();

        // Adding print jobs to the queue
        printQueue.add("Document1.pdf");
        printQueue.add("Image1.png");
        printQueue.add("Report.docx");
        printQueue.add("Presentation.pptx");
        printQueue.add("Spreadsheet.xlsx");

        System.out.println("\nPrint Queue Jobs:");
        for (String job : printQueue) {
            System.out.println("Print Job: " + job);
        }

        // Simulating processing of print jobs
        System.out.println("\nProcessing Print Jobs:");
        while (!printQueue.isEmpty()) {
            String currentJob = printQueue.poll(); // Retrieves and removes the head of the queue
            System.out.println("Printing: " + currentJob);
        }
    }
}