package Module2.Singleton;
// Eager Initialization Singleton Pattern

public class EagerInit {
    //private static final Module2.Singleton.EagerInit instance
    private static EagerInit instance = new EagerInit();

    private EagerInit() {}

    public static EagerInit getInstance(){
        return instance;
    }

    public static void displayMessage(){
        System.out.println("Testing eager init");
    }

}

class Client1 {
    public static void main(String[] args) {
        EagerInit.displayMessage();
        System.out.println(EagerInit.getInstance() != null);
    }
}

// Pros:
// - Thread-safe
// - Simple to implement

// Cons:
// - Instance is created at class loading time, even if not needed
// - Cannot be used in scenarios where instance creation is expensive and not always needed
// - Parameters cannot be passed to the constructor during runtime
// - Not lazy-loaded, so it may lead to unnecessary resource consumption if the instance is never used