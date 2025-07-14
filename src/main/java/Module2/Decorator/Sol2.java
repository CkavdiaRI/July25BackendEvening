package Module2.Decorator;

abstract class Burger2 {
    public abstract String description();
    public abstract double cost();
}

// Base burgers
class VeggieBurger2 extends Burger2 {
    private boolean extraCheese = false;
    private boolean tomato = false;
    private boolean lettuce = false;
    private boolean onion = false;

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    @Override
    public String description() {
        String base =  "Veggie Burger";
        if (extraCheese) {
            base += ", Extra Cheese";
        }
        if (tomato) {
            base += ", Tomato";
        }
        if (lettuce) {
            base += ", Lettuce";
        }
        if (onion) {
            base += ", Onion";
        }
        return base;
    }

    @Override
    public double cost() {
        double base =  50.00;
        if (extraCheese) {
            base += 20.00;
        }
        if (tomato) {
            base += 10.00;
        }
        if (lettuce) {
            base += 5.00;
        }
        if (onion) {
            base += 5.00;
        }
        return base;
    }
}

class CheeseBurger2 extends Burger2 {
    private boolean extraCheese = false;
    private boolean tomato = false;
    private boolean lettuce = false;
    private boolean onion = false;

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    @Override
    public String description() {
        String base =  "Cheese Burger";
        if (extraCheese) {
            base += ", Extra Cheese";
        }
        if (tomato) {
            base += ", Tomato";
        }
        if (lettuce) {
            base += ", Lettuce";
        }
        if (onion) {
            base += ", Onion";
        }
        return base;
    }

    @Override
    public double cost() {
        double base =  50.00;
        if (extraCheese) {
            base += 20.00;
        }
        if (tomato) {
            base += 10.00;
        }
        if (lettuce) {
            base += 5.00;
        }
        if (onion) {
            base += 5.00;
        }
        return base;
    }
}

public class Sol2 {
    public static void main(String[] args) {
        Burger2 veggieBurger = new VeggieBurger2();
        ((VeggieBurger2) veggieBurger).setExtraCheese(true);
        ((VeggieBurger2) veggieBurger).setTomato(true);
        System.out.println(veggieBurger.description() + " costs: " + veggieBurger.cost());

        Burger2 cheeseBurger = new CheeseBurger2();
        ((CheeseBurger2) cheeseBurger).setLettuce(true);
        ((CheeseBurger2) cheeseBurger).setOnion(true);
        System.out.println(cheeseBurger.description() + " costs: " + cheeseBurger.cost());
    }
}


// Pros :
// No more class explosion
// We can choose topping dynamically

//Cons :
// Too many if-else statements
// Hard to maintain
// Hard to extend
// Voilates OCP