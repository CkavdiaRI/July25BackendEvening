package LabSession_InventoryManagementSystem.MileStone2;
import LabSession_InventoryManagementSystem.MileStone1.*;

public class Client {
    public static void main(String[] args) {
        Inventory<Clothing> inventory = new Inventory();
        // Adding items to the inventory
        inventory.add(new Clothing("C001", "T-Shirt", 19.99, 100, "M"));
        inventory.add(new Clothing("C002", "Jeans", 39.99, 50, "L"));
        inventory.add(new Clothing("C003", "Jacket", 59.99, 30, "XL"));

        inventory.remove(inventory.get("C001"));
//        inventory.add(new Electronics("E001", "Smartphone", 299.99, 20, 24));

        inventory.getAll().forEach(item -> System.out.println(item.getName()));
    }
}
