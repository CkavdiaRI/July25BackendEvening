package Module2.Prototype.PrototypeDP;

public class Stats implements Prototype<Stats>{
    private int health;
    private int mana;

    public Stats(int health, int mana) {
        this.health = health;
        this.mana = mana;
    }

    public Stats(Stats stats) {
        this.health = stats.health;
        this.mana = stats.mana;
    }

    public String getStats() {
        return "HP: " + health + ", Mana: " + mana;
    }

    @Override
    public Stats clone() {
        // Create a new instance of Stats with the same properties
        return new Stats(this);
    }
}
