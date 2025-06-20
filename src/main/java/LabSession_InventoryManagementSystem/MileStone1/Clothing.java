package LabSession_InventoryManagementSystem.MileStone1;

/**
 * Represents a clothing item in the inventory management system.
 * Inherits from the Item class and adds a size attribute.
 */
public class Clothing extends Item {
    private String size;

    public Clothing(String id, String name, double price, int quantity, String size) {
        super(id, name, price, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

