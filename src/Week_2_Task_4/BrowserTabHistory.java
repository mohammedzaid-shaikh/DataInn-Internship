// Keep browser back–forward history

package Week_2_Task_4;

import java.util.LinkedList;

public class BrowserTabHistory {
    public static void main(String[] args) {
        LinkedList<String> tabHistory = new LinkedList<>();

        tabHistory.add("www.google.com");
        tabHistory.add("www.youtube.com");
        tabHistory.add("www.github.com");
        tabHistory.add("www.w3schools.com");
        tabHistory.add("www.youtube.com");


        System.out.println("\nBrowser Tab History:");
        for (String url : tabHistory) {
            System.out.println("Visited: " + url);
        }


        // Simulating back and forward navigation
        System.out.println("\nNavigating Back and Forward:");
        while (!tabHistory.isEmpty()) {
            String currentUrl = tabHistory.pollLast(); // Retrieves and removes the last visited URL
            System.out.println("Going back to: " + currentUrl);
        }
    }
}
