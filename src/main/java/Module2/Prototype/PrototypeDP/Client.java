package Module2.Prototype.PrototypeDP;

// prototype design pattern


public class Client {
    public static void main(String[] args) {
        Mage mage1 = new Mage(
                "Jaina",
                new Weapon("Frost Staff", 80),
                new Stats(100, 200),
                new AI("Aggressive")
        );

        Mage magecopy = mage1.clone(); // create a new object using the clone method
        magecopy.setName("Jayesh");

        FireMage fireMage = new FireMage(
                "Kael",
                new Weapon("Fire Staff", 90),
                new Stats(120, 220),
                new AI("Defensive"),
                100
        );

        Mage fireMageCopy = fireMage.clone();
    }
}
