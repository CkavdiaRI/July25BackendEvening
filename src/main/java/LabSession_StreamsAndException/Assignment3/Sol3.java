package LabSession_StreamsAndException.Assignment3;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Sol3 {
    public static void main(String[] args) {
        List<Item> itemsList1 = Arrays.asList(
                new Item(1, "Pen", 10, 1.5),
                new Item(2, "Notebook", 5, 3.0),
                new Item(3, "Pencil", 20, 0.5)
        );

        // ✅ Task: Use reduce to concatenate item names
        Optional<String> concatenatedNames = itemsList1
                .stream()
                .map(Item::getName)
                .reduce((concatedString, name) -> concatedString + ", " + name);

        if (concatenatedNames.isPresent()) {
            System.out.println("All item names: " + concatenatedNames.get());
        } else {
            System.out.println("No items to concatenate.");
        }
    }
}
