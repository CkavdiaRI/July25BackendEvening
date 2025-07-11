package Module2.FactoryAndAbstractFactory;

// Factory method design pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. It promotes loose coupling by eliminating the need to bind application-specific classes into your code.


// Abstract product interface
interface Burger3 {
    void prepare();
}

// Concrete product classes
class VegBurger3 implements Burger3 {
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Burger");
    }
}

class CheeseBurger3 implements Burger3 {
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Burger");
    }
}

class MexicanBurger3 implements Burger3 {
    @Override
    public void prepare() {
        System.out.println("Preparing Mexican Burger");
    }
}

// Factory class
abstract class BurgerFactory {
    abstract Burger3 createBurger();

    public void orderBurger(){
        Burger3 burger = createBurger();
        burger.prepare();
        System.out.println("Burger ordered successfully!");
    }
}

// Concrete factory classes
class VegBurgerFactory extends BurgerFactory {
    @Override
    Burger3 createBurger() {
        return new VegBurger3();
    }
}

class CheeseBurgerFactory extends BurgerFactory {
    @Override
    Burger3 createBurger() {
        return new CheeseBurger3();
    }
}

class MexicanBurgerFactory extends BurgerFactory {
    @Override
    Burger3 createBurger() {
        return new MexicanBurger3();
    }
}


public class Sol3 {
    public static void main(String[] args) {
        BurgerFactory burgerfactory = new CheeseBurgerFactory();
        burgerfactory.orderBurger();

        BurgerFactory mexicanBurgerFactory = new MexicanBurgerFactory();
        mexicanBurgerFactory.orderBurger();
    }
}


// Pros :
// 1. Decouples the burger creation logic from the client code, adhering to the Single Responsibility Principle.
// 2. Follows the Open/Closed Principle, allowing for easy addition of new burger types without modifying existing code.
// 3. Reduces the complexity of the client code by removing if-else statements.
// 4. Makes it easier to test and mock in unit tests due to the separation of concerns.
// 5. Provides a clear and consistent interface for creating burgers, making the code more readable and maintainable.
// 6. Allows for easy extension of the factory to support new burger types by simply adding new factory classes.