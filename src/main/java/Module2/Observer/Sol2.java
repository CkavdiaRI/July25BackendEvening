package Module2.Observer;

interface stockListener {
    void stockUpdated(int stock);
}

class Webiste implements stockListener{
    @Override
    public void stockUpdated(int stock) {
        System.out.println("Website : Burger stock updated to " + stock);
    }
}

class App implements stockListener{
    @Override
    public void stockUpdated(int stock) {
        System.out.println("App : Burger stock updated to " + stock);
    }
}

class BurgerStock2 {
    private int stock = 0;
    stockListener website = new Webiste();
    stockListener app = new App();

    void setStock(int stock) {
        this.stock = stock;
        website.stockUpdated(stock);
        app.stockUpdated(stock);
    }
}

public class Sol2 {
    public static void main(String[] args) {
        BurgerStock2 burgerStock = new BurgerStock2();
        burgerStock.setStock(10);
        burgerStock.setStock(20);
        burgerStock.setStock(30);
    }
}

// Pros :
// - Better separation of concerns
// - Modular design

// Cons :
// - Still hardcoded dependencies on website and app
// - Not easily extensible for other notification receivers
// - Still violates Open/Closed Principle
// - Tight coupling between BurgerStock2 and its listeners


