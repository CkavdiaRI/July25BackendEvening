package Module2.Builder;


// Option1 : Single constructor with many parameters
// This approach is not recommended due to its complexity and potential for errors.

public class Burger {

    // Required ingredients
    private String bun;
    private String patty;

    // Optional ingredients
    private boolean hasCheese;
    private boolean hasTomato;
    private boolean hasLettuce;
    private boolean hasOnion;
    private boolean hasPickles;

    Burger(String bun, String patty, boolean cheese, boolean sauce, boolean lettuce, boolean tomato, boolean onion, boolean pickles) {
        this.bun = bun;
        this.patty = patty;
        this.hasCheese = cheese;
        this.hasTomato = tomato;
        this.hasLettuce = lettuce;
        this.hasOnion = onion;
        this.hasPickles = pickles;
    }

}

class Client{
    public static void main(String[] args) {
        Burger burger = new Burger("Sesame", "Veggie", true, false, true, true, false, true);

        Burger burger2 = new Burger("", "Veggie", true, false, true, true, false, true);
    }
}

// Cons :
// 1. The constructor is too long and complex, making it hard to read and maintain.
// 2. Need to lookup the order of parameters to understand what each parameter means.
// 3. Error prone: if you pass parameters in the wrong order, it can lead to bugs that are hard to trace.
// 4. Able to create a burger without required ingredients (e.g., bun or patty), which is not valid. Missing validation for required ingredients.
