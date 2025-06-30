package LabSession_StreamsAndException.Assignment3;
import java.util.Arrays;
import java.util.List;

public class Sol1 {
    public static void main(String[] args) {
        List<Item> itemsList1 = Arrays.asList(
                new Item(1, "Pen", 10, 1.5),
                new Item(2, "Notebook", 5, 3.0),
                new Item(3, "Pencil", 20, 0.5)
        );

        // ✅ Task: Use reduce to find total quantity
        int totalQuantity = itemsList1
                .stream()
                .map(item -> item.getQuantity())
                .reduce(0, (totalSum, quantity) -> totalSum + quantity);

        System.out.println("Total quantity: " + totalQuantity);
    }
}
