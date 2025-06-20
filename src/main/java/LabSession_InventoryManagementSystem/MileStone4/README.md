## Milestone 4: Order Processing with Priority Queue

**Objective:**  
Process orders by prioritizing express orders using a `PriorityQueue`.

### Tasks:

1. **Create the `Order` Class:**
    - Attributes:
        - `String orderId`
        - `boolean isExpress` (true for express orders, false for regular ones).

2. **Implement the Order Queue:**
    - Use `PriorityQueue<Order>` to store orders.

3. **Write Methods for Order Queue:**
    - `addOrder(Order order)`: Add an order to the queue.
    - `processOrder()`: Process and remove the highest-priority order (express orders first).

4. **Test Order Queue:**
    - Add multiple express and regular orders.
    - Test if express orders are processed first.
