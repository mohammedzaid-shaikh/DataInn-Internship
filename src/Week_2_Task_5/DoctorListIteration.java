package Week_2_Task_5;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class DoctorListIteration {
    public static void main(String[] args) {
        ArrayList<String> doctors = new ArrayList<>(List.of("Dr. zaid", "Dr. lal muhammed", "Dr. bashir",  "Dr. awez"));


        try {
            Iterator<String> docIter1 = doctors.iterator();

            System.out.print("\nOriginal List: [ ");
            while (docIter1.hasNext()) {
                System.out.print("\"" + docIter1.next() + "\"  ");
                doctors.add("Dr. Patel"); // Collection modification will cause -> ConcurrentModificationException
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("\nConcurrentModificationException caught: The collection was modified while iterating.");
        }


        CopyOnWriteArrayList<String> failSafeList = new CopyOnWriteArrayList<>(doctors);
        Iterator<String> docIter2 = failSafeList.iterator();

        failSafeList.add("Dr. imaad");
        failSafeList.add("Dr. nikat"); // Fail-Safe Collection modification therefore No Exception will be thrown

        System.out.print("\nOriginal List: [ ");
        while (docIter2.hasNext()) {
            System.out.print("\"" + docIter2.next() + "\"  ");
        }
        System.out.print("]\n");


        System.out.println("\nFinal List of Doctors: " + failSafeList);
    }
}