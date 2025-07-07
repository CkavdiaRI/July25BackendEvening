package Module2.Prototype;

class Weapon2 {
    String type;
    int damage;

    public Weapon2(String type, int damage) {
        simulateHeavyLoad(); // required only during first object creation
        this.type = type;
        this.damage = damage;
    }

    Weapon2(Weapon2 original) {
        this.type = original.type;
        this.damage = original.damage;
    }

    private void simulateHeavyLoad() {
        try {
            System.out.println("Loading heavy weapon data from disk...");
            Thread.sleep(1000); // simulate disk IO
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getDetails() {
        return type + " (" + damage + " dmg)";
    }
}

class Stats2 {
    int health;
    int mana;

    public Stats2(int health, int mana) {
        this.health = health;
        this.mana = mana;
    }

    Stats2(Stats2 original) {
        this.health = original.health;
        this.mana = original.mana;
    }

    public String getStats() {
        return "HP: " + health + ", Mana: " + mana;
    }
}

class AI2 {
    String behavior;

    public AI2(String behavior) {
        simulateLoad();
        this.behavior = behavior;
    }

    AI2(AI2 original) {
        this.behavior = original.behavior;
    }

    private void simulateLoad() {
        try {
            System.out.println("Configuring AI engine...");
            Thread.sleep(1000); // simulate setup
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getBehavior() {
        return behavior;
    }
}

class Mage2 {
    String name;
    Weapon2 weapon;
    Stats2 stats;
    AI2 ai;

    public Mage2(String name, Weapon2 weapon, Stats2 stats, AI2 ai) {
        this.name = name;
        this.weapon = weapon;
        this.stats = stats;
        this.ai = ai;
    }

    Mage2(Mage2 original) {
        this.name = original.name;
        this.weapon = new Weapon2(original.weapon);
        this.stats = new Stats2(original.stats);
        this.ai = new AI2(original.ai);
    }

    public String getInfo() {
        return "Mage: " + name + " | Weapon: " + weapon.getDetails()
                + " | Stats: " + stats.getStats()
                + " | AI: " + ai.getBehavior();
    }
}

public class Sol4 {
    public static void main(String[] args) {
        Mage2 mage= new Mage2(
                "Gandalf",
                new Weapon2("Staff", 50),
                new Stats2(100, 200),
                new AI2("Aggressive")
        );

        Mage2 mageCopy = new Mage2(mage); // Deep copy using copy constructor
    }
}

// Cons :
// - More complex to implement



