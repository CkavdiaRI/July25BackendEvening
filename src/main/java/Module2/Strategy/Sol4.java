package Module2.Strategy;

// Strategy design pattern is a behavioral design pattern that enables selecting an algorithm/strategy at runtime.
// It defines a family of algorithms, encapsulates each one, and makes them interchangeable.

// When to use Strategy Pattern ?
// 1. When you have multiple algorithms for a specific task and you want to choose one at runtime.
// 2. When you want to avoid using multiple conditional statements (if-else or switch-case) to select an algorithm.
// 3. When you want to decouple the algorithm from the client code, allowing for easier maintenance and extension.

// Component of Strategy Pattern
// 1. Context: The class that uses the strategy.
// 2. Strategy: An interface that defines a family of algorithms.
// 3. Concrete Strategy: Classes that implement the Strategy interface, providing specific implementations of the algorithms.


class Navigation4{
    private RouteStrategy routeStrategy;

//    // constructor injection is also a good option, but it makes the class less flexible
//    Navigation3(RouteStrategy routeStrategy) {
//        this.routeStrategy = routeStrategy;
//    }

    // setter is better here because it allows changing the strategy at runtime
    public void setRouteStrategy(RouteStrategy routeStrategy) {
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

interface RouteStrategy4 {
    void calculate();
}

class FastestRoute4 implements RouteStrategy {
    public void calculate() {
        System.out.println("Calculating the fastest route...");
    }
}

class ShortestRoute4 implements RouteStrategy {
    public void calculate() {
        System.out.println("Calculating the shortest route...");
    }
}

class AvoidTollsRoute4 implements RouteStrategy {
    public void calculate() {
        System.out.println("Calculating the avoid tolls route...");
    }
}

class ScenicRoute4 implements RouteStrategy {
    public void calculate() {
        System.out.println("Calculating the scenic route...");
    }
}

public class Sol4 {
    public static void main(String[] args) {
        Navigation4 navigation = new Navigation4();

        navigation.setRouteStrategy(new FastestRoute4());
        navigation.navigate();

        navigation.setRouteStrategy(new ShortestRoute4());
        navigation.navigate();

        navigation.setRouteStrategy(new AvoidTollsRoute4());
        navigation.navigate();

        navigation.setRouteStrategy(new ScenicRoute4());
        navigation.navigate();

        // If no route strategy is set
        navigation.setRouteStrategy(null);
        navigation.navigate();


    }
}

// Pros :
// - Follows Open/Closed Principle: New route strategies can be added without modifying existing code.
// - No if-else statements
//  Loose coupling: The Navigation class is not tightly coupled to specific route strategies.
//  Modular code
//  Testing will be easier as each strategy can be tested independently.
