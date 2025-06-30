package LabSession_StreamsAndException.Assignment2;
import java.util.HashMap;
import java.util.Map;

public class Inventory<T extends Item> {
    private Map<String, T> items = new HashMap<>();

    public void add(T item) throws InvalidQuantityException {
        if (item.getQuantity() < 0) {
            throw new InvalidQuantityException("Quantity for " + item.getId() + " is less than 0.");
        }
        if (items.containsKey(item.getId())) {
            throw new DuplicateItemException("Item " + item.getId() + " already exists.");
        }
        items.put(item.getId(), item);
    }

    public void printAllItems() {
        for (T item : items.values()) {
            System.out.println(item);
        }
    }
}
