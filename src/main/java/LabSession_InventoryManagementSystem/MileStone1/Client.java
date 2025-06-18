package LabSession_InventoryManagementSystem.MileStone1;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        items.add(new Book("B001", "Java Basics", 300.0, 10, "John Doe"));
        items.add(new Clothing("C001", "T-Shirt", 250.0, 20, "M"));
        items.add(new Electronics("E001", "Smartphone", 15000.0, 5, 12));
        items.add(new Book("B002", "Data Structures", 400.0, 7, "Jane Smith"));

        System.out.println("Before Sorting:");
        for (Item item : items) {
            System.out.println(item.getName() + " - ₹" + item.getPrice());
        }

        // 💡 This is where compareTo() is called internally
        Collections.sort(items);  // uses compareTo()

        System.out.println("\nAfter Sorting by Price (Ascending):");
        for (Item item : items) {
            System.out.println(item.getName() + " - ₹" + item.getPrice());
        }
    }
}
