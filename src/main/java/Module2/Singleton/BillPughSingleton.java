package Module2.Singleton;
//Bill Pugh Singleton Pattern

public class BillPughSingleton {

    private BillPughSingleton() {  }

    //Static inner class - Loaded only when getInstance() is called
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static void display() {
        System.out.println("Module2.Singleton.BillPughSingleton");
    }

}

class Client4 {
    public static void main(String[] args) {
        BillPughSingleton.display();

        BillPughSingleton instance1 = BillPughSingleton.getInstance();
    }
}

// Pros:
// - Thread-safe without synchronization overhead
// - Lazy initialization
// - Memory efficient as the instance is created only when needed
// - Simple to implement

// Cons:
// - Slightly more complex than the basic singleton pattern
// - Still cannot pass parameters to the constructor


