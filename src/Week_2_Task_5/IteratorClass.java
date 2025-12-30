// Iterating ArrayList using an Iterator

package Week_2_Task_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorClass {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>(List.of("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"));

        Iterator<String> arrIter = arrList.iterator();

        // Iterator.hasNext() and Iterator.next() methods
        // while (arrIter.hasNext()) {
        //     System.out.println(arrIter.next());
        // }

        // Iterator.remove() method
        while (arrIter.hasNext()) {
            String day = arrIter.next();

            if (day.length() == 6) {
                arrIter.remove();
            } else {
                System.out.println(day);
            }
        }

    }
}