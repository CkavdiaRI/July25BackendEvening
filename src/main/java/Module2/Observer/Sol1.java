package Module2.Observer;

class BurgerStock{
    private int stock = 0;

    public void setStock(int stock) {
        this.stock = stock;
        System.out.println("Website : Burger stock updated to " + stock);
        System.out.println("App : Burger stock updated to " + stock);
    }
}

public class Sol1 {
    public static void main(String[] args) {
        BurgerStock burgerStock = new BurgerStock();
        burgerStock.setStock(10);
        burgerStock.setStock(20);
        burgerStock.setStock(30);
    }
}

// Cons :
// Voilates the Open/Closed Principle
// Violates the Single Responsibility Principle
// Hard dependenies on the website and app (notification receivers)

// Pros :
// Simple implementation
// Easy to understand

