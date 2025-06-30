package Module2.SOLID;

public class SRP {

    // Single Responsibility Principle (SRP) states that a class should have only one reason to change.
    // This means that a class should only have one job or responsibility.

    public static class Bird{
        private String name;
        private String color;
        private int age;

        public Bird(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }

        public void fly() {
            // general flying logic
        }
    }

    public static class Sparrow extends Bird {
        public Sparrow(String name, String color, int age) {
            super(name, color, age);
        }

        @Override
        public void fly() {
            // specific flying logic for Sparrow
            System.out.println("Sparrow is flying.");
        }
    }

    public static class Eagle extends Bird {
        public Eagle(String name, String color, int age) {
            super(name, color, age);
        }

        @Override
        public void fly() {
            // specific flying logic for Eagle
            System.out.println("Eagle is soaring high.");
        }
    }

    public static class Parrot extends Bird {
        public Parrot(String name, String color, int age) {
            super(name, color, age);
        }

        @Override
        public void fly() {
            // specific flying logic for Parrot
            System.out.println("Parrot is flying with vibrant colors.");
        }
    }

    public static class Penguin extends Bird {
        public Penguin(String name, String color, int age) {
            super(name, color, age);
        }

        @Override
        public void fly() {
            // Penguins cannot fly, so we can throw an exception or print a message
            System.out.println("Penguins cannot fly.");
        }
    }

    public static void main(String[] args) {
        Bird sparrow = new Sparrow("Sparrow", "Brown", 2);
        sparrow.fly(); // Output: Sparrow is flying.

        Bird eagle = new Eagle("Eagle", "Golden", 5);
        eagle.fly(); // Output: Eagle is soaring high.

        Bird parrot = new Parrot("Parrot", "Green", 3);
        parrot.fly(); // Output: Parrot is flying with vibrant colors.
    }

    // How to spot SRP violations:
    // 1. If a class has multiple methods that are not related to each other, it may be a sign of SRP violation.
    // 2. Multiple if else statements in a method
    // 3. Monster methods -> methods that are too long and do too many things.

}
