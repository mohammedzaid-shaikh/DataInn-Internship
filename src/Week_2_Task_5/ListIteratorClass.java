// Iterating ArrayList using an ListIterator

package Week_2_Task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorClass {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(List.of("pink", "white", "Black", "brown", "blue", "red"));

        // colors ArrayList forward iteration
        ListIterator<String> colorIter1 = colors.listIterator();


        System.out.print("\n[ ");
        while (colorIter1.hasNext()) {
            System.out.print("\"" + colorIter1.next() + "\"  ");
        }
        System.out.print(" ]\n");


        // colors ArrayList reverse iteration from start
        ListIterator<String> colorIter2 = colors.listIterator(colors.size());


        System.out.print("\n[ ");
        while (colorIter2.hasPrevious()) {
            System.out.print("\"" + colorIter2.previous() + "\"  ");
        }
        System.out.print(" ]\n");
    }
}