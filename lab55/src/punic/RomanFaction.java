package punic;

// Римская фракция
public class RomanFaction implements Faction {
    @Override
    public String getName() {
        return "Roman Faction";
    }

    @Override
    public int getBonusStrength() {
        return 10; // Бонус к силе для римской фракции
    }
}

