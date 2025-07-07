package Module2.Prototype.BoilerPlate;

public class Mage {
    String name;
    Weapon weapon;
    Stats stats;
    AI ai;

    public Mage(String name, Weapon weapon, Stats stats, AI ai) {
        this.name = name;
        this.weapon = weapon;
        this.stats = stats;
        this.ai = ai;
    }

    public String getInfo() {
        return "Mage: " + name + " | Weapon: " + weapon.getDetails()
                + " | Stats: " + stats.getStats()
                + " | AI: " + ai.getBehavior();
    }
}