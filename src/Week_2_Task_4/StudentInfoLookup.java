// Student roll number & name lookup

package Week_2_Task_4;

import java.util.HashMap;
import java.util.Scanner;

public class StudentInfoLookup {
    public static void main(String[] args) {
        HashMap<Integer, String> studentRegister = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        studentRegister.put(302, "zaid sk");
        studentRegister.put(303, "Shams");
        studentRegister.put(304, "Sakib Khan");
        studentRegister.put(305, "fardeen khan");
        studentRegister.put(306, "guddu bhaiya");

        System.out.println("\nStudent Roll No : Student Name");
        for (HashMap.Entry<Integer, String> studentObj : studentRegister.entrySet()) {
            System.out.println(studentObj.getKey() + " :\t" + studentObj.getValue());
        }

        System.out.print("\nEnter Roll No to search Student Name: ");
        int rollNo = sc.nextInt();

        if (studentRegister.containsKey(rollNo)) {
            System.out.println("Student Name: " + studentRegister.get(rollNo));
        } else {
            System.out.println("Roll No " + rollNo + " not found in the register.");
        }

        sc.close();
    }
}