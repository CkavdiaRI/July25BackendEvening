package Module2.SOLID.ISP;

public class After {

    // Segregated interfaces for Flyable and Danceable
    // Classes implement only the interfaces they need


    interface Flyable {
        void fly();
    }

    interface Danceable {
        void dance();
    }

    static class Sparrow implements Flyable, Danceable {
        public void fly() {
            System.out.println("Sparrow flies");
        }

        public void dance() {
            System.out.println("Sparrow dances");
        }
    }

    static class Penguin implements Danceable {
        public void dance() {
            System.out.println("Penguin dances");
        }
        // Penguins cannot fly, so no fly method
        // Pengiun class is not forced to implement fly method
    }

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.dance();

        Penguin penguin = new Penguin();
        penguin.dance();
        // penguin.fly(); // This line would cause a compile-time error since Penguin does not implement Flyable
    }
}
