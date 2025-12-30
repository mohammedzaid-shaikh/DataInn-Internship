package Week_2_Task_2;

import java.util.TreeSet;
import java.util.List;

public class SortedProductTreeSet {
    public static void main(String[] args) {
        TreeSet<Double> productPrice = new TreeSet<>(List.of(49.99, 129.50, 79.99, 199.99, 49.99, 59.75, 129.50,
                89.99, 150.00, 59.75, 199.99, 75.25, 120.00, 89.99, 220.50));

        System.out.println("\nSorted And Duplicates Removed: \n" + productPrice);
    }
}
