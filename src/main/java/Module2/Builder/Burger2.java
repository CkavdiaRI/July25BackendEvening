package Module2.Builder;

// Multiple constructors example
public class Burger2 {
    // Required ingredients
    private String bun;
    private String patty;

    // Optional ingredients
    private boolean hasCheese;
    private boolean hasTomato;
    private boolean hasLettuce;
    private boolean hasOnion;
    private boolean hasPickles;

    Burger2(String bun, String patty) {
        this.bun = bun;
        this.patty = patty;
    }

    Burger2(String bun, String patty, boolean hasCheese){
        this(bun, patty);
        this.hasCheese = hasCheese;
    }

    // Not allowed since function signature is same as above
//    Burger2(String bun, String patty, boolean hasTomato){
//        this(bun, patty);
//        this.hasTomato = hasTomato;
//    }

    // Changed the signature here to include hasTomato
    // But this is not scalable as we add more optional ingredients
    Burger2(String bun, boolean hasTomato, String patty){
        this(bun, patty);
        this.hasTomato = hasTomato;
    }

    Burger2(String bun, String patty, boolean hasCheese, boolean hasTomato){
        this(bun, patty, hasCheese);
        this.hasTomato = hasTomato;
    }

    Burger2(String bun, String patty, boolean hasCheese, boolean hasTomato, boolean hasLettuce){
        this(bun, patty, hasCheese, hasTomato);
        this.hasLettuce = hasLettuce;
    }

    Burger2(String bun, String patty, boolean hasCheese, boolean hasTomato, boolean hasLettuce, boolean hasOnion){
        this(bun, patty, hasCheese, hasTomato, hasLettuce);
        this.hasOnion = hasOnion;
    }
}

class client2{
    public static void main(String[] args) {
        // Creating a burger with required ingredients only
        Burger2 burger = new Burger2("", "Veggie");
    }
}

// Cons :
// 1. Still complex with multiple constructors, leading to potential confusion.
// 2. Not scalable: As more optional ingredients are added, the number of constructors increases exponentially.
// 3. Still error-prone: If you forget to call a constructor with required ingredients, it can lead to invalid states.
// 4. No validation for required ingredients, allowing creation of burgers without essential components like bun or patty.

