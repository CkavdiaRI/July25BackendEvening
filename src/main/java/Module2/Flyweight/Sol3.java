package Module2.Flyweight;

class SoldierType3{
    String name;
    private String weapon;
    private String image;
    private int health;

    SoldierType3(String name, String weapon, String image, int health) {
        this.name = name;
        this.weapon = weapon;
        this.image = image;
        this.health = health;
    }

    public void render(int x, int y, String direction) {
        // Render the soldier on the screen
        System.out.println("Rendering soldier: " + name +
                " with weapon: " + weapon + ", image: " + image + ", health: " + health);
    }
}

class Soldier3 {
    private SoldierType3 soldierType;
    private int x, y; // coordinates
    private String direction;

    public Soldier3(SoldierType3 soldierType, int x, int y, String direction) {
        this.soldierType = soldierType;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void render() {
        soldierType.render(x, y, direction);
    }
}

public class Sol3 {
    public static void main(String[] args) {
        SoldierType3 soldierType1 = new SoldierType3("SoldierType1", "AK47", "SoldierImage1", 100);
        SoldierType3 soldierType2 = new SoldierType3("SoldierType2", "M16", "SoldierImage2", 100);

        Soldier3[] soldiers = new Soldier3[1000];
        for (int i = 0; i < 1000; i++) {
            int x = i * 10; // x coordinate
            int y = i * 5; // y coordinate
            String direction = (i % 2 == 0) ? "North" : "South"; // alternate directions

            // Alternate between two soldier types
            SoldierType3 soldierType = (i % 2 == 0) ? soldierType1 : soldierType2;
            soldiers[i] = new Soldier3(soldierType, x, y, direction);
            soldiers[i].render();
        }
    }
}

// pros :
// Divided soldier data into two classes: SoldierType3 for shared properties and Soldier3 for individual instances.
// Intrinsic data & Extrinsic data separation:
// Memory Efficiency: Soldier types are shared, reducing memory usage.
// Clear encapsulation of soldier types.

// Cons :
// 1. Duplicate soldier types can still occur, leading to potential confusion.