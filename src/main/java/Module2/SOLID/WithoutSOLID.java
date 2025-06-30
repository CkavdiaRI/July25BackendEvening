package Module2.SOLID;

public class WithoutSOLID {

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
            // Logic for flying
            if(name == "Piegon"){
                System.out.println(name + " is flying.");
            } else if(name == "Parrot") {
                System.out.println(name + " is flying.");
            } else if(name == "Sparrow") {
                System.out.println(name + " is flying.");
            } else if(name == "Eagle") {
                System.out.println(name + " is flying.");
            } else if(name == "Penguin") {
                System.out.println(name + " cannot fly.");
            } else if (name == "Ostrich") {
                System.out.println(name + " cannot fly.");
            } else {
                System.out.println(name + " is not a recognized bird.");
            }
        }

    }

    public static void main(String[] args) {
        //
    }

}
