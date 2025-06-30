# 📦 Inventory Management System — Custom Exceptions in Java

## 🎯 Custom Exceptions
Create custom exceptions for the inventory management system to handle specific error scenarios.

## ✅ Task Breakdown

### ✅ Task 1: Define `DuplicateItemException`

- Create a custom exception named `DuplicateItemException`.
- It must be thrown when an item is added that already exists in the inventory.

### ✅ Task 2: Define `InvalidQuantityException`

- Create another custom exception named `InvalidQuantityException`.
- It must be thrown when an item is added with a **negative or invalid quantity**.

### ✅ Task 3: Implement `Inventory`

Create a class named `Inventory` that supports the following:

- Add items to the inventory.
- Before adding:
    - Check for duplicate items. If found, throw `DuplicateItemException`.
    - Check for invalid quantity (e.g., negative values). If found, throw `InvalidQuantityException`.

---