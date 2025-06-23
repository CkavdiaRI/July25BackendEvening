## 📌 Assignment Tasks

### 🛠️ Instructions

- Use Java **Stream API** methods to solve the following tasks.
- You may Google **individual methods** like `map()`, `filter()`, etc., but **do not** search for complete solutions.
- Write clean and readable code with appropriate use of functional operations.

---

### 🔹 Task 1: Stream Basics & Transformations

1. **Print all item IDs**
    - Use `map()` to extract the ID from each item.
    - Use `forEach()` to print the IDs.

2. **Print item names in lowercase**
    - Use `map()` to convert each item’s name to lowercase.
    - Use `collect()` to gather the names into a list and print it.

3. **Print lengths of all item names**
    - Use `map()` to convert each item’s name to its length (i.e., `name.length()`).
    - Collect the result into a list and print it.

---

### 🔹 Task 2: Filtering & Matching

1. **Print names of items priced above 1000**
    - Use `filter()` to keep items where `price > 1000`.
    - Use `forEach()` to print the names.

2. **Check if any item is out of stock**
    - Use `anyMatch()` to check if any item has `quantity == 0`.

3. **Verify all items have price greater than 0**
    - Use `allMatch()` to ensure all items have `price > 0`.

4. **Ensure no item has a negative quantity**
    - Use `noneMatch()` to verify that `quantity < 0` is false for all.

---

### 🔹 Task 3: Combined Stream Operations

Use a **single stream pipeline** to:

- Filter items where:
    - `price > 1000`
    - `quantity > 0`
- Extract the `name` field of each item.
- Remove duplicates using `distinct()`.
- Sort the names alphabetically using `sorted()`.
- Limit to the **top 5** names using `limit()`.
- Collect the result into a list and print it.

---
