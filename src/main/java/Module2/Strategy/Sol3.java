package Module2.Strategy;

class Navigation3{
    private RouteStrategy routeStrategy;

    // constructor injection is also a good option, but it makes the class less flexible
    Navigation3(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void navigate() {
        if (routeStrategy != null) {
            routeStrategy.calculate();
        } else {
            System.out.println("Please choose a valid route type.");
        }
    }
}

interface RouteStrategy {
    void calculate();
}

class FastestRoute implements RouteStrategy {
    public void calculate() {
        System.out.println("Calculating the fastest route...");
    }
}

class ShortestRoute implements RouteStrategy {
    public void calculate() {
        System.out.println("Calculating the shortest route...");
    }
}

class AvoidTollsRoute implements RouteStrategy {
    public void calculate() {
        System.out.println("Calculating the avoid tolls route...");
    }
}

class ScenicRoute implements RouteStrategy {
    public void calculate() {
        System.out.println("Calculating the scenic route...");
    }
}

public class Sol3 {
    public static void main(String[] args) {
        Navigation3 navigation = new Navigation3(new FastestRoute());
        navigation.navigate();

        Navigation3 navigation2 = new Navigation3(new ShortestRoute());
        navigation2.navigate();

        Navigation3 navigation3 = new Navigation3(new AvoidTollsRoute());
        navigation3.navigate();

        Navigation3 navigation4 = new Navigation3(new ScenicRoute());
        navigation4.navigate();
    }
}

// Pros :
// - Follows Open/Closed Principle: New route strategies can be added without modifying existing code.
// - No if-else statements
//  Loose coupling: The Navigation class is not tightly coupled to specific route strategies.
//  Modular code
//  Testing will be easier as each strategy can be tested independently.

// Cons :
// Can't modify the route strategy at runtime without creating a new Navigation object since we are doing constructor injection.