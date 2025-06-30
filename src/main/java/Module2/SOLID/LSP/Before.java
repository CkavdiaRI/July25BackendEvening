package Module2.SOLID.LSP;

public class Before {

    public static class Bird{
        protected String name;
        protected String color;
        protected int age;

        public Bird(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }

        public void fly() {
            System.out.println(name + " is flying.");
        }
    }

    public static class Sparrow extends Bird {
        public Sparrow(String name, String color, int age) {
            super(name, color, age);
        }

        @Override
        public void fly() {
            System.out.println(name + " is flying high.");
        }
    }

    public static class Penguin extends Bird {
        public Penguin(String name, String color, int age) {
            super(name, color, age);
        }

        @Override
        public void fly() {
            throw new UnsupportedOperationException("Penguins cannot fly.");
        }
    }

    public static void main(String[] args) {
        Bird sp = new Sparrow("Sparrow", "Brown", 2);
        sp.fly();

        Bird pe = new Penguin("Penguin", "Blue", 1);
        pe.fly();
    }

}
