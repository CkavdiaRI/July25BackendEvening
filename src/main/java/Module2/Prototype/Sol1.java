package Module2.Prototype;

import Module2.Prototype.BoilerPlate.AI;
import Module2.Prototype.BoilerPlate.Mage;
import Module2.Prototype.BoilerPlate.Stats;
import Module2.Prototype.BoilerPlate.Weapon;

public class Sol1 {
    public static void main(String[] args) {
        Mage mage = new Mage(
                "Jaina",
                new Weapon("Frost Staff", 80),
                new Stats(100, 200),
                new AI("Aggressive")
        );

        Mage magecopy = mage; // same reference
    }
}

// Cons :
// - No new object created, just a reference copy
// - Changes to magecopy will affect mage (and vice versa)

