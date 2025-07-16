package Module2.Observer;
import java.util.ArrayList;
import java.util.List;

interface StockListener3{
    void stockUpdated(int stock);
}

class Website3 implements StockListener3 {
    @Override
    public void stockUpdated(int stock) {
        System.out.println("Website : Burger stock updated to " + stock);
    }
}

class App3 implements StockListener3 {
    @Override
    public void stockUpdated(int stock) {
        System.out.println("App : Burger stock updated to " + stock);
    }
}

class BurgerStock3 {
    private int stock = 0;
    private List<StockListener3> listeners = new ArrayList<>();

    void addListener(StockListener3 listener) {
        listeners.add(listener);
    }

    void setStock(int stock) {
        this.stock = stock;
        for (StockListener3 listener : listeners) {
            listener.stockUpdated(stock);
        }
    }
}

public class Sol3 {
    public static void main(String[] args) {
        BurgerStock3 burgerStock = new BurgerStock3();

        // Adding listeners
        burgerStock.addListener(new Website3());
        burgerStock.addListener(new App3());

        // Updating stock
        burgerStock.setStock(10);
        burgerStock.setStock(20);
        burgerStock.setStock(30);
    }
}

// Pros:
// - Follows Open/Closed Principle: New listeners can be added without modifying existing code.
// - Loose coupling: Listeners are added dynamically, allowing for greater flexibility and extensibility.
// - Easy to extend: New notification receivers can be added without changing the BurgerStock3 class.
// - Better separation of concerns: Each listener handles its own notification logic.
// - More modular design: The system can be easily extended with new listeners without affecting existing functionality.

// Cons:

