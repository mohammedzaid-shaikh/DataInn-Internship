package Week_2_Task_3;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>(Map.of(
                401, "hamza kazi",
                402, "umar sayyad",
                403, "aziz shaikh",
                404, "imaad shaikh",
                405, "Saad khan"
        ));

        System.out.println("\nEmp ID : Emp Name");
        for (Map.Entry<Integer, String> mapObj : map.entrySet()) {
            System.out.println(mapObj.getKey() + " :\t" + mapObj.getValue());
        }
    }
}
