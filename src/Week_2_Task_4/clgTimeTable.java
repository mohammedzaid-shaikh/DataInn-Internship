// College timetable -> sorted by time

package Week_2_Task_4;

import java.time.LocalTime;
import java.util.Map;
import java.util.TreeMap;

public class clgTimeTable {
    public static void main(String[] args) {
        TreeMap<LocalTime, String> clgTimeTable = new TreeMap<>();

        clgTimeTable.put(LocalTime.of(8, 30), "Advanced Java Internship");
        clgTimeTable.put(LocalTime.of(11, 50), "Operating System");
        clgTimeTable.put(LocalTime.of(12, 40), "Information Security");
        clgTimeTable.put(LocalTime.of(11, 0), "Angular JS");
        clgTimeTable.put(LocalTime.of(13, 30), "lunch time");


        System.out.println("\nCollege Timetable:");
        for (Map.Entry<LocalTime, String> clgObj : clgTimeTable.entrySet()) {
            System.out.println(clgObj.getKey() + " -> " + clgObj.getValue());
        }
    }
}