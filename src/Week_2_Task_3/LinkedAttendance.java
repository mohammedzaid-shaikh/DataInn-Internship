package Week_2_Task_3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedAttendance {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i ++) {
            System.out.print("\nEnter [" + (i + 1) + "] Student Roll No: ");
            int rollNo = sc.nextInt();

            sc.nextLine(); // Consume newline

            if (map.containsKey(rollNo)) {
                System.out.println("Roll No Already Exists! Please Enter Again.");
                i--;
                continue;
            }

            System.out.print("Enter [" + (i + 1) + "] Student Name: ");
            String name = sc.nextLine();

            map.put(rollNo, name);
        }

        System.out.println("\nStudents Attendence List:");
        for (Map.Entry<Integer, String> mapObj : map.entrySet()) {
            System.out.println("Roll No: " + mapObj.getKey() + " : Name: " + mapObj.getValue());
        }

        System.out.print("\nEnter Student Roll No to Search: ");
        int searchRollNo = sc.nextInt();

        if (map.containsKey(searchRollNo)) {
            System.out.println("Name of Student with Roll No " + searchRollNo + ": " + map.get(searchRollNo));
        } else {
            System.out.println("\nStudent Roll No not found.");
        }

        sc.close();
    }
}
