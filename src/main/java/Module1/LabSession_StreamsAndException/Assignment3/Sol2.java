package Module1.LabSession_StreamsAndException.Assignment3;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Sol2 {
    public static void main(String[] args) {
        List<Item> itemsList1 = Arrays.asList(
                new Item(1, "Pen", 10, 1.5),
                new Item(2, "Notebook", 5, 3.0),
                new Item(3, "Pencil", 20, 0.5)
        );

        // ✅ Task: Use reduce to find the item with the highest price
        Optional<Item> mostExpensive = itemsList1
                .stream()
                .reduce((item1, item2) -> item1.getPrice() > item2.getPrice() ? item1 : item2);

        if (mostExpensive.isPresent()) {
            System.out.println("Most expensive item: " + mostExpensive.get().getName());
        } else {
            System.out.println("No items found.");
        }
    }
}
