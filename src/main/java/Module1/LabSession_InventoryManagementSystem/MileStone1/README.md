# Milestone 1: Item Class Hierarchy

**Objective:** Create a class hierarchy to represent different item types.

## Tasks:

1. **Create Base Class `Item`:**
    - Define common attributes:
        - `String id` (unique identifier).
        - `String name` (name of the item).
        - `double price` (price of the item).
        - `int quantity` (quantity in stock).
    - Implement constructors and getter/setter methods.

2. **Create Subclasses for Specific Item Types:**
    - **Electronics**: Add `int warranty` attribute.
    - **Clothing**: Add `String size` attribute.
    - **Book**: Add `String author` attribute.

3. **Implement `Comparable<Item>` Interface:**
    - Learning Resource: [Comparable Interface in Java with Examples - Scaler Topics](https://www.scaler.com/topics/comparable-interface-in-java/)
    - Write a `compareTo` method to sort items alphabetically by `price`.

4. **Write a Test Program for Subclasses:**
    - Instantiate a few items for each subclass.
    - Add them to a list and test sorting by `price`.
