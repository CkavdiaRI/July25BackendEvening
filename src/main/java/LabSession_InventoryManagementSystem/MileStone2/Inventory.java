package LabSession_InventoryManagementSystem.MileStone2;
import LabSession_InventoryManagementSystem.MileStone1.*;
import java.util.*;

// Inventory is a generic class where T must extend Item
public class Inventory<T extends Item> {
    private HashMap<String, T> items;

    public Inventory() {
        items = new HashMap<>();
    }

    // Add an item to the inventory
    public void add(T item){
        items.put(item.getId(), item);
    }

    // Remove an item from inventory
    public void remove(T item) {
        items.remove(item.getId());
    }

    // Get an item by its ID
    public T get(String id) {
        return items.get(id);
    }

    // Get a list of all items in the inventory
    public List<T> getAll() {
        return new ArrayList<>(items.values());
    }
}