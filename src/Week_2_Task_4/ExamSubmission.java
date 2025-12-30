// Remove duplicates from exam submissions

package Week_2_Task_4;

import java.util.HashSet;

public class ExamSubmission {
    public static void main(String[] args) {
        HashSet<Integer> examSubmit = new HashSet<>();

        examSubmit.add(101);
        examSubmit.add(102);
        examSubmit.add(102); // Duplicate Entry
        examSubmit.add(105);
        examSubmit.add(103);
        examSubmit.add(101); // Duplicate Entry
        examSubmit.add(104);
        examSubmit.add(103); // Duplicate Entry

        System.out.println("\nExam Submission List (Duplicates Removed):");

        for (Integer id : examSubmit) {
            System.out.println("Roll No: " + id);
        }
    }
}