package Module1.LabSession_InventoryManagementSystem.MileStone4;

public class Order implements Comparable<Order> {
    private String orderId;
    private boolean isExpress;

    public Order(String orderId, boolean isExpress) {
        this.orderId = orderId;
        this.isExpress = isExpress;
    }

    public String getOrderId() {
        return orderId;
    }

    public boolean isExpress() {
        return isExpress;
    }

    @Override
    public int compareTo(Order o) {
        if (this.isExpress == o.isExpress) {
            // If both orders are of same type, compare by orderId
            return this.orderId.compareTo(o.orderId);
        } else if (this.isExpress) {
            // Express orders come before regular ones
            return -1;
        } else {
            return 1;
        }
    }
}
