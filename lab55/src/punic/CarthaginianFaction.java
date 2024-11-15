package punic;

// Карфагенская фракция
public class CarthaginianFaction implements Faction {
    @Override
    public String getName() {
        return "Carthaginian Faction";
    }

    @Override
    public int getBonusStrength() {
        return 5; // Бонус к силе для карфагенской фракции
    }
}
