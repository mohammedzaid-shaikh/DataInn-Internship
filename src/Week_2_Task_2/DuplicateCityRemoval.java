package Week_2_Task_2;

import java.util.Scanner;
import java.util.LinkedHashSet;

public class DuplicateCityRemoval {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter ["+  (i + 1) + "] City Name: ");
            String city = sc.nextLine();

            cities.add(city);
        }

        System.out.println("\nList Created With Unique Cities: \n" + cities);

        sc.close();
    }
}
