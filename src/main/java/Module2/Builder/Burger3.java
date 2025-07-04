package Module2.Builder;

// Option3 : Using getters and setters
public class Burger3 {

    // Required ingredients
    private final String bun;
    private final String patty;

    // Optional ingredients
    //private final boolean hasCheese = false;
    private boolean hasCheese = false;
    private boolean hasTomato = false;
    private boolean hasLettuce = false;
    private boolean hasOnion = false;
    private boolean hasPickles = false;

    // Constructor for required ingredients
    // Now user can create a burger only if they provide required ingredients
    Burger3(String bun, String patty){
        this.bun = bun;
        this.patty = patty;
    }

//    void setBun(String bun) {
//        this.bun = bun;
//    }
//    void setPatty(String patty) {
//        this.patty = patty;
//    }
    void setHasCheese(boolean hasCheese) {
        this.hasCheese = hasCheese;
    }
    void setHasTomato(boolean hasTomato) {
        this.hasTomato = hasTomato;
    }
    void setHasLettuce(boolean hasLettuce) {
        this.hasLettuce = hasLettuce;
    }
    void setHasOnion(boolean hasOnion) {
        if(!hasLettuce){
            this.hasOnion = hasOnion;
        }else{
            throw new IllegalArgumentException("Onion can only be added if lettuce is not present");
        }

    }
    void setHasPickles(boolean hasPickles) {
        if(hasOnion){
            this.hasPickles = hasPickles;
        }else{
            throw new IllegalArgumentException("Pickles can only be added if onion is present");
        }
    }

}

class Client3 {
    public static void main(String[] args) {
        Burger3 burger = new Burger3("Sesame", "Veggie");
        burger.setHasCheese(true);
        burger.setHasLettuce(true);
        burger.setHasPickles(true);
        //burger.setBun("Wheat"); // Changing the bun after creation
        burger.setHasCheese(false);// Mutable attribute // Not a desired behavior

        Burger3 burger2 = new Burger3("Sesame", "Veggie");
        burger.setHasCheese(true);

        Burger3 burger3 = new Burger3("", "Veggie");
        burger.setHasCheese(true);

        // This approach is more readable and maintainable, but still not ideal for required ingredients.
    }
}


// Cons :
// 1. No validation for required ingredients, so you can create a burger by passing null or empty values for required ingredients.
// 2. Even if I include validations, they are not enforced at the time of object creation, wasting time and resources.
// 3. Validations are not centralized, leading to potential inconsistencies if not handled properly.
// 4. The use of setters allows for changing the state of the object after creation, which can lead to unexpected behavior.

// 3. Attributes are mutable, which can lead to bugs if the state is changed unexpectedly.