package LabSession_StreamsAndException.Assignment1;
import java.util.*;
import java.util.stream.*;

public class Sol {

    public static void main(String[] args) {
        List<Item> itemsList1 = List.of(
                new Item("I1", "Laptop", 1500, 3),
                new Item("I2", "Tablet", 900, 5),
                new Item("I3", "Monitor", 1100, 0),
                new Item("I4", "Mouse", 300, 15),
                new Item("I5", "Keyboard", 450, 10),
                new Item("I6", "Laptop", 1500, 2),
                new Item("I7", "Printer", 1200, 4),
                new Item("I8", "Desk", 2000, 1)
        );

        // Task 1.1: Print all item IDs
        System.out.println("All item IDs:");
        itemsList1.stream()
                .map(Item::getId)
                .forEach(System.out::println);

        // Task 1.2: Create list of lowercase item names
        List<String> lowercaseNames = itemsList1.stream()
                .map(item -> item.getName().toLowerCase())
                .collect(Collectors.toList());
        System.out.println("\nLowercase item names:");
        System.out.println(lowercaseNames);

        // Task 1.3: Lengths of item names
        List<Integer> nameLengths = itemsList1.stream()
                .map(item -> item.getName().length())
                .collect(Collectors.toList());
        System.out.println("\nLengths of item names:");
        System.out.println(nameLengths);

        // Task 2.1: Items priced above 1000
        System.out.println("\nItems priced above 1000:");
        itemsList1.stream()
                .filter(item -> item.getPrice() > 1000)
                .forEach(item -> System.out.println(item.getName()));

        // Task 2.2: Check if any item has quantity 0
        boolean isItemOutOfStock = itemsList1.stream()
                .anyMatch(item -> item.getQuantity() == 0);
        System.out.println("\nAny item out of stock? " + isItemOutOfStock);

        // Task 2.3: Check if all items have price > 0
        boolean allItemsPriced = itemsList1.stream()
                .allMatch(item -> item.getPrice() > 0);
        System.out.println("All items priced above 0? " + allItemsPriced);

        // Task 2.4: Check if no item has negative quantity
        boolean noNegativeQuantity = itemsList1.stream()
                .noneMatch(item -> item.getQuantity() < 0);
        System.out.println("No item has negative quantity? " + noNegativeQuantity);

        // Task 3: Combined stream operations
        List<String> finalList = itemsList1.stream()
                .filter(item -> item.getPrice() > 1000 && item.getQuantity() > 0)
                .map(Item::getName)
                .distinct()
                .sorted()
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("\nTop 5 distinct item names (price > 1000 & quantity > 0):");
        System.out.println(finalList);
    }
}
