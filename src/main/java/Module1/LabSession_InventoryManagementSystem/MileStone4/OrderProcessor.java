package Module1.LabSession_InventoryManagementSystem.MileStone4;

import java.util.PriorityQueue;
import java.util.Queue;

public class OrderProcessor {
    private Queue<Order> orders;

    public OrderProcessor() {
        orders = new PriorityQueue<>();
    }

    public void addOrder(Order order) {
        orders.offer(order); // add or offer both work
    }

    public Order processOrder() {
        return orders.poll(); // retrieves and removes the highest-priority order
    }

    public int getSize() {
        return orders.size();
    }
}
