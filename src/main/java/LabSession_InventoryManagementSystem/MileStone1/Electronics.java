package LabSession_InventoryManagementSystem.MileStone1;

/**
 * Represents an electronic item in the inventory management system.
 * Inherits from the Item class and adds a warranty period.
 */
public class Electronics extends Item {
    private int warranty;

    public Electronics(String id, String name, double price, int quantity, int warranty) {
        super(id, name, price, quantity);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}
