// Iterating ArrayList using a For-Each Loop

package Week_2_Task_5;

import java.util.ArrayList;
import java.util.List;

public class ForEachIterator {
    public static void main(String[] args) {
        ArrayList<String> family = new ArrayList<>(List.of("abba", "ammi", "Brother", "Sister", "Aunty", "Uncle"));

        // For-Each Loop to iterate through the ArrayList
        for (String fam : family) {
            System.out.println(fam);
        }
    }
}