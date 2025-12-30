// A Fail-Fast iterator is an iterator that immediately throws an exception when The collection is structurally modified
// while iterating without using the iterator’s own modification methods.

package Week_2_Task_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIteration {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));

        Iterator<Integer> numIter = numbers.iterator();

        numbers.add(110); // collection is structurally modified while iterating -> ConcurrentModificationException

        while (numIter.hasNext()) {
            System.out.println(numIter.next());
        }

    }
}