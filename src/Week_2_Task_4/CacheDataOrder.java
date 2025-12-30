// Cache with insertion order

package Week_2_Task_4;

import java.util.LinkedList;

public class CacheDataOrder {
    public static void main(String[] args) {
        LinkedList<String> cache = new LinkedList<>();

        // Simulating cache data insertions
        cache.add("Item1 data");
        cache.add("Item5 data");
        cache.add("Item2 data");
        cache.add("Item2 data"); // Duplicate Entry
        cache.add("Item3 data");
        cache.add("Item4 data");
        cache.add("Item3 data"); // Duplicate Entry
        cache.add("Item5 data"); // Duplicate Entry

        System.out.println("\nCache Contents (Insertion Order):");
        for (String item : cache) {
            System.out.println("Cached: " + item);
        }
    }
}
