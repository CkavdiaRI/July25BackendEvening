package Module2.Builder;

// Builder design pattern is a creational design pattern that allows for the step-by-step construction of complex objects.
// It is particularly useful when an object requires many parameters, some of which are optional.
// In this example, we will implement a Burger class using the Builder design pattern.

// Intent of the Builder Pattern:
// 1. To separate the construction of a complex object from its representation so that the same construction process can create different representations.

// Structure of the Builder Pattern:
// 1. Builder: A class that constructs the object step by step.
// 2. Product: The complex object that is being built.
// 3. Client: The class that uses the Builder to create the object.
// 4. Director (optional): A class that defines the order in which to call the builder methods. In this case, we will not use a Director class as the client will directly use the Builder.

public class Burger4 {

    // Required ingredients
    private final String bun;
    private final String patty;

    // Optional ingredients
    private final boolean hasCheese;
    private final boolean hasTomato;
    private final boolean hasLettuce;
    private final boolean hasOnion;
    private final boolean hasPickles;

    // Don't want Public constructor since we want to delegate the object creation
    //public Burger4(){}

    private Burger4(Builder builder){
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.hasCheese = builder.hasCheese;
        this.hasTomato = builder.hasTomato;
        this.hasLettuce = builder.hasLettuce;
        this.hasOnion = builder.hasOnion;
        this.hasPickles = builder.hasPickles;
    }

    // Static inner Builder class
    public static class Builder{
        // Copy all the attributes from Burger4(product) class

        // Required ingredients
        private String bun;
        private String patty;

        // Optional ingredients
        private boolean hasCheese;
        private boolean hasTomato;
        private boolean hasLettuce;
        private boolean hasOnion;
        private boolean hasPickles;

        // Builder constructor for required ingredients
        public Builder(String bun, String patty) {
            this.bun = bun;
            this.patty = patty;
        }

        // Builder methods for optional ingredients
        // Method chaining is used here to allow setting optional ingredients in a fluent style

        public Builder setHasCheese(boolean hasCheese) {
            this.hasCheese = hasCheese;
            return this;
        }
        public Builder setHasTomato(boolean hasTomato) {
            this.hasTomato = hasTomato;
            return this;
        }
        public Builder setHasLettuce(boolean hasLettuce) {
            this.hasLettuce = hasLettuce;
            return this;
        }
        public Builder setHasOnion(boolean hasOnion) {
            this.hasLettuce = hasLettuce;
            return this;
        }
        public Builder setHasPickles(boolean hasPickles) {
            this.hasPickles = hasPickles;
            return this;
        }

        // Build method to create the Burger4(Product) object
        public Burger4 build(){
            // You can add validations here before you actually build the product
            // All the validations are centralized
            if(hasPickles && !hasOnion){
                throw new IllegalArgumentException("Pickles can only be added if onion is present");
            }
            if(hasOnion && hasLettuce){
                throw new IllegalArgumentException("Onion can only be added if lettuce is not present");
            }
            if(bun == null || bun.isEmpty()){
                throw new IllegalArgumentException("Bun cannot be null or empty");
            }
            if(patty == null || patty.isEmpty()){
                throw new IllegalArgumentException("Patty cannot be null or empty");
            }

            return new Burger4(this);
        }
    }


}

class client4 {
    public static void main(String[] args) {
        // Using the Builder to create a Burger object
        Burger4.Builder builder = new Burger4.Builder("Sesame", "Veggie");
//        builder.setHasCheese(true);
//        builder.setHasTomato(true);

        Burger4 burger = new Burger4.Builder("Sesame", "Veggie")
                .setHasCheese(true)
                .setHasTomato(true)
                .build();

        Burger4 burger1 = new Burger4.Builder("Whole Wheat", "Chicken")
                .setHasLettuce(true)
                .setHasOnion(true)
                .setHasPickles(true)
                .build();

    }
}

// What about validations ?
// The Builder pattern allows for centralized validation in the build method, ensuring that the object is created in a valid state.

// What about immutability ?
// The Builder pattern can create immutable objects by using final fields and not providing setters for the fields in the Product class.

// pros :
// 1. The Builder pattern provides a clear separation between the construction of an object and its representation.
// 2. It allows for a more readable and maintainable code, especially when dealing with many optional parameters.
// 3. The Builder pattern can enforce validation rules at the time of object creation, ensuring that the object is always in a valid state.
// 4. It allows for immutability by using final fields and not providing setters for the fields in the Product class.
// 5. The Builder pattern can be easily extended to add new optional parameters without breaking existing code.
// 6. It provides a fluent interface, allowing for method chaining to set optional parameters in a readable way.


