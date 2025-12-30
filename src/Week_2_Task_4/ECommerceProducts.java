// Store products in ecommerce

package Week_2_Task_4;

import java.util.HashMap;

public class ECommerceProducts {
    public static void main(String[] args) {
        HashMap<Integer, String> products = new HashMap<>();

        products.put(101, "Laptop");
        products.put(102, "Smartphone");
        products.put(103, "Tablet");
        products.put(104, "Headphones");
        products.put(105, "Smartwatch");

        System.out.println("\nE-commerce Product List:");

        for (java.util.Map.Entry<Integer, String> entry : products.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Product Name: " + entry.getValue());
        }
    }
}

