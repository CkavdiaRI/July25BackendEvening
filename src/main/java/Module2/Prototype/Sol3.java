package Module2.Prototype;

import Module2.Prototype.BoilerPlate.AI;
import Module2.Prototype.BoilerPlate.Stats;
import Module2.Prototype.BoilerPlate.Weapon;

class Mage1 {
    String name;
    Weapon weapon;
    Stats stats;
    AI ai;

    public Mage1(String name, Weapon weapon, Stats stats, AI ai) {
        this.name = name;
        this.weapon = weapon;
        this.stats = stats;
        this.ai = ai;
    }

    public Mage1(Mage1 original) {
        this.name = original.name;
        this.weapon = original.weapon;
        this.stats = original.stats;
        this.ai = original.ai;
    }

    public String getInfo() {
        return "Mage: " + name + " | Weapon: " + weapon.getDetails()
                + " | Stats: " + stats.getStats()
                + " | AI: " + ai.getBehavior();
    }
}

public class Sol3 {
    public static void main(String[] args) {
        Mage1 mage1 = new Mage1(
                "Jaina",
                new Weapon("Frost Staff", 80),
                new Stats(100, 200),
                new AI("Aggressive")
        );

        Mage1 mageCopy = new Mage1(mage1);

    }
}

// Cons :
// - Not a true deep copy, just a shallow copy of mutable objects
// - Changes to weapon, stats, ai affect both objects

