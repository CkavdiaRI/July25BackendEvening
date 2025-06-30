package Module1.StreamsAndLambdas.Lambdas;

/**
 * Entry point to run the demo.
 */
public class LambdaDemoClient {
    public static void main(String[] args) {
        System.out.println("\n=== Custom Functional Interface Demo ===");
        MyFunctionalInterface greet = () -> System.out.println("Hello from MyFunctionalInterface!");
        greet.perform();

        System.out.println("=== Lambda Edge Cases (Beginner Version) ===");
        LambdaEdgeCases.edgeCases();
    }
}