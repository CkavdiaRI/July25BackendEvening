package Generics.utils;
import java.util.List;

public class Utility {
    // Generic method
    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    // Upper Bounded Wildcard: accepts Number or subclass
    public static void sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        System.out.println("Sum = " + sum);
    }

    // Lower Bounded Wildcard: accepts Integer or superclass
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        System.out.println("After adding integers: " + list);
    }
}
