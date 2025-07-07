package Module2.Prototype.PrototypeDP;

public class Weapon implements Prototype<Weapon>{
    String type;
    int damage;

    public Weapon(String type, int damage) {
        simulateHeavyLoad();
        this.type = type;
        this.damage = damage;
    }

    Weapon(Weapon weapon) {
        this.type = weapon.type;
        this.damage = weapon.damage;
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

    @Override
    public Weapon clone(){
        return new Weapon(this);
    }
}
