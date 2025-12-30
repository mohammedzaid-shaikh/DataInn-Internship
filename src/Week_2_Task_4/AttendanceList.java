// Maintain order of attendance list

package Week_2_Task_4;

import java.util.LinkedHashSet;

public class AttendanceList {
    public static void main(String[] args) {
        LinkedHashSet<Integer> AttendSet = new LinkedHashSet<>();

        AttendSet.add(101);
        AttendSet.add(102);
        AttendSet.add(103);
        AttendSet.add(102); // Duplicate Entry
        AttendSet.add(101); // Duplicate Entry
        AttendSet.add(104);
        AttendSet.add(105);

        System.out.println("\nStudent Attendance List:");

        for (Integer id : AttendSet) {
            System.out.println("Roll No: " + id);
        }
    }
}