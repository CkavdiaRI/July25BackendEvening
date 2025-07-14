package Module2.Flyweight;
import java.util.HashMap;
import java.util.Map;

// Flyweight design pattern is a structural pattern that allows sharing of objects to support a large number of similar objects efficiently ensuring that memory usage is optimized.

// When to use Flyweight Pattern?
// 1. When an application needs to support a large number of similar objects.
// 2. When the cost of creating and managing these objects is high.
// 3. When the objects share a common state or behavior, allowing them to be reused.

// Components of Flyweight Pattern:
// 1. Flyweight: The shared object that contains the common state.
// 2. Flyweight Factory: The factory that manages the creation and sharing of Flyweight objects.
// 3. Product : The unique data of each product that uses the Flyweight.

// Shared data of the product
class SoldierType4{
    String name;
    private String weapon;
    private String image;
    private int health;

    SoldierType4(String name, String weapon, String image, int health) {
        this.name = name;
        this.weapon = weapon;
        this.image = image;
        this.health = health;
    }

    public void render(int x, int y, String direction) {
        // Render the soldier on the screen
        System.out.println("Rendering soldier: " + name +
                " with weapon: " + weapon + ", image: " + image + ", health: " + health +
                " at (" + x + ", " + y + ") facing " + direction);
    }
}

// Flyweight factory to manage SoldierType4 instances
class SoldierTypeFactory {
    private static final Map<String, SoldierType4> soldierTypes = new HashMap<>();

    public static SoldierType4 getSoldierType(String name, String weapon, String image, int health) {
        String key = name + weapon + image + health;
        if (!soldierTypes.containsKey(key)) {
            soldierTypes.put(key, new SoldierType4(name, weapon, image, health));
        }
        return soldierTypes.get(key);
    }
}

// Unqiue data of each product
class Soldier4 {
    private SoldierType4 soldierType;
    private int x, y; // coordinates
    private String direction;

    public Soldier4(SoldierType4 soldierType, int x, int y, String direction) {
        this.soldierType = soldierType;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void render() {
        soldierType.render(x, y, direction);
    }
}

public class Sol4 {
    public static void main(String[] args) {
        // Create soldier types using the factory
        SoldierType4 soldierType1 = SoldierTypeFactory.getSoldierType("SoldierType1", "AK47", "SoldierImage1", 100);
        SoldierType4 soldierType2 = SoldierTypeFactory.getSoldierType("SoldierType2", "M16", "SoldierImage2", 100);
        SoldierType4 soldierType3 = SoldierTypeFactory.getSoldierType("SoldierType1", "AK47", "SoldierImage1", 100);

        Soldier4[] soldiers = new Soldier4[1000];
        for (int i = 0; i < 1000; i++) {
            int x = i * 10; // x coordinate
            int y = i * 5; // y coordinate
            String direction = (i % 2 == 0) ? "North" : "South"; // alternate directions

            // Alternate between two soldier types
            SoldierType4 soldierType = (i % 2 == 0) ? soldierType1 : soldierType2;
            soldiers[i] = new Soldier4(soldierType, x, y, direction);
            soldiers[i].render();
        }
    }
}


// Pros :
// Now since we have a factory to manage SoldierType4 instances, we can create multiple soldiers with the same type without creating duplicates.
// 1. Memory Efficiency: Shared soldier types reduce memory usage.
// 2. Performance Improvement: Rendering is faster as common properties are reused.
// 3. Reusability: Soldier types are managed by a factory, making it easy to create and reuse soldier types.
// 4. Scalability: The design can handle a larger number of soldiers without significant performance degradation.
// 5. Flexibility: New soldier types can be added easily without modifying existing code.

