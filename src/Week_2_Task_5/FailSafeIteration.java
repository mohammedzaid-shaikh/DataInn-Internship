// Fail-safe iterators in Java are collections that do not throw ConcurrentModificationException when the collection is modified while iterating.
// By iterating over a snapshot of the collection, rather than the actual collection itself.

package Week_2_Task_5;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.util.Iterator;

public class FailSafeIteration {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> fruits = new CopyOnWriteArrayList<>(List.of("pappya", "dragon fruit", "keve", "watermellon", "cherry"));

        Iterator<String> fruitIter = fruits.iterator();

        fruits.add("Watermelon");
        fruits.add("Pineapple"); // No ConcurrentModificationException will be thrown as it is Fail-safe

        System.out.print("\nOriginal List: [ ");
        while (fruitIter.hasNext()) {
            System.out.print("\"" + fruitIter.next() + "\"  ");
        }
        System.out.print(" ]\n\n");

        System.out.println("Modified List: " + fruits);

    }
}