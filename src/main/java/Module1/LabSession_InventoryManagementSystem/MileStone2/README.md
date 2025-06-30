# Milestone 2: Generic Inventory Management

**Objective:** Implement a generic inventory system for managing items.

## Tasks:

1. **Design the `Inventory<T extends Item>` Class:**
    - Use `HashMap<String, T>` to store items, where `id` is the key.

2. **Add Core Methods to Inventory:**
    - `addItem(T item)`: Add an item to the inventory.
    - `removeItem(String id)`: Remove an item by `id`.
    - `getItem(String id)`: Retrieve an item by `id`.
    - `getAllItems()`: Return all items as a `Collection<T>`.

3. **Write Tests for Inventory:**
    - Add, retrieve, and remove items.
    - Verify behavior when trying to add items with duplicate IDs.
