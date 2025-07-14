package Module2.Decorator;

// Decorator design pattern
// It is a structural pattern that allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class.

// Components of decorator pattern:
// 1. Component: An abstract class or interface that defines the common interface for both concrete components and decorators.
// 2. Concrete Component: A class that implements the component interface.
// 3. Decorator: An abstract class that implements the component interface and contains a reference to a component object.
// 4. Concrete Decorators: Classes that extend the decorator class and add additional behavior or state to the component.

// When to use the decorator pattern:
// - When you want to add responsibilities/behaviors to individual objects dynamically and transparently, without affecting other objects.


// Abstract base class
abstract class Burger4 {
    public abstract String description();
    public abstract double cost();
}

// Concrete Base burgers
class VeggieBurger4 extends Burger4 {
    @Override
    public String description() {
        return "Veggie Burger";
    }

    @Override
    public double cost() {
        return 50.00;
    }
}

class CheeseBurger4 extends Burger4 {
    @Override
    public String description() {
        return "Cheese Burger";
    }

    @Override
    public double cost() {
        return 70.00;
    }
}

// Abstract decorator class: (topping)
abstract class ToppingDecorator extends Burger4 {
    protected Burger4 burger;

    public ToppingDecorator(Burger4 burger) {
        this.burger = burger;
    }
}

// Concrete decorators
class ExtraCheeseTopping4 extends ToppingDecorator {

    public ExtraCheeseTopping4(Burger4 burger) {
        super(burger);
    }

    @Override
    public String description() {
        return burger.description() + ", Extra Cheese";
    }

    @Override
    public double cost() {
        return burger.cost() + 20.00;
    }
}

class TomatoTopping4 extends ToppingDecorator {

    public TomatoTopping4(Burger4 burger) {
        super(burger);
    }

    @Override
    public String description() {
        return burger.description() + ", Tomato";
    }

    @Override
    public double cost() {
        return burger.cost() + 10.00;
    }
}


public class Sol4 {
    public static void main(String[] args) {
        Burger4 myBurger = new VeggieBurger4();
        // Adding toppings using decorators
        myBurger = new ExtraCheeseTopping4(myBurger);
        myBurger = new TomatoTopping4(myBurger);
        System.out.println(myBurger.description() + " costs: " + myBurger.cost());

        // Combining toppings
        Burger4 veggieBurgerWithExtraCheeseAndTomato = new TomatoTopping4(new ExtraCheeseTopping4(new VeggieBurger4()));
        System.out.println(veggieBurgerWithExtraCheeseAndTomato.description() + " costs: " + veggieBurgerWithExtraCheeseAndTomato.cost());
    }
}
