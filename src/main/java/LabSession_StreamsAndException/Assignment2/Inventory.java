package LabSession_StreamsAndException.Assignment2;
import java.util.HashMap;
import java.util.Map;

public class Inventory<T extends Item> {
    private Map<String, T> items = new HashMap<>();

    public void add(T item){
        // ToDo
    }

    public void printAllItems() {
        for (T item : items.values()) {
            System.out.println(item);
        }
    }
}
