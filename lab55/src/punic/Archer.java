package punic;

public class Archer implements Warrior {
    private final int strength = 50;
    private final int agility = 70;
    private final int speed = 60;
    private Faction faction;

    // Конструктор с параметром Faction
    public Archer(Faction faction) {
        this.faction = faction;
    }

    @Override
    public void info() {
        System.out.println("Archer from " + faction.getName());
    }

    @Override
    public int getStrength() {
        return strength + faction.getBonusStrength();
    }

    @Override
    public int getAgility() {
        return agility;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public Warrior clone() {
        try {
            return (Warrior) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public Faction getFaction() {
        return faction;
    }
}
