package Module1.LabSession_InventoryManagementSystem.MileStone1;

public class Item implements Comparable<Item> {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Ascending order by price
    @Override
    public int compareTo(Item o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        }
        return 0;
    }





//    // ✅ Only compare 'id' to check item identity
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (!(obj instanceof Item)) return false;
//        Item other = (Item) obj;
//        return this.id.equals(other.id);
//    }
}
