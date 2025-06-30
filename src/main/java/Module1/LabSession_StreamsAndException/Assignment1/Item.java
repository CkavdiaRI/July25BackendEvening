package Module1.LabSession_StreamsAndException.Assignment1;

public class Item {
    private String id;
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
}
