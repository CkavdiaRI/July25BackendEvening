package Module2.SOLID.ISP;

public class Before {

    interface Bird {
        void fly();
        void dance();
    }

    public static class Penguin implements Bird {
        public void fly() {
            // Not applicable
            throw new UnsupportedOperationException("Penguins can't fly");
        }

        public void dance() {
            System.out.println("Penguin dances");
        }
    }

    public static void main(String[] args) {
        Bird pe = new Penguin();
        pe.dance();
        pe.fly(); // Pengiun is forced to implement fly method, which is not applicable for it
        // This will throw a runtime exception
    }
}