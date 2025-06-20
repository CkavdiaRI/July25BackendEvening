package LabSession_InventoryManagementSystem.MileStone1;

/*
 * Represents a book item in the inventory management system.
 * Inherits from the Item class and adds an author attribute.
 */
public class Book extends Item {
    private String author;

    public Book(String id, String name, double price, int quantity, String author) {
        super(id, name, price, quantity);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
