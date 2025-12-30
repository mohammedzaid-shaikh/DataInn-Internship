package Week_2_Task_3;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapMarksMGMT {
    public static void main(String[] args) {
        HashMap<Integer, Float> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            System.out.print("\nEnter [" + (i + 1) + "] Student ID: ");
            int rollNo = sc.nextInt();

            System.out.print("Enter [" + (i + 1) + "] Student Marks [ Marks / 100 ]: ");
            Float marks = sc.nextFloat();

            map.put(rollNo, marks);
        }


        System.out.print("\nEnter Student ID to Update Marks: ");
        int updateId = sc.nextInt();

        if (map.containsKey(updateId)) {
            System.out.print("Enter New Marks for Student ID [" + updateId + "]: ");
            Float newMarks = sc.nextFloat();
            map.put(updateId, newMarks);
            System.out.println("Marks updated successfully.");
        } else {
            System.out.println("\nStudent ID not found.");
        }


        System.out.print("\nEnter Student ID to Search: ");
        int searchId = sc.nextInt();

        if (map.containsKey(searchId)) {
            System.out.println("Marks of Student ID " + searchId + ": " + map.get(searchId) +  "%");
        } else {
            System.out.println("\nStudent ID not found.");
        }

        for (HashMap.Entry<Integer, Float> entry : map.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " :Marks: " + entry.getValue() + "%");
        }


        sc.close();
    }
}
