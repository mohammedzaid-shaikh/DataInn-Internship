package Week_2_Task_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesHashSet {
    public static void main(String[] args) {
        ArrayList<String> strArrList = new ArrayList<>(List.of("zaid","fatima","zaid","suresh","fatima","Sakib","zaid"));

        System.out.println("\nORIGINAL ArrayList: " + strArrList);
        System.out.println("Type of Data Structure Above: " + strArrList.getClass().getSimpleName());

        HashSet<String> hashList = new HashSet<>(strArrList);

        System.out.println("\nDUPLICATES REMOVED HashSet: " + hashList);
        System.out.println("Type of Data Structure Above: " + hashList.getClass().getSimpleName());

        ArrayList<String> hashArrList = new ArrayList<>(hashList);

        System.out.println("\nDUPLICATES REMOVED ArrayList: " + hashArrList);
        System.out.println("Type of Data Structure Above: " + hashArrList.getClass().getSimpleName());
    }
}
