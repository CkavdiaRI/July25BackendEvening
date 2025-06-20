package StreamsAndLambdas.FunctionalInterfaces;

@FunctionalInterface
public interface Calculator {
    int operation(int a, int b);
//    int operation2(int a, int b);

    // Optional: Default method for demonstration
    default void showUsage() {
        System.out.println("This is a functional interface for math operations.");
    }
}
