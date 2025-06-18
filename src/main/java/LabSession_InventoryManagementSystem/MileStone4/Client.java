package LabSession_InventoryManagementSystem.MileStone4;

public class Client {
    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();

        processor.addOrder(new Order("C200", false)); // Regular
        processor.addOrder(new Order("A100", true));  // Express
        processor.addOrder(new Order("B150", true));  // Express
        processor.addOrder(new Order("D300", false)); // Regular

        while (processor.getSize() > 0) {
            Order order = processor.processOrder();
            System.out.println("Processing Order: " + order.getOrderId() +
                    " | Express: " + order.isExpress());
        }
    }
}
