package LabSession_StreamsAndException.Assignment2;

public class Client {
    public static void main(String[] args) {
        Inventory<Item> inventory = new Inventory<>();

        Item laptop = new Item("101", "Laptop", 5);
        Item mobilePhone = new Item("102", "Mobile Phone", 10);
        Item earphones = new Item("103", "Earphones", 0);
        Item javaBook = new Item("104", "Java Book", -2); // Invalid quantity
        Item tShirt = new Item("101", "T-Shirt", 3);      // Duplicate ID

        try {
            inventory.add(laptop);
            inventory.add(mobilePhone);
            inventory.add(earphones);
            inventory.add(javaBook);    // This should trigger InvalidQuantityException
            inventory.add(tShirt);      // This would throw DuplicateItemException if reached
        } catch (InvalidQuantityException ex) {
            System.out.println("Exception: " + ex.getMessage());
        } finally {
            System.out.println("Added Items");
        }

        System.out.println("Current Inventory:");
        inventory.printAllItems();
    }
}
