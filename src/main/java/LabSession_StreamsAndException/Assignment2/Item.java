package LabSession_StreamsAndException.Assignment2;

public class Item {
    private String id;
    private String name;
    private int quantity;

    public Item(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ", Quantity: " + quantity + ")";
    }
}
