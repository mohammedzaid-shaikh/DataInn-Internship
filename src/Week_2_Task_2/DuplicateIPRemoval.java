package Week_2_Task_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class DuplicateIPRemoval {
    public static void main(String[] args) {
        ArrayList<String> IPAddress = new ArrayList<>(List.of("192.168.10.1", "192.168.10.2", "192.168.10.3", "192.168.10.4", "192.168.10.2", "192.168.10.3",
                "192.168.10.5", "192.168.10.1", "192.168.10.6", "192.168.10.4"));

        System.out.println("\nOriginal IP Addresses: \n" + IPAddress);

        HashSet<String> UniqueIPAddress = new HashSet<>(IPAddress);

        System.out.println("\nUnique IP Addresses: \n" + UniqueIPAddress);
    }
}
