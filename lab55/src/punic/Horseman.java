package punic;

public class Horseman implements Warrior {
    private final int strength = 100;
    private final int agility = 60;
    private final int speed = 90;
    private Faction faction;

    // Конструктор с параметром Faction
    public Horseman(Faction faction) {
        this.faction = faction;
    }

    @Override
    public void info() {
        System.out.println("Horseman from " + faction.getName());
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
