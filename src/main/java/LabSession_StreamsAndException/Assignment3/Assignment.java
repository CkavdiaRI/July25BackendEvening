package LabSession_StreamsAndException.Assignment3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Assignment3: Contains Task1, Task2, Task3 using Stream.reduce()
 */
public class Assignment {

    /**
     * Task 1:
     * Use reduce() to calculate the total quantity of all items.
     */
    public static class Task1 {
        public static void main(String[] args) {
            List<Item> itemsList1 = Arrays.asList(
                    new Item(1, "Pen", 10, 1.5),
                    new Item(2, "Notebook", 5, 3.0),
                    new Item(3, "Pencil", 20, 0.5)
            );

            // TODO: Use reduce to calculate total quantity
            // int totalQuantity = ...

            // System.out.println("Total quantity: " + totalQuantity);
        }
    }

    /**
     * Task 2:
     * Use reduce() to find the item with the highest price.
     */
    public static class Task2 {
        public static void main(String[] args) {
            List<Item> itemsList1 = Arrays.asList(
                    new Item(1, "Pen", 10, 1.5),
                    new Item(2, "Notebook", 5, 3.0),
                    new Item(3, "Pencil", 20, 0.5)
            );

            // TODO: Use reduce to find the item with the highest price
            // Optional<Item> mostExpensive = ...

            // if (mostExpensive.isPresent()) {
            //     System.out.println("Most expensive item: " + mostExpensive.get().getName());
            // } else {
            //     System.out.println("No items found.");
            // }
        }
    }

    /**
     * Task 3:
     * Use reduce() to concatenate all item names into a single string.
     */
    public static class Task3 {
        public static void main(String[] args) {
            List<Item> itemsList1 = Arrays.asList(
                    new Item(1, "Pen", 10, 1.5),
                    new Item(2, "Notebook", 5, 3.0),
                    new Item(3, "Pencil", 20, 0.5)
            );

            // TODO: Use reduce to concatenate item names
            // Optional<String> concatenatedNames = ...

            // if (concatenatedNames.isPresent()) {
            //     System.out.println("All item names: " + concatenatedNames.get());
            // } else {
            //     System.out.println("No items to concatenate.");
            // }
        }
    }
}
