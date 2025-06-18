package LabSession_InventoryManagementSystem.MileStone3;

import LabSession_InventoryManagementSystem.MileStone1.*;
import java.util.List;
import java.lang.String;

public class Client {
    public static void main(String[] args) {
        RecentlyViewedItems recentItems = new RecentlyViewedItems();

        // Add more than 10 items
        recentItems.addRecentlyViewedItem(new Item("1", "Laptop", 75000.00, 5));
        recentItems.addRecentlyViewedItem(new Item("2", "Book", 499.00, 20));
        recentItems.addRecentlyViewedItem(new Item("3", "T-Shirt", 999.00, 10));
        recentItems.addRecentlyViewedItem(new Item("4", "Smartphone", 60000.00, 3));
        recentItems.addRecentlyViewedItem(new Item("5", "Shoes", 2999.00, 7));
        recentItems.addRecentlyViewedItem(new Item("6", "Headphones", 1999.00, 12));
        recentItems.addRecentlyViewedItem(new Item("7", "Watch", 3499.00, 4));
        recentItems.addRecentlyViewedItem(new Item("8", "Bag", 1499.00, 9));
        recentItems.addRecentlyViewedItem(new Item("9", "Keyboard", 1200.00, 15));
        recentItems.addRecentlyViewedItem(new Item("10", "Notebook", 79.00, 100));
        recentItems.addRecentlyViewedItem(new Item("11", "Charger", 899.00, 25));
        recentItems.addRecentlyViewedItem(new Item("12", "Pen", 20.00, 200));

        // Re-view a couple of items
        recentItems.addRecentlyViewedItem(new Item("5", "Shoes", 2999.00, 7));
        recentItems.addRecentlyViewedItem(new Item("9", "Keyboard", 1200.00, 15));

        // Print final list
        printItems("Recently Viewed Items (Max 10):", recentItems.getRecentlyViewedItems());
    }

    private static void printItems(String title, List<Item> items) {
        System.out.println(title);
        for (Item item : items) {
            System.out.println("  - " + item.getName());
        }
        System.out.println();
    }
}
