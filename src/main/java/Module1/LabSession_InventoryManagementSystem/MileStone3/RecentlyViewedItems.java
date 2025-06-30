package Module1.LabSession_InventoryManagementSystem.MileStone3;

import Module1.LabSession_InventoryManagementSystem.MileStone1.*;
import Module1.LabSession_InventoryManagementSystem.MileStone1.Item;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems {
    private LinkedList<Item> items;
    private final int MAX_SIZE = 10;

    public RecentlyViewedItems() {
        this.items = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item) {
        // Remove the item if it's already present (to move it to the front)
        items.remove(item);

        // Add the item to the front
        items.addFirst(item);

        // If size exceeds 10, remove the last (oldest)
        if (items.size() > MAX_SIZE) {
            items.removeLast();
        }
    }

    public List<Item> getRecentlyViewedItems() {
        return new ArrayList<>(items); // Return a copy to prevent external changes
    }
}