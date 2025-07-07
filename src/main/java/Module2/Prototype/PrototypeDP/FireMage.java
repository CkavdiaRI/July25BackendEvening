package Module2.Prototype.PrototypeDP;

// // Handled inheritance here
// Child classes need to implement clone method

public class FireMage extends Mage{
    int flamePower;

    public FireMage(String name, Weapon weapon, Stats stats, AI ai, int flamePower) {
        super(name, weapon, stats, ai);
        this.flamePower = flamePower;
    }

    public FireMage(FireMage fireMage) {
        super(fireMage);
        this.flamePower = fireMage.flamePower;
    }

    @Override
    public FireMage clone() {
        // Create a new instance of FireMage with the same properties
        return new FireMage(this);
    }

    public int getFlamePower() {
        return flamePower;
    }
    public void setFlamePower(int flamePower) {
        this.flamePower = flamePower;
    }

}


// Handled inheritance also
// All the child classed need to implement clone method