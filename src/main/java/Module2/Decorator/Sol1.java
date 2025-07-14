package Module2.Decorator;

abstract class Burger {
    public abstract String description();
    public abstract double cost();
}

// Base burgers

class VeggieBurger extends Burger {
    @Override
    public String description() {
        return "Veggie Burger";
    }

    @Override
    public double cost() {
        return 50.00;
    }
}

class CheeseBurger extends Burger {
    @Override
    public String description() {
        return "Cheese Burger";
    }

    @Override
    public double cost() {
        return 70.00;
    }
}

// Toppings :
// Extra cheese, tomato, lettuce, onion, dip

class VeggieBurgerWithExtraCheese extends VeggieBurger{
    private Burger burger;

    public VeggieBurgerWithExtraCheese(Burger burger) {
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

class VeggieBurgerWithTomato extends VeggieBurger{
    private Burger burger;

    public VeggieBurgerWithTomato(Burger burger) {
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

class VeggieBurgerWithExtraCheeseAndTomato extends VeggieBurger{
    private Burger burger;

    public VeggieBurgerWithExtraCheeseAndTomato(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String description() {
        return burger.description() + ", Extra Cheese, Tomato";
    }

    @Override
    public double cost() {
        return burger.cost() + 20.00 + 10.00;
    }
}

public class Sol1 {
    public static void main(String[] args) {
        Burger veggieBurger = new VeggieBurger();
        System.out.println(veggieBurger.description() + " costs: " + veggieBurger.cost());

        Burger cheeseBurger = new CheeseBurger();
        System.out.println(cheeseBurger.description() + " costs: " + cheeseBurger.cost());

        Burger veggieBurgerWithExtraCheese = new VeggieBurgerWithExtraCheese(veggieBurger);
        System.out.println(veggieBurgerWithExtraCheese.description() + " costs: " + veggieBurgerWithExtraCheese.cost());

        Burger veggieBurgerWithTomato = new VeggieBurgerWithTomato(veggieBurger);
        System.out.println(veggieBurgerWithTomato.description() + " costs: " + veggieBurgerWithTomato.cost());

        Burger veggieBurgerWithExtraCheeseAndTomato = new VeggieBurgerWithExtraCheeseAndTomato(veggieBurger);
        System.out.println(veggieBurgerWithExtraCheeseAndTomato.description() + " costs: " + veggieBurgerWithExtraCheeseAndTomato.cost());
    }
}

// Cons :
// Class explosion, as each combination of toppings requires a new class.

// Pros :
// Easy to understand
// Okay for small number of toppings

