package Module2.Decorator;

abstract class Burger3 {
    public abstract String description();
    public abstract double cost();
}

// Base burgers
class VeggieBurger3 extends Burger3 {
    @Override
    public String description() {
        return "Veggie Burger";
    }

    @Override
    public double cost() {
        return 50.00;
    }
}

class CheeseBurger3 extends Burger3 {
    @Override
    public String description() {
        return "Cheese Burger";
    }

    @Override
    public double cost() {
        return 70.00;
    }
}


class ExtraCheeseTopping extends Burger3 {
    private Burger3 burger;

    // No default constructor

    public ExtraCheeseTopping(Burger3 burger) {
        this.burger = burger;
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

class TomatoTopping extends Burger3 {
    private Burger3 burger;

    public TomatoTopping(Burger3 burger) {
        this.burger = burger;
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

class LettuceTopping extends Burger3 {
    private Burger3 burger;

    public LettuceTopping(Burger3 burger) {
        this.burger = burger;
    }

    @Override
    public String description() {
        return burger.description() + ", Lettuce";
    }

    @Override
    public double cost() {
        return burger.cost() + 5.00;
    }
}

class OnionTopping extends Burger3 {
    private Burger3 burger;

    public OnionTopping(Burger3 burger) {
        this.burger = burger;
    }

    @Override
    public String description() {
        return burger.description() + ", Onion";
    }

    @Override
    public double cost() {
        return burger.cost() + 5.00;
    }
}

public class Sol3 {
    public static void main(String[] args) {
        Burger3 veggieBurger = new VeggieBurger3();
        System.out.println(veggieBurger.description() + " costs: " + veggieBurger.cost());

        Burger3 cheeseBurger = new CheeseBurger3();
        System.out.println(cheeseBurger.description() + " costs: " + cheeseBurger.cost());

        // Adding toppings to Veggie Burger
        Burger3 myBurger = new ExtraCheeseTopping(veggieBurger);
        System.out.println(myBurger.description() + " costs: " + myBurger.cost());

        myBurger = new TomatoTopping(myBurger);
        System.out.println(myBurger.description() + " costs: " + myBurger.cost());

//        // Adding toppings to Cheese Burger
//        Burger3 cheeseWithLettuce = new LettuceTopping(cheeseBurger);
//        System.out.println(cheeseWithLettuce.description() + " costs: " + cheeseWithLettuce.cost());
//
//        Burger3 cheeseWithOnion = new OnionTopping(cheeseWithLettuce);
//        System.out.println(cheeseWithOnion.description() + " costs: " + cheeseWithOnion.cost());
    }
}

// pros :
// Does not voilate the Open/Closed Principle
// If else statements are avoided\
// New toppings can be added without modifying existing code

// cons :